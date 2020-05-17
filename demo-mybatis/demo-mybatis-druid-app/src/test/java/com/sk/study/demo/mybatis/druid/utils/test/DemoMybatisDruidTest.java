package com.sk.study.demo.mybatis.druid.utils.test;

import com.sk.study.demo.mybatis.druid.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sk
 * create on  2020/5/16:21:44
 */
public class DemoMybatisDruidTest {
    public static final Logger logger = LoggerFactory.getLogger(DemoMybatisDruidTest.class);
    @Test
    public  void mybatisUtilTest() {
        SqlSession session = MybatisUtil.getSession();
        logger.info("获取连接成功：{}",session);
        session.close();
    }
}
