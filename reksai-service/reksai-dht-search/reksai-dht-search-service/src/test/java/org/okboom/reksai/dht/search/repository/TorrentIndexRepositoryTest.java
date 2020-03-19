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
        torrent.setFiles("{\"filename\":\"\",\"children\":[{\"filename\":\"[1991] Inner Child\",\"children\":[{\"filename\":\"Shanice (Inner Child)\",\"children\":[{\"filename\":\"Shanice (Inner Child) - CD.jpg\",\"fileSize\":532787,\"nid\":3,\"index\":0,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Front Cover.jpg\",\"fileSize\":769541,\"nid\":6,\"index\":1,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Inside Cover #1.jpg\",\"fileSize\":641513,\"nid\":9,\"index\":2,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Inside Cover #2.jpg\",\"fileSize\":696801,\"nid\":12,\"index\":3,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Inside Cover #3.jpg\",\"fileSize\":923691,\"nid\":15,\"index\":4,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Rear Cover.jpg\",\"fileSize\":613908,\"nid\":18,\"index\":5,\"pid\":2},{\"filename\":\"Shanice (Inner Child) - Rear of Case.jpg\",\"fileSize\":952968,\"nid\":21,\"index\":6,\"pid\":2}],\"nid\":2,\"index\":0,\"pid\":1},{\"filename\":\"01 - Shanice - Keep Your Inner Child Alive (Intrerlude).mp3\",\"fileSize\":3439889,\"nid\":23,\"index\":7,\"pid\":1},{\"filename\":\"02 - Shanice - I Love Your Smile.mp3\",\"fileSize\":10322632,\"nid\":25,\"index\":8,\"pid\":1},{\"filename\":\"03 - Shanice - Forever In Your Love.mp3\",\"fileSize\":11437538,\"nid\":27,\"index\":9,\"pid\":1},{\"filename\":\"04 - Shanice - I'm Cryin'.mp3\",\"fileSize\":12235840,\"nid\":29,\"index\":10,\"pid\":1},{\"filename\":\"05 - Shanice - I Hate To Be Lonely.mp3\",\"fileSize\":16244069,\"nid\":31,\"index\":11,\"pid\":1},{\"filename\":\"06 - Shanice - Stop Cheatin' On Me.mp3\",\"fileSize\":11637113,\"nid\":33,\"index\":12,\"pid\":1},{\"filename\":\"07 - Shanice - Silent Prayer.mp3\",\"fileSize\":12159562,\"nid\":35,\"index\":13,\"pid\":1},{\"filename\":\"08 - Shanice - Peace In The World.mp3\",\"fileSize\":10650730,\"nid\":37,\"index\":14,\"pid\":1},{\"filename\":\"09 - Shanice - Lovin' You.mp3\",\"fileSize\":9530599,\"nid\":39,\"index\":15,\"pid\":1},{\"filename\":\"10 - Shanice - You Ain't All That.mp3\",\"fileSize\":10997636,\"nid\":41,\"index\":16,\"pid\":1},{\"filename\":\"11 - Shanice - Shanice & Mookie Meet Homey (Interlude).mp3\",\"fileSize\":924820,\"nid\":43,\"index\":17,\"pid\":1},{\"filename\":\"12 - Shanice - You Didn't Think I'd Come Back This Hard.mp3\",\"fileSize\":8797081,\"nid\":45,\"index\":18,\"pid\":1},{\"filename\":\"13 - Shanice - You Were The One.mp3\",\"fileSize\":12828297,\"nid\":47,\"index\":19,\"pid\":1},{\"filename\":\"14 - Shanice - I Love Your Smile (Hakeem's Mix).mp3\",\"fileSize\":10270387,\"nid\":49,\"index\":20,\"pid\":1},{\"filename\":\"15 - Shanice - Goodnight (Interlude).mp3\",\"fileSize\":899742,\"nid\":51,\"index\":21,\"pid\":1},{\"filename\":\"Inner Child.jpg\",\"fileSize\":300237,\"nid\":53,\"index\":22,\"pid\":1}],\"nid\":1,\"index\":0,\"pid\":0},{\"filename\":\"[1994] 21... Ways To Grow\",\"children\":[{\"filename\":\"Shanice (21... Ways To Grow)\",\"children\":[{\"filename\":\"Shanice (21... Ways To Grow) - Behind CD.jpg\",\"fileSize\":957652,\"nid\":56,\"index\":23,\"pid\":55},{\"filename\":\"Shanice (21... Ways To Grow) - CD.jpg\",\"fileSize\":352582,\"nid\":59,\"index\":24,\"pid\":55},{\"filename\":\"Shanice (21... Ways To Grow) - Front Cover.jpg\",\"fileSize\":739754,\"nid\":62,\"index\":25,\"pid\":55},{\"filename\":\"Shanice (21... Ways To Grow) - Inside Cover.jpg\",\"fileSize\":941840,\"nid\":65,\"index\":26,\"pid\":55},{\"filename\":\"Shanice (21... Ways To Grow) - Rear Cover.jpg\",\"fileSize\":889901,\"nid\":68,\"index\":27,\"pid\":55},{\"filename\":\"Shanice (21... Ways To Grow) - Rear of Case.jpg\",\"fileSize\":970240,\"nid\":71,\"index\":28,\"pid\":55}],\"nid\":55,\"index\":23,\"pid\":54},{\"filename\":\"01 - Shanice - Ways To Grow (Intro).mp3\",\"fileSize\":1522501,\"nid\":73,\"index\":29,\"pid\":54},{\"filename\":\"02 - Shanice - I Care (Interlude).mp3\",\"fileSize\":1877767,\"nid\":75,\"index\":30,\"pid\":54},{\"filename\":\"03 - Shanice - Don't Break My Heart.mp3\",\"fileSize\":12481391,\"nid\":77,\"index\":31,\"pid\":54},{\"filename\":\"04 - Shanice - Turn Down The Lights.mp3\",\"fileSize\":10790746,\"nid\":79,\"index\":32,\"pid\":54},{\"filename\":\"05 - Shanice - Somewhere.mp3\",\"fileSize\":10138730,\"nid\":81,\"index\":33,\"pid\":54},{\"filename\":\"06 - Shanice - Ace Boon Coon.mp3\",\"fileSize\":8511824,\"nid\":83,\"index\":34,\"pid\":54},{\"filename\":\"07 - Shanice - I Like.mp3\",\"fileSize\":11582779,\"nid\":85,\"index\":35,\"pid\":54},{\"filename\":\"08 - Shanice - Give Me The Love I Need.mp3\",\"fileSize\":10467873,\"nid\":87,\"index\":36,\"pid\":54},{\"filename\":\"09 - Shanice - I'll Be There.mp3\",\"fileSize\":12028950,\"nid\":89,\"index\":37,\"pid\":54},{\"filename\":\"10 - Shanice - I Wish.mp3\",\"fileSize\":14263987,\"nid\":91,\"index\":38,\"pid\":54},{\"filename\":\"11 - Shanice - When I Say That I Love You.mp3\",\"fileSize\":9506567,\"nid\":93,\"index\":39,\"pid\":54},{\"filename\":\"12 - Shanice - I Wanna Give It To You.mp3\",\"fileSize\":9570305,\"nid\":95,\"index\":40,\"pid\":54},{\"filename\":\"13 - Shanice - Never Changing Love.mp3\",\"fileSize\":10252624,\"nid\":97,\"index\":41,\"pid\":54},{\"filename\":\"14 - Shanice - Jesus Loves Me (Hidden Track).mp3\",\"fileSize\":2039726,\"nid\":99,\"index\":42,\"pid\":54},{\"filename\":\"21... Ways To Grow.jpg\",\"fileSize\":264124,\"nid\":101,\"index\":43,\"pid\":54}],\"nid\":54,\"index\":23,\"pid\":0}],\"nid\":0,\"index\":0,\"pid\":-1}");

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
