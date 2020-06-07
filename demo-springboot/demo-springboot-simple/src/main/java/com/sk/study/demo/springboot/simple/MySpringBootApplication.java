package com.sk.study.demo.springboot.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author sk
 * create on  2020/5/27:21:02
 */
@SpringBootApplication
@MapperScan("com.sk.study.demo.springboot.simple.mapper")
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }
}
