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
import java.util.concurrent.*;

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
        Page<SearchInfoHash> page = new Page<SearchInfoHash>(320, 10000);
        IPage<SearchInfoHash> iPage = searchInfoHashMapper.selectPage(page, new QueryWrapper<>());
        System.out.println(1);
    }


    @Test
    public void testTransfer() throws InterruptedException {
        Executor executor = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        int count = searchInfoHashMapper.selectCount(new QueryWrapper<>());
        int size = (count / 10000) + ((count % 10000) > 0 ? 1 : 0);
        final CountDownLatch countDownLatch = new CountDownLatch(size);
        for(int i = 1; i <= size; i++) {
            int finalI = i;
            executor.execute(() -> {
                Page<SearchInfoHash> page = new Page<SearchInfoHash>(finalI, 10000);
                IPage<SearchInfoHash> iPage = searchInfoHashMapper.selectPage(page, new QueryWrapper<>());
                List<SearchInfoHash> searchInfoHashes = page.getRecords();
                if(CollectionUtils.isNotEmpty(searchInfoHashes)) {
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
                System.out.println("===============" + finalI + "==============");
                countDownLatch.countDown();
            });

        }
        countDownLatch.await();
        System.out.println("===============处理完成==============");
    }
}
