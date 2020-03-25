package org.okboom.reksai.dht.search.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author tookbra
 */
@Data
@ToString
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "reksai", type = "torrent")
@Mapping(mappingPath = "/config/es/torrent-mapping.json")
@Setting(settingPath = "/config/es/builder-setting.json")
public class TorrentDocument {

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
     * 不起作用 @Field(type = FieldType.Text, analyzer = FieldAnalyzer.IK_MAX_WORD, searchAnalyzer = FieldAnalyzer.IK_SMART)
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
    @Field(type = FieldType.Date)
    @DateTimeFormat(pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createDate;
}
