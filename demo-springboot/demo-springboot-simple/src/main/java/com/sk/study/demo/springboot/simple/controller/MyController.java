package com.sk.study.demo.springboot.simple.controller;

import com.sk.study.demo.springboot.simple.model.BO.UserBO;
import com.sk.study.demo.springboot.simple.service.api.TUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author sk
 * create on  2020/5/27:21:12
 */
//@Controller
@RestController
@Slf4j
@RequestMapping("user")
public class MyController {

    @Autowired
    private TUserService tUserService;

    @GetMapping("{id}")
    //@ResponseBody
    public UserBO controller(@PathVariable("id") Integer id) {
        log.info("user");
        return tUserService.queryById(id);
    }
}
