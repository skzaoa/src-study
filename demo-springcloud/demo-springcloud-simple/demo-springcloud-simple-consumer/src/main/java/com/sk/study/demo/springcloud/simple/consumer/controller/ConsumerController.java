package com.sk.study.demo.springcloud.simple.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sk.study.demo.springcloud.simple.consumer.model.BO.UserBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
@DefaultProperties(defaultFallback = "controllerFallBack")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    /*@Autowired
    private LoadBalancerClient api;*/

    @GetMapping("{id}")
    //@ResponseBody
    //@HystrixCommand(fallbackMethod = "controllerFallBack")
    /*@HystrixCommand(commandProperties = {           //全局配置在配置文件中
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    }) //可以在类上设置为默认，不必每个方法上都要写*/
    @HystrixCommand
    public String controller(@PathVariable("id") Integer id) {
        log.info("consumer");
        /*List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);*/

        /*ServiceInstance instance = api.choose("user-service");

        //String url = "http://localhost:8081/user/" + id;
        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;*/
        String url = "http://user-service/user/"+id;
        log.info(url);
        return JSON.toJSONStringWithDateFormat(restTemplate.getForObject(url, UserBO.class), "yyyy-MM-dd");
        //return restTemplate.getForObject(url, UserBO.class);
    }
    /* 写在方法上上，需要跟方法参数、返回值一致
    public String controllerFallBack(Integer id) {
        log.info("consumer FallBack");
        return "挂了";
    }*/
    /*设置为默认后，参数需要为空，返回值可以自定义*/
    public String controllerFallBack() {
        log.info("consumer default FallBack");
        return "挂了";
    }
}
