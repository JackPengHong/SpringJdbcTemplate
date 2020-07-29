package com.ph.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet resultSet, int arg1) throws SQLException {
		int id =Integer.parseInt(resultSet.getString("id"));
		String stuname=resultSet.getString("stuname");
		int age=Integer.parseInt(resultSet.getString("age"));
		
		Student student=new Student();
		student.setId(id);
		student.setStuname(stuname);
		student.setAge(age);
		
		return student;
	}

}
