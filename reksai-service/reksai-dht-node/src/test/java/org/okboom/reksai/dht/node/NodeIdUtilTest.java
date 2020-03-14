package org.okboom.reksai.dht.node;

import cn.hutool.core.net.NetUtil;
import org.junit.Test;
import org.okboom.reksai.dht.node.util.NodeIdUtil;

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
}
