package org.okboom.reksai.dht.web.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.okboom.reksai.data.result.Result;
import org.okboom.reksai.dht.search.dto.TorrentInfoDTO;
import org.okboom.reksai.dht.search.service.TorrentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tookbra
 */
@Controller
@RequestMapping("/video")
public class VideoController {

    @Reference(validation = "true")
    private TorrentService torrentService;

    /**
     * 获取种子详情
     * @param infoHash
     * @param modelMap
     * @return
     */
    @RequestMapping("/{infoHash}")
    public String infoHash(@PathVariable String infoHash, ModelMap modelMap) {
        Result<TorrentInfoDTO> result = torrentService.findByInfoHash(infoHash);
        if(result.isSuccess()) {
            modelMap.put("torrent", result.getData());
        } else {
            return "views/500";
        }
        return "views/video";
    }
}
