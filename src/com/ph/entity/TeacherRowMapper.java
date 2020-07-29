package com.ph.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class TeacherRowMapper implements RowMapper<Teacher>{

	@Override
	public Teacher mapRow(ResultSet resultSet, int arg1) throws SQLException {
		int id=Integer.parseInt(resultSet.getString("id"));
		String tname=resultSet.getString(2);
		int age=Integer.parseInt(resultSet.getString(3));
		String pmark=resultSet.getString(4);
		
		Teacher teacher=new Teacher();
		teacher.setId(id);
		teacher.setTname(tname);
		teacher.setAge(age);
		teacher.setPmark(pmark);
		
		return teacher;
	}

}
