package org.okboom.reksai.dht.search.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author tookbra
 */
@Data
@Document(collection = "torrent")
public class Torrent implements Serializable {

    /**
     * infoHash
     */
    @Id
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
