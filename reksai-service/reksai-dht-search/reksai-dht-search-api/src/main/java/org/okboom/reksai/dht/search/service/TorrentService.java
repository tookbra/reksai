package org.okboom.reksai.dht.search.service;

import org.okboom.reksai.data.result.PageResult;
import org.okboom.reksai.data.result.Result;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.dto.TorrentInfoDTO;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author tookbra
 */
public interface TorrentService {

    /**
     * 根据infoHash查找种子元数据
     * @param infoHash
     * @return
     */
    Result<TorrentInfoDTO> findByInfoHash(@NotEmpty String infoHash);


    /**
     * 分页查询
     * @param torrentSearchPageDTO
     * @return
     */
    PageResult<List<TorrentDTO>> search(TorrentSearchPageDTO torrentSearchPageDTO);
}
