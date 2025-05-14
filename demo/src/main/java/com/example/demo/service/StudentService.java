package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	Student addStudent(Student student);
	Student updateStudent(Student student);
	List<Student> getStudents();
	void deleteStudent(Integer Id);

}
