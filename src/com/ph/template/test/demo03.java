package com.ph.template.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ph.template.utils.JdbcTemplateUtil;

/**
 * JdbcTemplate测试类 
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo03
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午4:16:10
 * @version
 */
public class demo03 {
	
	/**
	 * int queryForInt(String sql)
	 * 执行查询语句，返回一个int类型的值
	 * long queryForLong(String sql)
	 * 执行查询语句，返回一个long类型的数据
	 * <T> T queryForObject(String sql, Class<T> requiredType)
	 * 执行查询语句，返回一个指定类型的数据
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		String sql="select p.age from product p where p.id=?";
		int age =jdbcTemplate.queryForInt(sql,1);
		System.out.println("年限:"+age);
		Long lage =jdbcTemplate.queryForLong(sql,1);
		System.out.println("年限:"+lage);
		String sql2="select p.update_time from product p where p.id=?";
		Date updateTime=jdbcTemplate.queryForObject(sql2,Date.class,1);
		System.out.println("时间:"+updateTime);
		String sql1="select p.name from product p where p.id=?";
		String pname=jdbcTemplate.queryForObject(sql1,String.class,1);
		System.out.println("产品名称:"+pname);

	}
	
}
