package org.okboom.reksai.dht.node.props;

import lombok.Data;

import java.io.Serializable;

/**
 * 初始 Bittorrent 节点
 * @author tookbra
 */
@Data
public class DhtNode implements Serializable {

    private String address;

    private int port;
}
