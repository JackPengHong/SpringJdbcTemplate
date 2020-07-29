package com.ph.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ph.entity.Student;
import com.ph.entity.StudentRowMapper;



/**
 * 学生dao层
 * 项目名称:SpringDemo01
 * 类名称:StudentDaoImpl
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午1:54:53
 * @version
 */
public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public int addStudent(Student student) {
		String sql="INSERT INTO Student(stuname,age)VALUE(?,?)";
		return jdbcTemplate.update(sql,student.getStuname(),student.getAge());
	}

	@Override
	public List<Student> getStudentsAll() {
		String sql="Select * from student";
		return jdbcTemplate.query(sql,new StudentRowMapper());
	}
	
	
	
	
}
