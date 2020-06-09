package com.sk.study.demo.springcloud.simple.user.service.api;

import com.sk.study.demo.springcloud.simple.user.model.BO.UserBO;


/**
 * @author sk
 * create on  2020/6/9:22:09
 */
public interface UserService {

    public UserBO queryById(Integer id);
}
