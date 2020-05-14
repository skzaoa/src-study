package com.sk.study.demo.mybatis.simple.test;
import java.util.Date;

import com.sk.study.demo.mybatis.simple.dao.api.TUserXmlDao;
import com.sk.study.demo.mybatis.simple.model.TUser;
import com.sk.study.demo.mybatis.simple.model.VO.UserVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/12:20:27
 */
public class DemoSimpleXmlTest {
    public static final Logger logger = LoggerFactory.getLogger(DemoSimpleXmlTest.class);

    InputStream in;
    SqlSession session;
    TUserXmlDao tUserDao;
    @Before
    public void init() throws IOException {
        //1、读取配置文件
        in = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3、使用工厂SqlSession
        session = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        tUserDao = session.getMapper(TUserXmlDao.class);
    }

    @After
    public void destory() throws IOException {
        session.commit();
        //6、释放资源
        session.close();
        in.close();
    }

    @Test
    public void findAllTest(){
        //5、使用代理对象执行方法
        List<TUser> tUserList = tUserDao.findAll();
        for(TUser tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
    }

    @Test
    public void findByNameTest(){
        //5、使用代理对象执行方法
        List<TUser> tUserList = tUserDao.findByName("%2%");
        for(TUser tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
    }

    @Test
    public void findByVOTest(){


        TUser tUser1 = new TUser();
        tUser1.setName("%2%");

        UserVO userVO = new UserVO();
        userVO.setOtherName("");
        userVO.settUser(tUser1);

        logger.info("userVO={}",userVO);
        //5、使用代理对象执行方法
        List<TUser> tUserList = tUserDao.findByVO(userVO);
        for(TUser tUser : tUserList){
            logger.info("tUser={}",tUser);

        }
    }

    @Test
    public void addTUserTest(){
        TUser tUser = new TUser();
        tUser.setName("22");
        tUser.setSex("F");
        tUser.setBirthday(new Date());
        tUser.setCertType("I");
        tUser.setCertNo("22222222222222");
        System.out.println(tUser);
        //5、使用代理对象执行方法
        tUserDao.addTUser(tUser);
        System.out.println(tUser);
    }

    @Test
    public void updateTUserTest() {
        TUser tUser = new TUser();
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
