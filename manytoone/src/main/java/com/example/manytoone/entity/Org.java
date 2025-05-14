package com.example.manytoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Org {
	@Id
	private int regNo;
	private String name;
	private String city;
	public Org(int regNo, String name, String city) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.city = city;
	}
	public Org() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



}
