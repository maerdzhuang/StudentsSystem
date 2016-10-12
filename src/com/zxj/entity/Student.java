package com.zxj.entity;

import java.util.Date;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String sid;
	private Grade grade;
	private String sname;
	private String gender;
	private Integer age;
	private Date birthdate;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String sid) {
		this.sid = sid;
	}

	/** full constructor */
	public Student(String sid, Grade grade, String sname, String gender,
			Integer age, Date birthdate) {
		this.sid = sid;
		this.grade = grade;
		this.sname = sname;
		this.gender = gender;
		this.age = age;
		this.birthdate = birthdate;
	}

	// Property accessors

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", grade=" + grade + ", sname=" + sname
				+ ", gender=" + gender + ", age=" + age + ", birthdate="
				+ birthdate + "]";
	}

}