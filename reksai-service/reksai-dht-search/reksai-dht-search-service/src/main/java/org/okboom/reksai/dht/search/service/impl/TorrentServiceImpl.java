package org.okboom.reksai.dht.search.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.manage.TorrentManager;
import org.okboom.reksai.dht.search.service.TorrentService;

/**
 * @author tookbra
 */
@Slf4j
@AllArgsConstructor
public class TorrentServiceImpl implements TorrentService {

    private final TorrentManager torrentManager;

    @Override
    public TorrentDTO findByInfoHash(String infoHash) {
        Torrent torrent = torrentManager.findById(infoHash);
        return null;
    }
}
