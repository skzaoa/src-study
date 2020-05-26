package com.sk.study.demo.spring.simple.dao.impl;

import com.sk.study.demo.spring.simple.dao.api.TUserDao1;
import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:11
 */
@Component("tUserDao1")
public class TUserDao1Impl implements TUserDao1 {

    public TUserDao1Impl() {
        System.out.println("TUserDao1Impl init");
    }

    @Override
    public List<TUserPO> findAll() {
        return null;
    }

    @Override
    public Boolean insertTUser(TUserPO tUserPO) {
        return null;
    }
}
