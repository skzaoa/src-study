package com.sk.study.demo.mybatis.simple.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao;
import com.sk.study.demo.mybatis.simple.dao.impl.TUserImplDaoImpl;

import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis 基于实现类开发
 * @author sk
 * create on  2020/5/12:20:27
 */
public class DemoSimpleImplTest {
    public static final Logger logger = LoggerFactory.getLogger(DemoSimpleImplTest.class);

    public static void main(String[] args) throws IOException {
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //4、使用SqlSession创建Dao接口的代理对象
        TUserImplDao tUserDao = new TUserImplDaoImpl(factory);
        //5、使用代理对象执行方法
        List<TUserPO> tUserList = tUserDao.findAll();
        for(TUserPO tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
        //6、释放资源
        in.close();
    }

    //@Test
    public void insertTUserTest() throws IOException, ParseException {
        DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
        Date date = df.parse("2020-01-01");
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //4、使用SqlSession创建Dao接口的代理对象
        TUserImplDao tUserDao = new TUserImplDaoImpl(factory);
        //5、使用代理对象执行方法
        TUserPO tUserPO = new TUserPO();
        tUserPO.setName("33333");
        tUserPO.setSex("M");
        tUserPO.setBirthday(date);
        tUserPO.setCertType("3");
        tUserPO.setCertNo("3333333333333");


        tUserDao.insertTUser(tUserPO);
        List<TUserPO> tUserList = tUserDao.findAll();
        for(TUserPO tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
        //6、释放资源
        in.close();
    }
}
