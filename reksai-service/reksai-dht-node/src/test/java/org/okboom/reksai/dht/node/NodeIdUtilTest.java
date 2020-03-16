package org.okboom.reksai.dht.node;

import cn.hutool.core.net.NetUtil;
import org.junit.Test;
import org.okboom.reksai.dht.node.util.NodeIdUtil;

import java.util.Arrays;

/**
 * @author tookbra
 */
public class NodeIdUtilTest {


    @Test
    public void testLocalIp() {
        System.out.println(NetUtil.getLocalhostStr());
    }

    @Test
    public void testGeneratorNodeId() {
        System.out.println(NodeIdUtil.getSelfNodeId());
        System.out.println(NetUtil.ipv4ToLong("124.31.75.21"));
    }

    @Test
    public void testGetNeighbor() {
        byte[] target = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(Arrays.toString(NodeIdUtil.getNeighbor(target)));
    }

    @Test
    public void test10GeneratorNid() {
        byte[] target = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        byte[] bytes = new byte[20];
        System.arraycopy(target, 0, bytes, 0, 10);
        System.arraycopy(NodeIdUtil.SELF_NODE_ID, 10, bytes, 10, 10);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    public void test2GeneratorNid() {
        byte[] target = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        byte[] bytes = new byte[20];
        System.arraycopy(target, 0, bytes, 0, 18);
        System.arraycopy(NodeIdUtil.SELF_NODE_ID, 18, bytes, 18, 2);
        System.out.println(Arrays.toString(bytes));
    }
}
