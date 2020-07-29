package com.ph.template.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ph.template.utils.JdbcTemplateUtil;

/**
 * JdbcTemplate测试类
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo01
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午3:49:41
 * @version
 */
public class demo01 {
	
	/**
	 * execute(final String sql)
	 * execute可以执行所有SQL语句，因为没有返回值，一般用于执行DDL语句
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		String sql="CREATE TABLE product ("
				+ " id INT(11) NOT NULL, "
				+ " name VARCHAR(25) DEFAULT NULL,"
				+ " age INT(11)  NOT NULL DEFAULT 0,"
				+ " update_time DATETIME DEFAULT NULL,"
				+ " PRIMARY KEY (id)"
				+ " ) ENGINE=INNODB DEFAULT CHARSET=utf8;";
		jdbcTemplate.execute(sql); //执行sql语句
	}
	
}
