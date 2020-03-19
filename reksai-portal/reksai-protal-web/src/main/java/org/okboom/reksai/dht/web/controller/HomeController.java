package org.okboom.reksai.dht.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tookbra
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }
}
