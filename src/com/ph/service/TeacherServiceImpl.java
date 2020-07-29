package com.ph.service;

import java.util.List;

import com.ph.dao.TeacherDao;
import com.ph.entity.Teacher;

/**
 * 教师业务层实现
 * 项目名称:SpringDemo01
 * 类名称:TeacherServiceImpl
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午2:11:03
 * @version
 */
public class TeacherServiceImpl implements TeacherService {
	
	private TeacherDao teacherDao;
	
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public List<Teacher> findAll() {
		return this.teacherDao.findAll();
	}

	@Override
	public Teacher findOneById(int id) {
		return this.teacherDao.findOneById(id);
	}

	@Override
	public int addTeacher(Teacher teacher) {
		return this.teacherDao.addTeacher(teacher);
	}

}
