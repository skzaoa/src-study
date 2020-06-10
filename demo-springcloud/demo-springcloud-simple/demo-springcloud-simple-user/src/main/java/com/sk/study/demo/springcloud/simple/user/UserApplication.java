package com.sk.study.demo.springcloud.simple.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author sk
 * create on  2020/6/9:22:01
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.sk.study.demo.springcloud.simple.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
