package com.example.manytomany.service;

import java.util.List;

import com.example.manytomany.entity.Subject;

public interface SubjectService {
	Subject addSubject(Subject subject);
	Subject updateSubject(Subject subject);
	List<Subject> getSubjects();
	Subject getSubjectById(Integer id);
	void deleteData(Integer id);
}
