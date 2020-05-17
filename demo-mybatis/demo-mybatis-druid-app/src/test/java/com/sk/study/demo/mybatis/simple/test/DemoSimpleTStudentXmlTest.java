package com.sk.study.demo.mybatis.simple.test;

import com.sk.study.demo.mybatis.druid.utils.MybatisUtil;
import com.sk.study.demo.mybatis.simple.dao.api.TStudentXmlDao;
import com.sk.study.demo.mybatis.simple.dao.api.TUserXmlDao;
import com.sk.study.demo.mybatis.simple.model.PO.TStudentPO;
import com.sk.study.demo.mybatis.simple.model.PO.TUserO2MPO;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/17:21:04
 */
public class DemoSimpleTStudentXmlTest {

    private static final Logger logger = LoggerFactory.getLogger(DemoSimpleXmlTest.class);

    private InputStream in;
    private SqlSession session;

    @Before
    public void init() {
        session = MybatisUtil.getSession();

    }

    @After
    public void destory() {
        MybatisUtil.closeSession(session);
    }

    @Test
    public void findAllTest() {
        TStudentXmlDao studentXmlDao = session.getMapper(TStudentXmlDao.class);
        //5、使用代理对象执行方法
        List<TStudentPO> studentPOList = studentXmlDao.findAll();
        for (TStudentPO studentPO : studentPOList) {
            logger.info("{}", studentPO);
        }
    }

    @Test
    public void findAllTeacherTest() {
        TUserXmlDao userXmlDao = session.getMapper(TUserXmlDao.class);
        //5、使用代理对象执行方法
        List<TUserO2MPO> userO2MPOList = userXmlDao.findAllTeacher();
        for (TUserO2MPO userO2MPO : userO2MPOList) {
            logger.info("{}", userO2MPO);
        }
    }

    @Test
    public void findAllTeacherAndStudentTest() {
        TUserXmlDao userXmlDao = session.getMapper(TUserXmlDao.class);
        //5、使用代理对象执行方法
        List<TUserO2MPO> userO2MPOList = userXmlDao.findAllTeacherAndStudent();
        for (TUserO2MPO userO2MPO : userO2MPOList) {
            logger.info("{}", userO2MPO);
        }
    }
}
