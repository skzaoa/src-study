package com.sk.study.demo.springboot.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sk
 * create on  2020/5/27:21:33
 */
@RestController
public class MyController {
    @RequestMapping("/controller")
    public String controller() {
        return "hello     11";
    }
}
