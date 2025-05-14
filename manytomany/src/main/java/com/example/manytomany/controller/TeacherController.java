package com.example.manytomany.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.entity.Teacher;
import com.example.manytomany.serviceimple.TeacherServiceImple;

@RestController
@RequestMapping("Teacher")
public class TeacherController { 
	private TeacherServiceImple teacherServiceImple;
	public TeacherController(TeacherServiceImple teacherServiceImple) {
		super();
		this.teacherServiceImple = teacherServiceImple;
	}
	@PostMapping
	public ResponseEntity<Teacher> addEntity(@RequestBody Teacher teacher)
	{
		Teacher t1= teacherServiceImple.addTeacher(teacher);

		return new ResponseEntity<Teacher>(t1,HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<Teacher>> getEntity()
	{
		List<Teacher> t1= teacherServiceImple.getTeachers();

		return new ResponseEntity<List<Teacher>>(t1,HttpStatus.OK);

	}


}
