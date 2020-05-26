package com.sk.study.demo.spring.simple.service.factory;

import com.sk.study.demo.spring.simple.service.api.QueryUserService;
import com.sk.study.demo.spring.simple.service.impl.QueryUserServiceImpl;

/**
 * @author sk
 * create on  2020/5/23:21:31
 */
public class StaticFactory {
    private static QueryUserService getQueryUserService(){
        return new QueryUserServiceImpl();
    }
}
