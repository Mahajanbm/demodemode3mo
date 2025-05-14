package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimple.StudentServiceimple;

@RestController
@RequestMapping("Student")
public class StudentController {
	private	StudentServiceimple studentServiceimple;

	public StudentController(StudentServiceimple studentServiceimple) {
		super();
		this.studentServiceimple = studentServiceimple;
	}
	@PostMapping
	public ResponseEntity<Student> addEntity(@RequestBody Student student)
	{
		Student c1=studentServiceimple.addStudent(student);
		return new ResponseEntity<Student>(c1, HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<Student>> diEntity()
	{
		List<Student> l1=studentServiceimple.getStudents();
		return new ResponseEntity<List<Student>>(l1, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public void deletedata(@PathVariable Integer id)
	{
		studentServiceimple.deleteStudent(id);
	}
}
