package com.honor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rongyaowen
 * on 2019/1/9.
 */
@Controller
@RequestMapping("/freemarker")
public class FreeMarkerController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "kangkang");
        return "hello-free-marker";
    }

    @RequestMapping("/hello02")
    public String hello02(Model model) {
        model.addAttribute("name", "kangkang");
        return "hello-free-marker02";
    }
}
