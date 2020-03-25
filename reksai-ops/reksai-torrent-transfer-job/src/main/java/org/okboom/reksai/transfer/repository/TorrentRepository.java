package org.okboom.reksai.transfer.repository;

import org.okboom.reksai.dht.domain.Torrent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tookbra
 */
@Repository
public interface TorrentRepository extends MongoRepository<Torrent, String> {
}
