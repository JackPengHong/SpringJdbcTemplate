package com.ph.test;


import java.util.List;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ph.entity.Student;
import com.ph.entity.Teacher;
import com.ph.service.StudentService;
import com.ph.service.TeacherService;

/**
 * 测试类
 * 项目名称:SpringJdbcTemplate
 * 类名称:Test01
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午3:22:35
 * @version
 */
public class Test01 {

	public static void main(String[] arg){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService studentService=(StudentService)context.getBean("studentService");
//		Student student=new Student();
//		student.setStuname("殷天正");
//		student.setAge(50);
//		studentService.addStudent(student);
		
		List<Student> students=studentService.getStudentsAll();
		for(Student stu:students){
			System.out.println("学生ID:"+stu.getId());
			System.out.println("学生姓名:"+stu.getStuname());
			System.out.println("学生年龄:"+stu.getAge());
			
		}
	}
	
	@Test
	public void testTeacher(){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService)context.getBean("teacherService");
		System.out.println("开始执行");
		List<Teacher> teachers=teacherService.findAll();
		
		for(Teacher teacher:teachers){
			System.out.println("教师ID:"+teacher.getId());
			System.out.println("教师姓名:"+teacher.getTname());
			System.out.println("教师年龄:"+teacher.getAge());
			System.out.println("教师简介:"+teacher.getPmark());
		}
		
	}
	
	
}
