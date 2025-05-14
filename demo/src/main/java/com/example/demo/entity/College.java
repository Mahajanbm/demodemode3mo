package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity

public class College {
	@Id
	private int regNo;
	private String name;
	private String loc;
	@OneToMany(targetEntity = Student.class)
	private List<Student> student;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int regNo, String name, String loc, List<Student> student) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.loc = loc;
		this.student = student;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	

}
