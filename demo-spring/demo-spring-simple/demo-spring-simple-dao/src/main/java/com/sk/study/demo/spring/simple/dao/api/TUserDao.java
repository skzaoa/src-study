package com.sk.study.demo.spring.simple.dao.api;


import com.sk.study.demo.spring.simple.model.PO.TUserPO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/12:19:42
 */
public interface TUserDao {
    /**
     *
     * @return
     */
    List<TUserPO> findAll();

    Boolean insertTUser(TUserPO tUserPO);

}
