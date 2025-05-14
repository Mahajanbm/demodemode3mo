package com.example.manytomany.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manytomany.entity.Teacher;
import com.example.manytomany.repository.TeacherRepository;
import com.example.manytomany.service.TeacherService;

@Service
public class TeacherServiceImple implements TeacherService {

	private TeacherRepository teacherRepository;
	
	

	public TeacherServiceImple(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		Teacher t1=teacherRepository.save(teacher);
		return t1;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
	
		return null;
	}

	@Override
	public List<Teacher> getTeachers() {
		List<Teacher> l1=teacherRepository.findAll();
		return l1;
	}

	@Override
	public Teacher getTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(Integer id) {
		// TODO Auto-generated method stub

	}

}
