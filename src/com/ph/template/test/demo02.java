package com.ph.template.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ph.entity.Product;
import com.ph.template.utils.JdbcTemplateUtil;

/**
 * JdbcTemplate测试类 
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo02
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午3:50:33
 * @version
 */
public class demo02 {
	
	/**
	 * public int update(final String sql)
	 * 用于执行INSERT、UPDATE、DELETE`等DML语句
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		//1.insert
		String sql1="insert into product(id,name,age,update_time)value(?,?,?,?)";
		int i=jdbcTemplate.update(sql1,4,"4号产品",40,new Date());
		System.out.println("新增行数:"+i);
		//2.update
		String sql2="UPDATE product p SET p.age=? WHERE p.id=?";
		int u=jdbcTemplate.update(sql2,25,4);
		System.out.println("修改行数:"+u);
		//3.delete
		String sql3="DELETE FROM product WHERE id =?";
		int d=jdbcTemplate.update(sql3,4);
		System.out.println("删除行数:"+d);
	}
	
}
