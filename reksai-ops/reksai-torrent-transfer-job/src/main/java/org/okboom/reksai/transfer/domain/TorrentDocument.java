package org.okboom.reksai.transfer.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.okboom.reksai.transfer.common.FieldAnalyzer;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

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
    @Field(type = FieldType.Date)
    @DateTimeFormat(pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createDate;
}
