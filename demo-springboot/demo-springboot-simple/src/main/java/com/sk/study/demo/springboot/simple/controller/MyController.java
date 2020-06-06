package com.sk.study.demo.springboot.simple.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author sk
 * create on  2020/5/27:21:12
 */
//@Controller
@RestController
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/controller.do")
    //@ResponseBody
    public String controller() {
        logger.info("1111111111");
        return "hello  12";
    }
}
