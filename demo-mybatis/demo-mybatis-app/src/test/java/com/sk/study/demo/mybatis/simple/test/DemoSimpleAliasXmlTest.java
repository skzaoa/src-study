package com.sk.study.demo.mybatis.simple.test;

import com.sk.study.demo.mybatis.simple.dao.api.TUserAliasXmlDao;
import com.sk.study.demo.mybatis.simple.model.PO.TUserAliasPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sk
 * create on  2020/5/15:20:49
 */
public class DemoSimpleAliasXmlTest {
    private static final Logger logger = LoggerFactory.getLogger(DemoSimpleAliasXmlTest.class);
    @Test
    public void findAllTest() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis-Config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        SqlSession session = factory.openSession();

        TUserAliasXmlDao tUserAliasXmlDao = session.getMapper(TUserAliasXmlDao.class);

        List<TUserAliasPO> tUserAliasPOList = tUserAliasXmlDao.findAll();
        for (TUserAliasPO tUserAliasPO : tUserAliasPOList){
            logger.info("tUserAlias={}",tUserAliasPO);
        }
    }
}
