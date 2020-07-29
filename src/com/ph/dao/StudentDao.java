package com.ph.dao;


import java.util.List;


import com.ph.entity.Student;

/**
 * DAO²ã
 * @author LENOVO-PC
 *
 */
public interface StudentDao {

	int addStudent(Student student);
	
	List<Student> getStudentsAll();
	
}
