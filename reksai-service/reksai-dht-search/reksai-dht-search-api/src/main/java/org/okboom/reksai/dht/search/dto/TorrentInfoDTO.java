package org.okboom.reksai.dht.search.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author tookbra
 */
@Data
public class TorrentInfoDTO implements Serializable {

    /**
     * 磁力信息
     */
    private TorrentDTO torrentDTO;

    /**
     * 相似文件列表
     */
    private List<TorrentDTO> similar;

}
