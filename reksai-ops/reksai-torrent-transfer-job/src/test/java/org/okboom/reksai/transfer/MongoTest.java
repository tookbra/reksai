package org.okboom.reksai.transfer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.reksai.dht.domain.Torrent;
import org.okboom.reksai.transfer.repository.TorrentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @author tookbra
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TransferApplication.class)
public class MongoTest {

    @Autowired
    TorrentRepository torrentRepository;

    @Test
    public void testSave() throws IOException {
        Torrent torrent = new Torrent();
        torrent.setInfoHash("1");
        torrentRepository.save(torrent);
        System.in.read();
    }
}
