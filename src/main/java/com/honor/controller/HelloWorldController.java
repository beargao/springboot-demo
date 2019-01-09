package com.honor.controller;

import com.honor.async.AsyncDemo;
import com.honor.service.sys.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rongyaowen
 * on 2019/1/3.
 */
@Controller
public class HelloWorldController {
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private AsyncDemo asyncDemo;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        int i = 1 / 0;
//        for (int i = 0; i < 10; i++) {
//            asyncDemo.test(i);
//        }
//        System.out.println("主线程id:" + Thread.currentThread().getId());
        return "Hello World!";
    }

    @RequestMapping("/select")
    @ResponseBody
    public String select() {
        return sysUserService.selectAll().toString();
    }
}
