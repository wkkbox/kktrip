package com.tp.trip.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {

    @RequestMapping("/")
    public String index(){
        return "superuserindex";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable("page") String page){
        return page;
    }
}
