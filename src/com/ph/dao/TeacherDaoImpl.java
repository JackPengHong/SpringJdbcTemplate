package com.ph.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ph.entity.Teacher;
import com.ph.entity.TeacherRowMapper;

/**
 * 
 * 项目名称:SpringDemo01
 * 类名称:TeacherDaoImpl
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午1:49:16
 * @version
 */
public class TeacherDaoImpl implements TeacherDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Teacher findOneById(int id) {
		String sql="SELECT * FROM Teacher t WHERE t.id=?";
		return jdbcTemplate.queryForObject(sql,new TeacherRowMapper(),1);
	}

	@Override
	public List<Teacher> findAll() {
		String sql="SELECT * FROM Teacher ";
//		return this.jdbcTemplate.query(sql,new TeacherRowMapper());
		return this.jdbcTemplate.query(sql,new BeanPropertyRowMapper(Teacher.class));
	}

	@Override
	public int addTeacher(Teacher teacher) {
		String sql="INSERT INTO Teacher(tname,age,pmark)VALUE(?,?,?)";
		return this.jdbcTemplate.update(sql, teacher);
	}

	
	
}
