package org.okboom.reksai.dht.search.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.reksai.data.result.PageResult;
import org.okboom.reksai.data.result.Result;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.dto.TorrentInfoDTO;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author tookbra
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TorrentServiceTest {

    @Autowired
    TorrentService torrentService;

    @Test
    public void testFindByInfoHash() {
        Result<TorrentInfoDTO> result = torrentService.findByInfoHash("9743785f586ed54176fc1aafa8fbbc66");
        System.out.println(result);
    }

    @Test
    public void testSearch() {
        TorrentSearchPageDTO torrentSearchPageDTO = new TorrentSearchPageDTO();
        torrentSearchPageDTO.setFileName("六月");
        torrentSearchPageDTO.setCurrent(1);
        torrentSearchPageDTO.setLimit(10);
        PageResult<List<TorrentDTO>> pageResult = torrentService.search(torrentSearchPageDTO);
        System.out.println(pageResult);
    }
}
