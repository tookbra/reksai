package org.okboom.reksai.dht.web.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.okboom.reksai.data.result.PageResult;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.service.TorrentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author tookbra
 */
@Controller
@RequestMapping("/search")
public class SearchController {

    @Reference(validation = "true")
    private TorrentService torrentService;

    /**
     * 搜索
     * @param modelMap
     * @return
     */
    @RequestMapping("")
    public String search(ModelMap modelMap) {
        PageResult<List<TorrentDTO>> result = torrentService.search(null);
        if(result.isSuccess()) {
            modelMap.put("torrent", result.getData());
        }
        return "search";
    }
}
