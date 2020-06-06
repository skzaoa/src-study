package com.sk.study.demo.springboot.simple.config;

/**
 * @author sk
 * create on  2020/6/4:20:02
 */
//@ConfigurationProperties(prefix = "jdbc")
//@Data
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
