package com.sk.study.demo.springcloud.simple.consumer.controller;

import com.sk.study.demo.springcloud.simple.consumer.model.BO.UserBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @author sk
 * create on  2020/5/27:21:12
 */
//@controller
@RestController
@Slf4j
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("{id}")
    //@ResponseBody
    public UserBO controller(@PathVariable("id") Integer id) {
        log.info("consumer");
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);

        //String url = "http://localhost:8081/user/" + id;
        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;
        log.info(url);
        return restTemplate.getForObject(url, UserBO.class);
    }
}
