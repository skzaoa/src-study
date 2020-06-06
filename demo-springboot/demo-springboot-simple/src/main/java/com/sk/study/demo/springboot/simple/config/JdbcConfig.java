package com.sk.study.demo.springboot.simple.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author sk
 * create on  2020/6/4:19:44
 */
@Configuration
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

/*    @Value("${jdbc.driver}")
    String driver;
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;*/

    /*@Autowired
    JdbcProperties jdbcProperties; //使用配置类 注入配置方法1：自动注入

    public JdbcConfig (JdbcProperties jdbcProperties) { //使用配置类 注入配置方法2：构造函数
        this.jdbcProperties = jdbcProperties;
    }*/

    /*@Bean
    //使用配置类 JdbcProperties.java
    public DataSource dataSource(JdbcProperties prop) { //使用配置类 注入配置方法3：方法中
        DruidDataSource dataSource = new DruidDataSource();
        *//*dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);*//*
        dataSource.setDriverClassName(prop.getDriver());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());
        return dataSource;
    }*/


     //方法上加注解
     @Bean
     @ConfigurationProperties(prefix = "jdbc")
     public DataSource dataSource() { //注入配置方法3：方法中
         return new DruidDataSource();
     }
}
