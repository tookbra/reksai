package org.okboom.reksai.dht.search.manage;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.okboom.reksai.dht.search.domain.TorrentDocument;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.okboom.reksai.dht.search.repository.TorrentIndexRepository;
import org.okboom.reksai.dht.search.repository.TorrentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.MoreLikeThisQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

/**
 * @author tookbra
 */
@Slf4j
@Service
@AllArgsConstructor
public class TorrentManager {

    private final TorrentRepository torrentRepository;

//    private final ElasticsearchTemplate elasticsearchTemplate;

    private final TorrentIndexRepository torrentIndexRepository;

    /**
     * 查询种子信息
     * @param infoHash
     * @return
     */
    public Torrent findById(String infoHash) {
        Optional<Torrent> torrentOptional = torrentRepository.findById(infoHash);
        Torrent torrent = torrentOptional.orElse(null);
        return torrent;
    }

    /**
     * 构建种子索引
     * @param torrentDocument
     */
    public void save(TorrentDocument torrentDocument) {
        torrentIndexRepository.save(torrentDocument);
    }

    /**
     * 搜索
     * @param torrentSearchPageDTO
     * @return
     */
    public Page<TorrentDocument> search(TorrentSearchPageDTO torrentSearchPageDTO) {

        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder().withPageable(PageRequest.of(torrentSearchPageDTO.getCurrent() - 1, torrentSearchPageDTO.getLimit()));
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();

        if (StringUtils.isNotBlank(torrentSearchPageDTO.getFileName())) {
            boolQuery.must(matchQuery("fileName", torrentSearchPageDTO.getFileName()));
        }

        if (StringUtils.isNotBlank(torrentSearchPageDTO.getFileType())) {
            boolQuery.must(matchQuery("fileType", torrentSearchPageDTO.getFileType()));
        }

        if (!CollectionUtils.isEmpty(torrentSearchPageDTO.getSorts())) {
            torrentSearchPageDTO.getSorts().forEach(sortField -> nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort(sortField.getField())
                    .order(SortOrder.fromString(sortField.getOrder()))));
        }

        Page<TorrentDocument> page = torrentIndexRepository.search(nativeSearchQueryBuilder.build());
        return page;
    }

    /**
     * 相似度查询
     * @param infoHash
     * @param fields
     * @param pageable
     * @return
     */
    public Page<TorrentDocument> searchSimilar(String infoHash, String [] fields, Pageable pageable) {
        MoreLikeThisQuery query = new MoreLikeThisQuery();
        query.setId(infoHash);
        query.setPageable(pageable);
        query.setMinTermFreq(1);
        if (fields != null) {
            query.addFields(fields);
        }
        return null;
//        return elasticsearchTemplate.moreLikeThis(query, TorrentDocument.class);
    }
}
