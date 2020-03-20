package org.okboom.reksai.transfer.domain;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.okboom.reksai.transfer.common.FieldAnalyzer;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author tookbra
 */
@Data
@ToString
@Accessors(chain = true)
@Document(indexName = "reksai", type = "torrent")
public class TorrentDocument {

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
    @Field(type = FieldType.Text, analyzer = FieldAnalyzer.IK_MAX_WORD, searchAnalyzer = FieldAnalyzer.IK_SMART)
    private String fileName;
    /**
     * 文件大小
     */
    @Field(type = FieldType.Long)
    private long fileSize;
    /**
     * 创建时间
     */
    private long createDate;
}
