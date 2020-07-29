package com.ph.template.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ph.template.utils.JdbcTemplateUtil;

/**
 * 
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo05
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午4:38:46
 * @version
 */
public class demo05 {
	
	/**
	 * List<Map<String, Object>> queryForList(String sql,Object... args)
	 * 执行查询语句，返回一个List集合，List中存放的是Map类型的数据。
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		String sql="SELECT * FROM product p where p.id<?";
		List<Map<String, Object>> maps=jdbcTemplate.queryForList(sql,4);
		for(Map<String, Object> map:maps){
			System.out.println("id:"+Integer.parseInt(map.get("id").toString()));
			System.out.println("name:"+map.get("name").toString());
			System.out.println("age:"+Integer.parseInt(map.get("age").toString()));
			System.out.println("update_time:"+map.get("update_time"));
		}
	}
	
	
}
