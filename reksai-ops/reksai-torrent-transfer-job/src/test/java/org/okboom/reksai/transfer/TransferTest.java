package org.okboom.reksai.transfer;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.okboom.reksai.transfer.domain.FileNode;
import org.okboom.reksai.transfer.domain.SearchInfoHash;
import org.okboom.reksai.dht.domain.Torrent;
import org.okboom.reksai.dht.domain.TorrentDocument;
import org.okboom.reksai.transfer.mapper.SearchInfoHashMapper;
import org.okboom.reksai.transfer.repository.TorrentIndexRepository;
import org.okboom.reksai.transfer.repository.TorrentRepository;
import org.okboom.reksai.transfer.util.TreeUtil;
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

    @Autowired
    TorrentRepository torrentRepository;


    @Test
    public void testPageSelect() {
        Page<SearchInfoHash> page = new Page<SearchInfoHash>(1, 1000);
        List<SearchInfoHash> searchInfoHashes = searchInfoHashMapper.pageInfoHashes(page);
        System.out.println(searchInfoHashes.toString());
    }

    @Test
    public void test1() {
        Page<SearchInfoHash> page = new Page<SearchInfoHash>(320, 10000);
        IPage<SearchInfoHash> iPage = searchInfoHashMapper.selectPage(page, new QueryWrapper<>());
        System.out.println(1);
    }

    @Test
    public void testTransferMongo() throws InterruptedException {
        Executor executor = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        int count = searchInfoHashMapper.selectCount(new QueryWrapper<>());
        int size = (count / 5000) + ((count % 5000) > 0 ? 1 : 0);
        final CountDownLatch countDownLatch = new CountDownLatch(size);
        for(int i = 1; i <= size; i++) {
            int finalI = i;
            executor.execute(() -> {
                Page<SearchInfoHash> page = new Page<SearchInfoHash>(finalI, 5000);
                List<SearchInfoHash> searchInfoHashes = searchInfoHashMapper.pageInfoHashes(page);
                List<Torrent> torrents = new ArrayList<>();
                searchInfoHashes.forEach(searchInfoHash -> {
                    String fileList = searchInfoHash.getFileList();
                    JSONArray jsonArray = JSONUtil.parseArray(fileList);
                    List<FileNode> nodes = new ArrayList<>();
                    for(int j = 0; j < jsonArray.size(); j++) {
                        FileNode node = new FileNode(j, 0,
                                ((JSONObject)jsonArray.get(j)).getObj("path").toString(),
                                Long.parseLong(((JSONObject)jsonArray.get(j)).getObj("length").toString()), j);
                        nodes.add(node);
                    }

                    Torrent torrent = new Torrent();
                    torrent.setInfoHash(searchInfoHash.getInfoHash());
                    torrent.setFileName(searchInfoHash.getName());
                    torrent.setFileSize(searchInfoHash.getLength());
                    torrent.setFileType(searchInfoHash.getCategory());
                    torrent.setCreateDate(searchInfoHash.getCreateTime());
                    torrent.setSummary(SecureUtil.md5(searchInfoHash.getInfoHash()));
                    FileNode node = TreeUtil.createTree(nodes);
                    torrent.setFiles(JSONUtil.toJsonStr(node));

                    torrents.add(torrent);
                });
                torrentRepository.saveAll(torrents);
                System.out.println("===============" + finalI + "==============");
                countDownLatch.countDown();
            });

        }
        countDownLatch.await();
        System.out.println("===============处理完成==============");
    }

    @Test
    public void testTransferEs() throws InterruptedException {
        Executor executor = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        int count = searchInfoHashMapper.selectCount(new QueryWrapper<>());
        int size = (count / 10000) + ((count % 10000) > 0 ? 1 : 0);
        final CountDownLatch countDownLatch = new CountDownLatch(size);
        for(int i = 1; i <= size; i++) {
            int finalI = i;
            executor.execute(() -> {
                Page<SearchInfoHash> page = new Page<SearchInfoHash>(finalI, 10000);
                List<SearchInfoHash> searchInfoHashes = searchInfoHashMapper.pageInfoHashes(page);
                List<TorrentDocument> queries = new ArrayList();
                searchInfoHashes.forEach(searchInfoHash -> {
                    TorrentDocument torrentDocument = new TorrentDocument();
                    torrentDocument.setInfoHash(searchInfoHash.getInfoHash());
                    torrentDocument.setFileName(searchInfoHash.getName());
                    torrentDocument.setFileSize(searchInfoHash.getLength());
                    torrentDocument.setFileType(searchInfoHash.getCategory());
                    torrentDocument.setCreateDate(searchInfoHash.getCreateTime());
                    torrentDocument.setSummary(SecureUtil.md5(searchInfoHash.getInfoHash()));
                    queries.add(torrentDocument);
                });
                torrentIndexRepository.saveAll(queries);
                System.out.println("===============" + finalI + "==============");
                countDownLatch.countDown();
            });

        }
        countDownLatch.await();
        System.out.println("===============处理完成==============");
    }
}
