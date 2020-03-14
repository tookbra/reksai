package org.okboom.reksai.dht.node.api.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.net.InetSocketAddress;

/**
 * @author tookbra
 */
@Data
@Builder
@ToString
public class Node implements Serializable {

    private byte[] nid;

    private InetSocketAddress address;


}
