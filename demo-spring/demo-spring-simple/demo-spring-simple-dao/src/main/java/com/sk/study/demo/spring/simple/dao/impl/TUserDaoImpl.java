package com.sk.study.demo.spring.simple.dao.impl;

import com.sk.study.demo.spring.simple.dao.api.TUserDao;
import com.sk.study.demo.spring.simple.model.PO.TUserPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/21:22:11
 */
public class TUserDaoImpl implements TUserDao {

    @Override
    public List<TUserPO> findAll() {
        return null;
    }

    @Override
    public Boolean insertTUser(TUserPO tUserPO) {
        return null;
    }
}
