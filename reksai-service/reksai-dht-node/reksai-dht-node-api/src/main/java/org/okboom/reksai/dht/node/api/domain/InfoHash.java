package org.okboom.reksai.dht.node.api.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
@Builder
public class InfoHash implements Serializable {

    private String address;

    private Integer port;

    private byte [] nid;

    private byte [] infoHash;
}
