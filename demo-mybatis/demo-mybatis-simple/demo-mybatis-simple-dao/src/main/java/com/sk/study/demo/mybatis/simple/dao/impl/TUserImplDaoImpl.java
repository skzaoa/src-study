package com.sk.study.demo.mybatis.simple.dao.impl;

import com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao;
import com.sk.study.demo.mybatis.simple.model.TUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/13:21:03
 */
public class TUserImplDaoImpl implements TUserImplDao {

    SqlSessionFactory factory;
    public TUserImplDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<TUser> findAll() {
        SqlSession session = factory.openSession();
        List<TUser> tUserList = session.selectList("com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao.findAll");
        session.close();
        return tUserList;
    }
}
