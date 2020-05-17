package com.sk.study.demo.mybatis.druid.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDataSourceFactory implements DataSourceFactory {
	private static final Logger logger = LoggerFactory.getLogger(DruidDataSourceFactory.class);
	private Properties props;

	/**
	 * 获取数据源
	 * @return
	 */
	@Override
	public DataSource getDataSource() {
		DruidDataSource dds = new DruidDataSource();
		dds.setDriverClassName(props.getProperty("jdbc.driver"));
		dds.setUrl(props.getProperty("url"));
		dds.setUsername(props.getProperty("username"));
		dds.setPassword(props.getProperty("password"));
		try {
			dds.init();
		} catch (SQLException e) {
			logger.error("连接池失败",e);
		}
		return dds;
	}

	@Override
	public void setProperties(Properties props) {
		this.props = props;
	}
}
