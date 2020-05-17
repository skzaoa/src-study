package com.sk.study.demo.mybatis.simple.dao.api;

import com.sk.study.demo.mybatis.simple.model.PO.TStudentPO;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/17:20:58
 */
public interface TStudentXmlDao {
    List<TStudentPO> findAll();
}
