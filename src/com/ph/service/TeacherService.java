package com.ph.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ph.entity.Teacher;

/**
 * 教师业务层
 * 项目名称:SpringDemo01
 * 类名称:TeacherService
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午2:07:35
 * @version
 */
@Service
public interface TeacherService {

	List<Teacher> findAll();
	
	Teacher findOneById(int id);
	
	int addTeacher(Teacher teacher);
	
}
