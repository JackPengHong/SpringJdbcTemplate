package com.ph.template.test;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ph.template.utils.JdbcTemplateUtil;

/**
 * 
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo04
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午4:29:55
 * @version
 */
public class demo04 {

	/**
	 * Map<String, Object> queryForMap(String sql)
	 * 执行查询语句，将一条记录放到一个Map中
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		String sql="select * from product p where p.id=?";
		Map<String, Object> map=jdbcTemplate.queryForMap(sql,1);
		System.out.println("id:"+Integer.parseInt(map.get("id").toString()));
		System.out.println("name:"+map.get("name").toString());
		System.out.println("age:"+Integer.parseInt(map.get("age").toString()));
		System.out.println("update_time:"+map.get("update_time"));
	}
	
}
