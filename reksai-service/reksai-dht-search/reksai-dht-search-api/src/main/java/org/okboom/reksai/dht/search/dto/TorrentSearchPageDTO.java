package org.okboom.reksai.dht.search.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import org.okboom.reksai.data.support.Query;

/**
 * @author tookbra
 */
@Data
@Accessors(chain = true)
public class TorrentSearchPageDTO extends Query {


    private String infoHash;
    /**
     * 文件名
     */
    private String fileName;
    /**
     * 文件类型
     */
    private String fileType;
}
