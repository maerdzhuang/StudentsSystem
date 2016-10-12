package com.zxj.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	private Integer gid;
	private String classname;
	private String classdesc;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Grade() {
	}

	/** minimal constructor */
	public Grade(Integer gid) {
		this.gid = gid;
	}

	/** full constructor */
	public Grade(Integer gid, String classname, String classdesc, Set students) {
		this(classname,classdesc);
		this.gid = gid;
		this.students = students;
	}
	
	public Grade(String classname,String classdesc)
	{
		this.classname = classname;
		this.classdesc = classdesc;
	}

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getClassdesc() {
		return this.classdesc;
	}

	public void setClassdesc(String classdesc) {
		this.classdesc = classdesc;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}