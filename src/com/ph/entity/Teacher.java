package com.ph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 教师实体类
 * 项目名称:SpringDemo01
 * 类名称:Teacher
 * 创建人:彭鸿
 * 类描述:
 * 创建时间:2020年7月29日下午1:50:12
 * @version
 */
@Entity
@Table(name="Teacher",schema="abs")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",insertable=false,nullable=false,updatable=false)
	private int id;
	@Column(name="tname")
	private String tname;
	
	@Column(name="age")
	private int age;
	@Column(name="pmark")
	private String pmark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPmark() {
		return pmark;
	}
	public void setPmark(String pmark) {
		this.pmark = pmark;
	}

	
	
}
