package com.example.manytomany.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Subject {
	@Id
	private int scode;
	private String name;
	private  String publication;
	@ManyToMany(targetEntity = Teacher.class)
	private Set teachers;
	public Subject(int scode, String name, String publication, Set teachers) {
		super();
		this.scode = scode;
		this.name = name;
		this.publication = publication;
		this.teachers = teachers;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Set getTeachers() {
		return teachers;
	}
	public void setTeachers(Set teachers) {
		this.teachers = teachers;
	}
	

}
