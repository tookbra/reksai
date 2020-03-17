package org.okboom.reksai.dht.node.props;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.io.Serializable;

/**
 * 初始 Bittorrent 节点
 * @author tookbra
 */
@Data
@Builder
public class DhtNode implements Serializable {

    private String address;

    private int port;

    @Tolerate
    public DhtNode (){}
}
