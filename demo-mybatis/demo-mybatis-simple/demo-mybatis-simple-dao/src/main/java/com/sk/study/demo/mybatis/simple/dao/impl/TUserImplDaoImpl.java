package com.sk.study.demo.mybatis.simple.dao.impl;

import com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao;
import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author sk
 * create on  2020/5/13:21:03
 */
public class TUserImplDaoImpl implements TUserImplDao {

    public static final Logger logger = LoggerFactory.getLogger(TUserImplDaoImpl.class);

    SqlSessionFactory factory;
    public TUserImplDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public List<TUserPO> findAll() {
        SqlSession session = factory.openSession();
        List<TUserPO> tUserList = session.selectList("com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao.findAll");
        session.close();
        return tUserList;
    }

    @Override
    public void insertTUser(TUserPO tUserPO) {
        logger.info(tUserPO.toString());
        SqlSession session = factory.openSession();
        session.insert("com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao.insertTUser", tUserPO);
        session.commit();
        session.close();

    }
}
