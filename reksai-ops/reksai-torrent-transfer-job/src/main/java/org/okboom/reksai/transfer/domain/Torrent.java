package org.okboom.reksai.transfer.domain;

import lombok.Data;
import org.okboom.reksai.mongo.annotation.AutoIncValue;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
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

    @Id
    @AutoIncValue
    private Integer id;
    /**
     * infoHash
     */
    @Field("info_hash")
    private String infoHash;
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
    private FileNode files;
}
