package com.sk.study.demo.mybatis.druid.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * @author songkang
 */
public class MybatisUtil {
	private static final Logger logger = LoggerFactory.getLogger(MybatisUtil.class);
	public static SqlSession getSession() {
		SqlSession session = null;
		try {
			InputStream in = Resources.getResourceAsStream("Mybatis-Config.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			session = factory.openSession();
		} catch (Exception e) {
			logger.error("工厂生产SqlSession失败",e);
		}
		return session;
	}
	
	public static void closeSession(SqlSession session) {
		session.commit();
		session.close();
	}

	private MybatisUtil() {
	}
}
