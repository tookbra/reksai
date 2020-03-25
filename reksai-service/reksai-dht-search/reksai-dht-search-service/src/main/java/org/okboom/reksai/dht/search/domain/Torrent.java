package org.okboom.reksai.dht.search.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;

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
    @Field("info_hash")
    private String infoHash;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 文件类型
     */
    @Field("file_type")
    private String fileType = "其他";

    /***
     * 文件名
     */
    @Field("file_name")
    private String fileName;

    /**
     * 文件大小
     */
    @Field("file_size")
    private Long fileSize;

    /**
     * 创建时间
     */
    @Field("create_date")
    private LocalDateTime createDate;

    /**
     * 文件
     */
    private String files;
}
