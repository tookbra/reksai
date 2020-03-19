package org.okboom.reksai.dht.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tookbra
 */
@Controller
@RequestMapping("/infoHash")
public class TorrentController {

    @RequestMapping("/{infoHash}")
    public String infoHash(@PathVariable String infoHash) {
        return "detail";
    }
}
