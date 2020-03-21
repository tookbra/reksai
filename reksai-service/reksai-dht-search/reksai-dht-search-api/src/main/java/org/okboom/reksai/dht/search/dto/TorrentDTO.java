package org.okboom.reksai.dht.search.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author tookbra
 */
@Data
public class TorrentDTO implements Serializable {

    /**
     * infoHash
     */
    private String infoHash;
    /**
     * 文件类型
     */
    private String fileType;
    /***
     * 文件名
     */
    private String fileName;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * 创建时间
     */
    private Long createDate;
    /**
     * 文件
     */
    private String files;


}
