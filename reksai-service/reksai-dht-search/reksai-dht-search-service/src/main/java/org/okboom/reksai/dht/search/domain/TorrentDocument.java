package org.okboom.reksai.dht.search.domain;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.time.LocalDateTime;

/**
 * @author tookbra
 */
@Data
@ToString
@Accessors(chain = true)
@Document(indexName = "reksai", type = "torrent")
@Mapping(mappingPath = "/config/es/torrent-mapping.json")
@Setting(settingPath = "/config/es/builder-setting.json")
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
     * 不起作用 @Field(type = FieldType.Text, analyzer = FieldAnalyzer.IK_MAX_WORD, searchAnalyzer = FieldAnalyzer.IK_SMART)
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
}
