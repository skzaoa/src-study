package com.sk.study.demo.mybatis.simple.test;

import com.sk.study.demo.mybatis.druid.utils.MybatisUtil;
import com.sk.study.demo.mybatis.simple.dao.api.TUserXmlDao;
import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;
import com.sk.study.demo.mybatis.simple.model.VO.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * mybatis 基于xml配置文件开发
 *
 * @author sk
 * create on  2020/5/12:20:27
 */
public class DemoSimpleXmlTest {
    private static final Logger logger = LoggerFactory.getLogger(DemoSimpleXmlTest.class);

    private InputStream in;
    private SqlSession session;
    private TUserXmlDao tUserDao;

    @Before
    public void init() {
        session = MybatisUtil.getSession();
        tUserDao = session.getMapper(TUserXmlDao.class);
    }

    @After
    public void destory() {
        MybatisUtil.closeSession(session);
    }

    @Test
    public void findAllTest() {
        //5、使用代理对象执行方法
        List<TUserPO> tUserList = tUserDao.findAll();
        for (TUserPO tUser : tUserList) {
            logger.info("{}", tUser);
        }
    }

    @Test
    public void findByNameTest() {
        //5、使用代理对象执行方法
        List<TUserPO> tUserList = tUserDao.findByName("%2%");
        for (TUserPO tUser : tUserList) {
            logger.info("{}", tUser);
        }
    }

    @Test
    public void findByVOTest() {

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(6);
        integerList.add(23);
        TUserPO tUser1 = new TUserPO();
        tUser1.setName("%2%");
        UserVO userVO = new UserVO();
        userVO.setOtherName("");
        userVO.settUser(tUser1);

        userVO.setIds(integerList);

        logger.info("userVO={}", userVO);
        //5、使用代理对象执行方法
        List<TUserPO> tUserList = tUserDao.findByVO(userVO);
        for (TUserPO tUser : tUserList) {
            logger.info("tUser={}", tUser);

        }
    }

    @Test
    public void addTUserTest() {
        TUserPO tUser = new TUserPO();
        tUser.setName("22");
        tUser.setSex("F");
        tUser.setBirthday(new Date());
        tUser.setCertType("I");
        tUser.setCertNo("22222222222222");
        logger.info("{}", tUser);
        //5、使用代理对象执行方法
        tUserDao.addTUser(tUser);
        logger.info("{}", tUser);
    }

    @Test
    public void updateTUserTest() {
        TUserPO tUser = new TUserPO();
        tUser.setId(2);
        tUser.setName("222");
        tUser.setSex("F");
        tUser.setBirthday(new Date());
        tUser.setCertType("I");
        tUser.setCertNo("22222222222222");

        //5、使用代理对象执行方法
        tUserDao.updateTUser(tUser);
    }

    @Test
    public void deleteTUserTest() {


        //5、使用代理对象执行方法
        tUserDao.deleteTUser(3);
    }
}
