package com.mz.mzshop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 13:53
 * Version:V1.0
 */
@Controller
public class IndexAction {
    @RequestMapping("/")
    public String index(){
        return "login";
    }

    @RequestMapping("/{page}")
    public String page(@PathVariable("page") String page){
        return page;
    }
}
