package com.ph.dao;

import java.util.List;

import com.ph.entity.Teacher;


/**
 * 教师
 * 项目名称:SpringDemo01
 * 类名称:TeacherDao
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午1:47:09
 * @version
 */
public interface TeacherDao {

	Teacher findOneById(int id);
	
	List<Teacher> findAll();
	
	int addTeacher(Teacher teacher);
	
}
