package com.honor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }

}
