package org.okboom.reksai.dht.search.repository;

import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.reksai.dht.search.domain.TorrentDocument;
import org.okboom.reksai.dht.search.domain.TorrentIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.MoreLikeThisQuery;
import org.springframework.test.context.junit4.SpringRunner;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

/**
 * @author tookbra
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TorrentIndexRepositoryTest {

    @Autowired
    TorrentIndexRepository torrentIndexRepository;

    @Autowired
    RestHighLevelClient highLevelClient;

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

    @Test
    public void testIndex() {
        TorrentIndex torrent = new TorrentIndex();
        torrent.setInfoHash("42d5bb189d0ce71ce66cf14220483e163805b73c");
        torrent.setFileType("图片,音频1");
        torrent.setFileName("我爱写代码");
        torrent.setFileSize(277959244);
        torrent.setCreateDate(1584532261018L);

//        IndexQuery indexQuery = new IndexQueryBuilder()
//                .withId(torrent.getInfoHash())
//                .withObject(torrent)
//                .build();
        torrentIndexRepository.save(torrent);
        torrent.setInfoHash("42d5bb189d0c1234166cf14220483e163805b73c");
        torrent.setFileName("我爱中国");
        torrentIndexRepository.index(torrent);

        torrent.setInfoHash("42d5bb189d0c11231231231232483e163805b73c");
        torrent.setFileName("代码");
        torrentIndexRepository.index(torrent);



//        elasticsearchOperations.index(torrent);
    }

    @Test
    public void testPage() {
        Pageable pageable = PageRequest.of(0, 10);
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
        boolQuery.must(matchQuery("fileName", "代码"));

        Page<TorrentDocument> page = torrentIndexRepository.search(boolQuery, pageable);
        System.out.println(1);
    }

    @Test
    public void testSearchSimilar() {
        Pageable pageable = PageRequest.of(0, 10);
        String[] fields = new String[] { "fileName" };
        TorrentDocument torrentDocument = new TorrentDocument();
        torrentDocument.setInfoHash("42d5bb189d0ce71ce66cf14220483e163805b73c");
        //
        Page<TorrentDocument> page = torrentIndexRepository.searchSimilar(torrentDocument, fields, pageable);
        System.out.println(1);
    }

    @Test
    public void test() {
        Pageable pageable = PageRequest.of(0, 10);
        String[] fields = new String[] { "fileName" };
        MoreLikeThisQuery query = new MoreLikeThisQuery();
        query.setId("42d5bb189d0ce71ce66cf14220483e163805b73c");
        query.setPageable(pageable);
        query.setMinTermFreq(1);
        if (fields != null) {
            query.addFields(fields);
        }
        Page<TorrentDocument> page =  elasticsearchOperations.moreLikeThis(query, TorrentDocument.class);
        System.out.println(page.getContent().toString());

    }
}
