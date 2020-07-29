package com.ph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 学生实体类
 * 项目名称:SpringJdbcTemplate
 * 类名称:Student
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午3:59:23
 * @version
 */
@Entity
@Table(name="Student",schema="abs")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",insertable=false,nullable=false,updatable=false)
	private int id;
	
	@Column(name="stuname")
	private String stuname;
	
	@Column(name="age")
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
