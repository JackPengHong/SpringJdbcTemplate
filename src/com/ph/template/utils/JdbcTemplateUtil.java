package com.ph.template.utils;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.DriverManagerDataSource;

/**
 * 工具类
 * 项目名称:SpringJdbcTemplate
 * 类名称:JdbcTemplateUtils
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午3:46:06
 * @version
 */
public class JdbcTemplateUtil {

	/**
	 * 创建JdbcTemplate对象
	 * @return JdbcTemplate对象
	 */ 
	public static JdbcTemplate getJdbcTemplateUtil(){
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/abs");
		dataSource.setUser("root");
		dataSource.setPassword("mysql");
		return new JdbcTemplate(dataSource);
	}
	
	
}
