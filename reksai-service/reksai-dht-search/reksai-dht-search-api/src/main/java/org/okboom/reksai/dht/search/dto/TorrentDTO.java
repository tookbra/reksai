package org.okboom.reksai.dht.search.dto;

import lombok.Data;
import org.okboom.reksai.data.FileNode;

import java.io.Serializable;
import java.time.LocalDateTime;
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
     * 摘要
     */
    private String summary;
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
    private LocalDateTime createDate;
    /**
     * 文件
     */
    private FileNode files;


}
