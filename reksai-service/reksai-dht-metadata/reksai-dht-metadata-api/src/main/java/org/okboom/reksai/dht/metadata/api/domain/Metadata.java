package org.okboom.reksai.dht.metadata.api.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
@ToString
public class Metadata implements Serializable {

    /**
     * infoHash
     */
    private String infoHash;
    /**
     * 文件类型
     */
    private String fileType = "其他";
    /***
     * 文件名
     */
    private String fileName;
    /**
     * 文件大小
     */
    private long fileSize;
    /**
     * 创建时间
     */
    private long createDate;
    /**
     * 文件
     */
    private String files;
}
