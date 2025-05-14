package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceimple implements StudentService {
	private StudentRepository studentRepository;
	
	public StudentServiceimple(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student addStudent(Student student) {
		Student s1=studentRepository.save(student);
		return s1;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> s1=studentRepository.findAll();
		return s1;
	}

	@Override
	public void deleteStudent(Integer Id) {
	studentRepository.deleteById(Id);

	}

}
