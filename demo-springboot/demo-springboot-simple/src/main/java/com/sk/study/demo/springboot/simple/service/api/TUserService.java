package com.sk.study.demo.springboot.simple.service.api;

import com.sk.study.demo.springboot.simple.model.BO.UserBO;
import com.sk.study.demo.springboot.simple.model.PO.TUserPO;

/**
 * @author sk
 * create on  2020/6/7:22:38
 */
//@FunctionalInterface
public interface TUserService {
    public UserBO queryById(Integer id);

    public void insert(TUserPO tUserPO);


}
