package com.ph.template.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ph.entity.Product;
import com.ph.template.utils.JdbcTemplateUtil;

/**
 * 
 * 项目名称:SpringJdbcTemplate
 * 类名称:demo06
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午4:44:06
 * @version
 */
public class demo06 {
	
	/**
	 * <T> List<T> query(String sql, RowMapper<T> rowMapper)
	 * 执行查询语句，返回一个List集合，List中存放的是RowMapper指定类型的数据。
	 * class BeanPropertyRowMapper<T> implements RowMapper<T>
	 * BeanPropertyRowMapper类实现了RowMapper接口
	 */
	@Test
	public void test(){
		JdbcTemplate jdbcTemplate=JdbcTemplateUtil.getJdbcTemplateUtil();
		String sql="SELECT * FROM product ";
		List<Product> products=jdbcTemplate.query(sql,new RowMapper<Product>(){
			//匿名内部类
			@Override
			public Product mapRow(ResultSet arg0, int arg1) throws SQLException {
				Product product=new Product();
				product.setId(arg0.getInt("id"));
				product.setName(arg0.getString("name"));
				product.setAge(arg0.getInt(3));
				product.setUpdateTime(arg0.getDate(4));
				return product;
			}
		});
		for(Product product:products){
			System.out.println("id:"+product.getId());
			System.out.println("name:"+product.getName());
			System.out.println("age:"+product.getAge());
			System.out.println("update_time:"+product.getUpdateTime());
		}
		System.out.println("**BeanPropertyRowMapper类实现了RowMapper接口**");
		List<Product> productList=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product.class));
		for(Product product:productList){
			System.out.println("id:"+product.getId());
			System.out.println("name:"+product.getName());
			System.out.println("age:"+product.getAge());
			System.out.println("update_time:"+product.getUpdateTime());
		}
	}
}
