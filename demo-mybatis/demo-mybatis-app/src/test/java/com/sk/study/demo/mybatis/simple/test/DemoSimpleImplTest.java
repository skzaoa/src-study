package com.sk.study.demo.mybatis.simple.test;

import com.sk.study.demo.mybatis.simple.dao.api.TUserImplDao;
import com.sk.study.demo.mybatis.simple.dao.impl.TUserImplDaoImpl;

import com.sk.study.demo.mybatis.simple.model.TUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
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
        List<TUser> tUserList = tUserDao.findAll();
        for(TUser tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
        //6、释放资源
        in.close();
    }
}
