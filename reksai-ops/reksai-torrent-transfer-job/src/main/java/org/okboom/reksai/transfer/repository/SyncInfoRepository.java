package org.okboom.reksai.transfer.repository;

import org.okboom.reksai.transfer.domain.SyncInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author tookbra
 */
@Repository
public interface SyncInfoRepository extends MongoRepository<SyncInfo, String> {

    /**
     * 根据分片查找增量同步记录
     * @param shareIndex
     * @return
     */
    SyncInfo findByShareIndex(Integer shareIndex);
}
