package com.sk.study.demo.springcloud.simple.consumer.feign.api;

import com.sk.study.demo.springcloud.simple.consumer.feign.impl.UserClientFallBackImpl;
import com.sk.study.demo.springcloud.simple.consumer.model.BO.UserBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author sk
 * create on  2020/6/12:22:35
 */
@FeignClient(value = "user-service", fallback = UserClientFallBackImpl.class)
public interface UserClient {
    @GetMapping("user/{id}")
    UserBO queryById(@PathVariable("id")Integer id);
}
