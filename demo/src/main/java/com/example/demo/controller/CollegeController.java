package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.serviceimple.CollegeServiceimple;

@RestController
@RequestMapping("College")
public class CollegeController {
	private	CollegeServiceimple collegeServiceimple;

	public CollegeController(CollegeServiceimple collegeServiceimple) {
		super();
		this.collegeServiceimple = collegeServiceimple;
	}
	@PostMapping
	public ResponseEntity<College> addEntity(@RequestBody College college)
	{
		College c1=collegeServiceimple.addCollege(college);
		return new ResponseEntity<College>(c1, HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<College>> diEntity()
	{
		List<College> l1=collegeServiceimple.getColleges();
		return new ResponseEntity<List<College>>(l1, HttpStatus.OK);
	}
}
