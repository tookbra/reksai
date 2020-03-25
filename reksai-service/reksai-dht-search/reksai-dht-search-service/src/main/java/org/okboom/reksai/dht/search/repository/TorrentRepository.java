package org.okboom.reksai.dht.search.repository;

import org.okboom.reksai.dht.search.domain.Torrent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author tookbra
 */
@Repository
public interface TorrentRepository extends MongoRepository<Torrent, String> {

    /**
     * 查询种子信息
     * @param infoHash
     * @return
     */
    Optional<Torrent> findBySummary(String infoHash);
}
