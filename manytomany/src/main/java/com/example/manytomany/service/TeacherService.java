package com.example.manytomany.service;

import java.util.List;

import com.example.manytomany.entity.Teacher;

public interface TeacherService {

	Teacher addTeacher(Teacher teacher);
	Teacher updateTeacher(Teacher teacher);
	List<Teacher> getTeachers();
	Teacher getTeacherById(Integer id);
	void deleteData(Integer id);
}
