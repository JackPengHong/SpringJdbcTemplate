package com.ph.service;

import java.util.List;

import com.ph.dao.StudentDao;
import com.ph.dao.StudentDaoImpl;
import com.ph.entity.Student;


/**
 * 
 * @author LENOVO-PC
 *
 */
public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao){
		this.studentDao=studentDao;
	}
	
	@Override
	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> getStudentsAll() {
		return studentDao.getStudentsAll();
	}

	
	
	
	
}
