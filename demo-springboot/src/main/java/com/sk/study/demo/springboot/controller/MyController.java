package com.sk.study.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sk
 * create on  2020/5/27:21:12
 */
@Controller
public class MyController {

    @RequestMapping("/controller")
    @ResponseBody
    public String controller() {
        return "hello  1";
    }
}
