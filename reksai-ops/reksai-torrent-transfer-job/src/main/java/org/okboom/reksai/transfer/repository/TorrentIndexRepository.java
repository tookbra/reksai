package org.okboom.reksai.transfer.repository;

import org.okboom.reksai.dht.domain.TorrentDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tookbra
 */
@Repository
public interface TorrentIndexRepository extends ElasticsearchRepository<TorrentDocument, String> {
}
