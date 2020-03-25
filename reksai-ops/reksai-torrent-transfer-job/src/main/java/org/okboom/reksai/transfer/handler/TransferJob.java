package org.okboom.reksai.transfer.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.core.util.ShardingUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.transfer.domain.SyncInfo;
import org.okboom.reksai.dht.domain.Torrent;
import org.okboom.reksai.dht.domain.TorrentDocument;
import org.okboom.reksai.transfer.repository.TorrentIndexRepository;
import org.okboom.reksai.transfer.service.SyncInfoService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
@Component
public class TransferJob {

    private final MongoTemplate mongoTemplate;

    private final TorrentIndexRepository torrentIndexRepository;

    private final SyncInfoService syncInfoService;

    /**
     * mongodb 增量同步到 es
     */
    @XxlJob("shardingJobHandler")
    public ReturnT<String> shardingJobHandler(String param) throws Exception {
        // 分片参数
        ShardingUtil.ShardingVO shardingVO = ShardingUtil.getShardingVo();
        XxlJobLogger.log("分片参数：当前分片序号 = {}, 总分片数 = {}", shardingVO.getIndex(), shardingVO.getTotal());

        SyncInfo syncInfo = syncInfoService.findByShareIndex(shardingVO.getIndex());
        syncInfo = Optional.ofNullable(syncInfo).orElse(new SyncInfo());
        syncInfo.setShareIndex(shardingVO.getIndex());
        LocalDateTime lastSyncTime = LocalDateTime.now().plusDays(-10);

        Query query = new Query(
                Criteria.where("create_date")
                        .gt(lastSyncTime).and("id")
                        .mod(shardingVO.getTotal(), shardingVO.getIndex()));
        query.limit(5000);
        List<Torrent> torrents = mongoTemplate.find(query, Torrent.class);
        List<TorrentDocument> torrentDocuments = new ArrayList<>();

        for(Torrent torrent : torrents) {
            TorrentDocument torrentDocument = new TorrentDocument();
            torrentDocument.setInfoHash(torrent.getInfoHash());
            torrentDocument.setFileName(torrent.getFileName());
            torrentDocument.setFileSize(torrent.getFileSize());
            torrentDocument.setFileType(torrent.getFileType());
            torrentDocument.setCreateDate(torrent.getCreateDate());
            if(torrent.getCreateDate().isAfter(lastSyncTime)) {
                lastSyncTime = torrent.getCreateDate();
            }
            torrentDocuments.add(torrentDocument);
        }

        torrentIndexRepository.saveAll(torrentDocuments);
        syncInfo.setLastSyncTime(lastSyncTime);
        syncInfoService.save(syncInfo);
        return ReturnT.SUCCESS;
    }
}
