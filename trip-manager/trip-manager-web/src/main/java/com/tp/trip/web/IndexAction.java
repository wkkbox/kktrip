package com.tp.trip.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {

    /*登录主页*/
    @RequestMapping("/")
    public String index() {
        return "superuserindex";
    }

    /*跳转页面*/
    @RequestMapping("/{page}")
    public String index(@PathVariable("page") String page) {
        return page;
    }


}
