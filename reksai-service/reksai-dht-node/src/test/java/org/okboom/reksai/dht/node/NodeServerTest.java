package org.okboom.reksai.dht.node;

import org.junit.Test;
import org.okboom.reksai.dht.node.api.domain.Node;
import org.okboom.reksai.dht.node.domain.Queue;
import org.okboom.reksai.dht.node.domain.RamQueue;
import org.okboom.reksai.dht.node.props.BittorrentProperties;
import org.okboom.reksai.dht.node.props.DhtNode;
import org.okboom.reksai.dht.node.props.NettyProperties;

import java.util.Arrays;

/**
 * @author tookbra
 */
public class NodeServerTest {


    @Test
    public void UdpServerTest() throws InterruptedException {
        BittorrentProperties bittorrentProperties = new BittorrentProperties();
        bittorrentProperties.setNodes(Arrays.asList(DhtNode.builder().address("router.bittorrent.com").port(6881).build()));

        NettyProperties nettyProperties = new NettyProperties();
        Queue<Node> queue = new RamQueue(bittorrentProperties.getQueueSize());
        DhtNodeServer dhtNodeServer = new DhtNodeServer(bittorrentProperties, nettyProperties, queue);
        dhtNodeServer.run();
    }
}
