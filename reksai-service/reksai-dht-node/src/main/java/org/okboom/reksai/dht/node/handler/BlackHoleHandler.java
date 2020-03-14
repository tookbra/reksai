package org.okboom.reksai.dht.node.handler;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 丢弃消息
 * @author tookbra
 */
@Slf4j
@ChannelHandler.Sharable
public class BlackHoleHandler extends ChannelDuplexHandler {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ctx.close();
        ReferenceCountUtil.safeRelease(msg);
    }
}
