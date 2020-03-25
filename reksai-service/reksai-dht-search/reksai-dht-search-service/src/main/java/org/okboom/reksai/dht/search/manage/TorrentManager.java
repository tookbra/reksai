package org.okboom.reksai.dht.search.manage;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.okboom.reksai.data.support.Query;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.okboom.reksai.dht.search.domain.TorrentDocument;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.okboom.reksai.dht.search.repository.TorrentIndexRepository;
import org.okboom.reksai.dht.search.repository.TorrentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
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

    private final TorrentIndexRepository torrentIndexRepository;

    private final ElasticsearchOperations elasticsearchOperations;

    /**
     * 查询种子信息
     * @param infoHash
     * @return
     */
    public Optional<Torrent> findBySummary(String infoHash) {
        Optional<Torrent> torrentOptional = torrentRepository.findBySummary(infoHash);
        return torrentOptional;
    }

    /**
     * 搜索
     * @param fileName 文件名
     * @param fileType 文件类型
     * @param query 查询条件
     * @return
     */
    public Page<TorrentDocument> search(String fileName, String fileType, Query query) {

        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder()
                .withPageable(PageRequest.of(query.getCurrent() - 1, query.getLimit()))
                .withHighlightFields(new HighlightBuilder.Field("fileName"));
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();

        if (StringUtils.isNotBlank(fileName)) {
            // filter more fast must
            boolQuery.must(QueryBuilders.matchQuery("fileName", fileName));
        }

        if (StringUtils.isNotBlank(fileType)) {
            boolQuery.must(QueryBuilders.matchQuery("fileType", fileType));
        }

        if (!CollectionUtils.isEmpty(query.getSorts())) {
            query.getSorts().forEach(sortField -> nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort(sortField.getField())
                    .order(SortOrder.fromString(sortField.getOrder()))));
        } else {
            nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("createDate").order(SortOrder.DESC));
        }
        nativeSearchQueryBuilder.withQuery(boolQuery);

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
        Page<TorrentDocument> page =  elasticsearchOperations.moreLikeThis(query, TorrentDocument.class);
        return page;
    }
}
