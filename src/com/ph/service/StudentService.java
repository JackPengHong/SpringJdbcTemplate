package com.ph.service;

import java.util.List;

import com.ph.entity.Student;

/**
 * 
 * 项目名称:SpringDemo01
 * 类名称:StudentService
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午2:06:45
 * @version
 */
public interface StudentService {

	int addStudent(Student student);
	
	List<Student> getStudentsAll();
	
	
}
