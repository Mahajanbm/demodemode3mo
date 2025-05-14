package com.example.manytomany.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manytomany.entity.Subject;
import com.example.manytomany.repository.SubjectRepository;
import com.example.manytomany.service.SubjectService;
@Service
public class SubjectServiceImple implements SubjectService {

	private SubjectRepository subjectRepository;
	
	
	public SubjectServiceImple(SubjectRepository subjectRepository) {
		super();
		this.subjectRepository = subjectRepository;
	}

	@Override
	public Subject addSubject(Subject subject) {
		Subject s1=subjectRepository.save(subject);
		return s1;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getSubjects() {
		List<Subject> l1=subjectRepository.findAll();
		return l1;
	}

	@Override
	public Subject getSubjectById(Integer id) {
	Subject s1=subjectRepository.findById(id).get();
		return s1;
	}

	@Override
	public void deleteData(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
