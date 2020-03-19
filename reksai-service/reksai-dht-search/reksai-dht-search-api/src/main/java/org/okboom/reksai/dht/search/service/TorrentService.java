package org.okboom.reksai.dht.search.service;

import org.okboom.reksai.data.result.ResultInner;
import org.okboom.reksai.dht.search.dto.TorrentDTO;

/**
 * @author tookbra
 */
public interface TorrentService {

    /**
     * 根据infoHash查找种子元数据
     * @param infoHash
     * @return
     */
    ResultInner<TorrentDTO> findById(String infoHash);
}
