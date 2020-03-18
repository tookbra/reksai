package org.okboom.reksai.dht.metadata;

import cn.hutool.core.util.HexUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;
import org.okboom.reksai.dht.metadata.common.Constant;
import org.okboom.reksai.tool.bencode.BencodingUtils;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/**
 * @author tookbra
 */
@Slf4j
public class MeTest {

    @Test
    public void testMetadata() {
        byte [] infoHash = HexUtil.decodeHex("42d5bb189d0ce71ce66cf14220483e163805b73c");
        byte [] metadata = new byte[]{19, 66, 105, 116, 84, 111, 114, 114, 101, 110, 116, 32, 112, 114, 111, 116, 111, 99, 111, 108, 0, 0, 0, 0, 0, 16, 0, 5, 66, -43, -69, 24, -99, 12, -25, 28, -26, 108, -15, 66, 32, 72, 62, 22, 56, 5, -73, 60, 45, 85, 84, 51, 53, 53, 87, 45, 40, -78, -27, -78, 106, -15, -107, 19, 84, -103, 55, -55, 0, 0, 1, 89, 20, 0, 100, 49, 58, 101, 105, 48, 101, 52, 58, 105, 112, 118, 52, 52, 58, 51, -58, 90, 49, 52, 58, 105, 112, 118, 54, 49, 54, 58, 42};
        ByteBuf byteBuf = Unpooled.wrappedBuffer(metadata);
        int pstrLen = byteBuf.readByte();

        if(pstrLen != Constant.PSTR_LEN) {
            return;
        }

        String protocol = byteBuf.readBytes(pstrLen).toString(Charset.defaultCharset());
        Assert.assertEquals("BitTorrent protocol", protocol);

        byte[] handshake = new byte[8];
        byteBuf.readBytes(handshake);
        if (handshake[5] == 0x10) {
            byte[] targetInfoHash = new byte[20];
            byteBuf.readBytes(targetInfoHash);
            byte[] targetPeerId = new byte[20];
            byteBuf.readBytes(targetPeerId);
            if (!Arrays.equals(targetInfoHash, infoHash)) {
                Assert.fail("remote peer don't support download metadata.");
            } else {
            }
        } else {
            Assert.fail("remote peer don't support download metadata.");
        }
    }

    @Test
    public void nameTest() {
        byte [] name = new byte[] {66, 105, 116, 84, 111, 114, 114, 101, 110, 116, 32, 112, 114, 111, 116, 111, 99, 111, 108};
        System.out.println(new String(name, CharsetUtil.ISO_8859_1));
    }
}
