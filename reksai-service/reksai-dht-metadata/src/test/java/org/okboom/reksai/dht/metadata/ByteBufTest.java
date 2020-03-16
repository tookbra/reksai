package org.okboom.reksai.dht.metadata;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author tookbra
 */
public class ByteBufTest {


    @Test
    public void bufferWrite() {
        byte[] bytes = {1,2,3,4,5,6,7,8,9,10};
        ByteBuf byteBuf = Unpooled.buffer(0);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        byteBuf.writeBytes(bytes);
        System.out.println(Arrays.toString(byteBuf.array()));
    }
}
