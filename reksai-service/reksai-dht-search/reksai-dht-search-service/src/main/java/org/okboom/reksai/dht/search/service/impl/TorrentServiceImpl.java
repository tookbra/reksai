package org.okboom.reksai.dht.search.service.impl;

import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.okboom.reksai.data.FileNode;
import org.okboom.reksai.data.result.PageResult;
import org.okboom.reksai.data.result.Pager;
import org.okboom.reksai.data.result.Result;
import org.okboom.reksai.data.support.Query;
import org.okboom.reksai.dht.search.convert.TorrentConvert;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.okboom.reksai.dht.search.domain.TorrentDocument;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.dto.TorrentInfoDTO;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.okboom.reksai.dht.search.manage.TorrentManager;
import org.okboom.reksai.dht.search.service.TorrentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
@Service(validation = "true")
public class TorrentServiceImpl implements TorrentService {

    private final TorrentManager torrentManager;

    @Override
    public Result<TorrentInfoDTO> findByInfoHash(String infoHash) {
        TorrentInfoDTO torrentInfoDTO = new TorrentInfoDTO();
        Optional<Torrent> torrentOptional = torrentManager.findBySummary(infoHash);
        torrentOptional.ifPresent(torrent -> {
            torrentInfoDTO.setTorrentDTO(TorrentConvert.INSTANCE.convert(torrent));

            if(StringUtils.isNotBlank(torrent.getFiles())) {
                torrentInfoDTO.getTorrentDTO().setFileNodes(JSONUtil.toBean(torrent.getFiles(), FileNode.class));
            };

            String[] fields = new String[] { "file_name" };
            Page<TorrentDocument> torrentDocumentPage = torrentManager.searchSimilar(torrent.getInfoHash(),
                    fields, PageRequest.of(0, 10));
            List<TorrentDocument> torrentDocuments = torrentDocumentPage.getContent();
            if(!CollectionUtils.isEmpty(torrentDocuments)) {
                torrentInfoDTO.setSimilar(TorrentConvert.INSTANCE.convertDocuments(torrentDocuments));
            }

        });
        return Result.data(torrentInfoDTO);
    }

    @Override
    public PageResult<List<TorrentDTO>> search(TorrentSearchPageDTO torrentSearchPageDTO) {
        Query query = new Query()
                .setCurrent(torrentSearchPageDTO.getCurrent())
                .setLimit(torrentSearchPageDTO.getLimit())
                .setSorts(torrentSearchPageDTO.getSorts());
        Page<TorrentDocument> page = torrentManager.search(torrentSearchPageDTO.getFileName(),
                torrentSearchPageDTO.getFileType(), query);
        List<TorrentDocument> torrentDocuments = page.getContent();
        if(CollectionUtils.isEmpty(torrentDocuments)) {
            return PageResult.empty(null);
        }

        List<TorrentDTO> torrentDTOS = TorrentConvert.INSTANCE.convertDocuments(torrentDocuments);
        return PageResult.data(torrentDTOS, new Pager(torrentSearchPageDTO.getCurrent(), page.getTotalElements(), page.getTotalPages()));
    }
}
