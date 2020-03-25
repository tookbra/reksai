package org.okboom.reksai.dht.web.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.okboom.reksai.data.result.PageResult;
import org.okboom.reksai.dht.search.dto.TorrentDTO;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.okboom.reksai.dht.search.service.TorrentService;
import org.okboom.reksai.dht.web.convert.SearchConvert;
import org.okboom.reksai.dht.web.params.SearchParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
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
    @RequestMapping(method = RequestMethod.POST)
    public String search(@Valid SearchParam searchParam, ModelMap modelMap) {
        TorrentSearchPageDTO torrentSearchPageDTO = SearchConvert.INSTANCE.convert(searchParam);
        modelMap.put("SearchParam", searchParam);
        PageResult<List<TorrentDTO>> result = torrentService.search(torrentSearchPageDTO);
        if(result.isSuccess()) {
            modelMap.put("result", result.getData());
            modelMap.put("pager", result.getPager());
        } else {

            return "views/500";
        }
        return "views/search";
    }
}
