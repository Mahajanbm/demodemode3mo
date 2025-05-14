package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.College;


public interface CollegeService {
	College addCollege(College college);
	College updateCollege(College college);
	List<College> getColleges();
	void deleteCollege(Integer Id);
}
