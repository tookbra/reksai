package org.okboom.reksai.dht.metadata.handler;

import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.NumberUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.metadata.api.domain.Metadata;
import org.okboom.reksai.dht.metadata.common.Constant;
import org.okboom.reksai.dht.metadata.stream.MetadataStreams;
import org.okboom.reksai.dht.metadata.util.TorrentUtil;
import org.okboom.reksai.dht.node.api.domain.InfoHash;
import org.okboom.reksai.dht.node.stream.InfoHashStreams;
import org.okboom.reksai.tool.bencode.BencodingUtils;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;


/**
 * BEP-0009
 * http://www.bittorrent.org/beps/bep_0009.html
 * @author tookbra
 */
@Slf4j
public class MetadataHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private byte[] infoHash;
    private byte[] peerId;
    private boolean handShake = false;
    private ByteBuf byteBuf = Unpooled.buffer(0);

    /**
     * extended message ID
     */
    private int utMetadata;
    private int metadataSize;
    private int pieces;
    private byte[] metadata;
    private int nextSize;

    private MetadataStreams metadataStreams;

    public MetadataHandler(byte[] peerId, byte[] infoHash, MetadataStreams metadataStreams) {
        this.peerId = peerId;
        this.infoHash = infoHash;
        this.metadataStreams = metadataStreams;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        ByteBuf buffer = msg.copy();
        byte[] bytes = new byte[buffer.readableBytes()];

        buffer.readBytes(bytes);
        log.info("readBytes: {}", Arrays.toString(bytes));
        byteBuf.writeBytes(bytes);
        if(!handShake) {
            handShake(ctx, byteBuf);
        } else {
            while(true) {
                if(byteBuf.readableBytes() < nextSize) {
                    ctx.fireChannelReadComplete();
                    break;
                }
                byte[] messageBytes = new byte[nextSize];
                byteBuf.readBytes(messageBytes);
                log.info("messageBytes:{}", messageBytes);
                ByteBuf message = Unpooled.copiedBuffer(messageBytes);
                if(nextSize == 4) {
                    int length = message.readInt();
                    if(length > 0) {
                        nextSize = length;
                        continue;
                    }
                } else {
                    byte idMessage = message.readByte();
                    log.info("idMessage:{}", idMessage);
                    nextSize = 4;
                    if (idMessage == Constant.BT_MSG_ID) {
                        resolveExtendMessage(ctx, message);
                        break;
                    }
                }
            }
        }

    }

    /**
     * 解析握手协议
     * @param ctx
     * @param buffer
     */
    private void handShake(ChannelHandlerContext ctx, ByteBuf buffer) {
        log.info("handShake:{}", handShake);
        int pstrLen = buffer.readByte();
        if(pstrLen != Constant.PSTR_LEN) {
            return;
        }

        String protocol = buffer.readBytes(pstrLen).toString(Charset.defaultCharset());
        log.info("protocol:{}", protocol);

        byte[] handshake = new byte[8];
        buffer.readBytes(handshake);
//        if (handshake[5] == 0x10) {
            byte[] targetInfoHash = new byte[20];
            buffer.readBytes(targetInfoHash);

            byte[] targetPeerId = new byte[20];
            byteBuf.readBytes(targetPeerId);
            if (!Arrays.equals(targetInfoHash, infoHash)) {
                log.error("remote peer don't support download metadata.");
                ctx.fireChannelInactive();
            } else {
                handShake = true;
                nextSize = 4;
                sendExtHandShake(ctx, Constant.EXT_HANDSHAKE_ID, Constant.EXT_HANDSHAKE_DATA);
            }
//        } else {
//            log.error("remote peer don't support download metadata.");
//            ctx.fireChannelInactive();
//        }
    }

    private void resolveExtendMessage(ChannelHandlerContext ctx, ByteBuf buffer) {
        byte b = buffer.readByte();
        if (b == 0) {
            buffer.discardReadBytes();
            resolveExtendHandShake(ctx, BencodingUtils.decode(buffer.array()));
        } else {
            resolvePiece(ctx, buffer);
        }
    }

    private void resolvePiece(ChannelHandlerContext ctx, ByteBuf buffer) {
        byte [] bytes = new byte[buffer.readableBytes()];
        buffer.readBytes(bytes);
        String str = new String(bytes, StandardCharsets.ISO_8859_1);
        int pos = str.indexOf("ee") + 2;
        byte[] pieceMetadata = Arrays.copyOfRange(bytes, pos, bytes.length);

        Map map = BencodingUtils.decode(str.substring(0, pos).getBytes(StandardCharsets.ISO_8859_1));

        int piece = ((BigInteger) map.get("piece")).intValue();
        System.arraycopy(pieceMetadata, 0, this.metadata, piece * 16 * 1024, pieceMetadata.length);

        pieces--;

        checkFinished(ctx);
    }

    private void checkFinished(ChannelHandlerContext ctx) {
        if (pieces <= 0) {
            if (metadata[0] == 'd') {
                log.info("metadata:{}", Arrays.toString(metadata));
                log.info("metadata:{}", HexUtil.encodeHexStr(metadata));
                Map map = BencodingUtils.decode(metadata);
                if (map != null) {
                    Metadata Metadata = TorrentUtil.parseTorrent(infoHash, map);
                    log.info("Metadata:{}", Metadata.toString());
                    // 发送消息
                    if(null != metadataStreams) {
                        metadataStreams.messageChannel().send(MessageBuilder.withPayload(metadata)
                                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                                .build());
                    }
                    ctx.close();
                }
            }
        }
    }

    /**
     * 判断是否支持BEP-009协议
     * @param ctx
     * @param map
     */
    private void resolveExtendHandShake(ChannelHandlerContext ctx, Map map) {
        Map m = (Map<String, Object>) map.get("m");

        if (m == null || !m.containsKey(Constant.UT_METADATA) || !map.containsKey(Constant.METADATA_SIZE)) {
            return;
        }
        this.utMetadata = ((BigInteger) m.get(Constant.UT_METADATA)).intValue();
        this.metadataSize = ((BigInteger) map.get(Constant.METADATA_SIZE)).intValue();

        if (this.metadataSize > Constant.MAX_METADATA_SIZE) {
            return;
        }

        requestPieces(ctx);
    }

    /**
     * BEP-009协议 种子文件的metadata会按16KB分成若干块，除最后一块每一块的大小都是16KB
     * @param ctx
     */
    private void requestPieces(ChannelHandlerContext ctx) {

        metadata = new byte[this.metadataSize];

        // 16块 每块1024
        pieces = (int) Math.ceil(this.metadataSize / (16.0 * 1024));

        int temp = pieces;
        for (int piece = 0; piece < temp; piece++) {
            requestPiece(ctx, piece);
        }
    }

    private void requestPiece(ChannelHandlerContext ctx, int piece) {
        Map<String, Object> map = new HashMap(16);
        map.put("msg_type", 0);
        map.put("piece", piece);

        byte[] data = BencodingUtils.encode(map);

        send(ctx, this.utMetadata, data);
    }

    /**
     *
     * @param ctx
     */
    private void sendExtHandShake(ChannelHandlerContext ctx, int id, byte[] data) {
        send(ctx, id, data);
    }

    /**
     *
     * @param ctx
     * @param id
     * @param data
     */
    private void send(ChannelHandlerContext ctx, int id, byte[] data) {
        byte[] lengthPrefix = NumberUtil.toBytes(data.length + 2);
        for(int i = 0; i < 4; i++) {
            lengthPrefix[i] = (byte) (lengthPrefix[i] & 0xff);
        }

        ByteBuf buffer = Unpooled.buffer(2 + lengthPrefix.length + data.length);
        buffer.writeBytes(lengthPrefix);
        // bittorrent message ID, = 20
        buffer.writeByte(Constant.BT_MSG_ID);
        // extended message ID. 0 = handshake, >0 = extended message as specified by the handshake.
        buffer.writeByte(id & 0xff);
        buffer.writeBytes(data);
        ctx.channel().writeAndFlush(buffer);
    }

    /**
     * 建立连接
     * 第一个字节：BT协议名称的长度
     * 第一个字节后面紧跟着BT协议名称的byte[]
     * 最后是固定48个字节，分为三部分：
     * ① 8个保留字节，其中第6个字节填0x10，表示本地支持BT metadata协议，其他的字节是什么意思就不用管了。
     * ② info_hash，20字节
     * ③ peer_id，20字节（随机生成）
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("send handshake");
        ByteBuf buffer = Unpooled.buffer(68);
        buffer.writeByte(Constant.BT_PROTOCOL_NAME.getBytes().length);
        buffer.writeBytes(Constant.BT_PROTOCOL_NAME.getBytes());
        buffer.writeBytes(Constant.BT_RESERVED);
        buffer.writeBytes(infoHash);
        buffer.writeBytes(peerId);
        ctx.channel().writeAndFlush(buffer);
    }
}
