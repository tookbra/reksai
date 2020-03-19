package org.okboom.reksai.dht.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tookbra
 */
@Controller
@RequestMapping("/search")
public class SearchController {

    @RequestMapping("")
    public String search() {
        return "search";
    }
}
