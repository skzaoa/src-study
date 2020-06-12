package com.sk.study.demo.springcloud.simple.consumer.feign.impl;

import com.sk.study.demo.springcloud.simple.consumer.feign.api.UserClient;
import com.sk.study.demo.springcloud.simple.consumer.model.BO.UserBO;
import org.springframework.stereotype.Component;

/**
 * @author sk
 * create on  2020/6/12:23:02
 */
@Component
public class UserClientFallBackImpl implements UserClient {
    @Override
    public UserBO queryById(Integer id) {
        UserBO userBO = new UserBO();
        userBO.setRetCode("1");
        userBO.setRetMessage("没有对应id记录");
        return userBO;
    }
}
