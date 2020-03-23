package org.okboom.reksai.transfer.service;

import lombok.AllArgsConstructor;
import org.okboom.reksai.transfer.domain.SyncInfo;
import org.okboom.reksai.transfer.repository.SyncInfoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author tookbra
 */
@AllArgsConstructor
@Service
public class SyncInfoService {

    private final SyncInfoRepository syncInfoRepository;

    public SyncInfo findByShareIndex(Integer shareIndex) {
        return syncInfoRepository.findByShareIndex(shareIndex);
    }

    public SyncInfo save(SyncInfo syncInfo) {
        return syncInfoRepository.save(syncInfo);
    }
}
