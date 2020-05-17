package com.sk.study.demo.mybatis.simple.test;

import com.sk.study.demo.mybatis.simple.dao.api.TUserAnnotationDao;
import com.sk.study.demo.mybatis.simple.model.PO.TUserPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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
public class DemoSimpleAnnotationTest {
    public static final Logger logger = LoggerFactory.getLogger(DemoSimpleAnnotationTest.class);

    public static void main(String[] args) throws IOException {
        //1、读取配置文件
        InputStream in = Resources.getResourceAsStream("Mybatis-Config.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3、使用工厂SqlSession
        SqlSession session = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        TUserAnnotationDao tUser1Dao = session.getMapper(TUserAnnotationDao.class);
        //5、使用代理对象执行方法
        List<TUserPO> tUserList = tUser1Dao.findAll();
        for(TUserPO tUser : tUserList){
            System.out.println(tUser);
            logger.info(tUser.toString());
        }
        //6、释放资源
        session.close();
        in.close();
    }
}
