package com.sk.study.demo.springcloud.simple.consumer.feign.controller;

import com.sk.study.demo.springcloud.simple.consumer.feign.api.UserClient;
import com.sk.study.demo.springcloud.simple.consumer.model.BO.UserBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sk
 * create on  2020/6/12:22:37
 */
@RestController
@Slf4j
@RequestMapping("feignconsumer")
public class FeignController {
    @Autowired
    UserClient userClient;

    @GetMapping("{id}")
    public UserBO controller(@PathVariable("id") Integer id) {
        return userClient.queryById(id);
    }
    public String controllerFallBack() {
        log.info("consumer default FallBack");
        return "Feign挂了";
    }
}
