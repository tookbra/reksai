package org.okboom.reksai.transfer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.reksai.transfer.domain.SearchInfoHash;
import org.okboom.reksai.transfer.domain.TorrentDocument;
import org.okboom.reksai.transfer.mapper.SearchInfoHashMapper;
import org.okboom.reksai.transfer.repository.TorrentIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tookbra
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransferTest {

    @Autowired
    SearchInfoHashMapper searchInfoHashMapper;

    @Autowired
    TorrentIndexRepository torrentIndexRepository;


    @Test
    public void testPageSelect() {
        Page<SearchInfoHash> page = new Page<SearchInfoHash>(1, 1000);
        IPage<SearchInfoHash> iPage = searchInfoHashMapper.selectPage(page, new QueryWrapper<>());
    }

    @Test
    public void test1() {
        System.out.println(18000%1000);
    }

    @Test
    public void testTransfer() {
        Page<SearchInfoHash> page;
        int count = searchInfoHashMapper.selectCount(new QueryWrapper<>());
        int size = (count / 1000) + ((count % 1000) > 0 ? 1 : 0);
        for(int i = 0; i < size; i++) {
            page = new Page<SearchInfoHash>(i + 1, 1000);
            IPage<SearchInfoHash> iPage = searchInfoHashMapper.selectPage(page, new QueryWrapper<>());
            List<SearchInfoHash> searchInfoHashes = page.getRecords();
            if(CollectionUtils.isEmpty(searchInfoHashes)) {
                break;
            }

            List<TorrentDocument> queries = new ArrayList();
            iPage.getRecords().forEach(searchInfoHash ->  {
                TorrentDocument torrentDocument = new TorrentDocument();
                torrentDocument.setInfoHash(searchInfoHash.getInfoHash());
                torrentDocument.setFileName(searchInfoHash.getName());
                torrentDocument.setFileSize(searchInfoHash.getLength());
                torrentDocument.setFileType(searchInfoHash.getCategory());
                torrentDocument.setCreateDate(searchInfoHash.getCreateTime().getTime());
                queries.add(torrentDocument);
            });
            torrentIndexRepository.saveAll(queries);
        }
    }
}
