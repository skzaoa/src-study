package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.PO.TUserAliasPO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/15:20:45
 */
public interface TUserAliasXmlDao {
    public List<TUserAliasPO> findAll();
}
