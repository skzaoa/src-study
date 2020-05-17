package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/12:19:42
 */
public interface TUserImplDao {
    /**
     *
     * @return
     */
    List<TUserPO> findAll();

    void insertTUser(TUserPO tUserPO);

}
