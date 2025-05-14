package com.example.manytomany.controller;

import java.nio.file.Path;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytomany.entity.Subject;
import com.example.manytomany.serviceimple.SubjectServiceImple;

@RestController
@RequestMapping("Subject")
public class SubjectController {
	private SubjectServiceImple SubjectServiceImple;


	public SubjectController(SubjectServiceImple subjectServiceImple) {
		super();
		SubjectServiceImple = subjectServiceImple;
	}
	@PostMapping
	public ResponseEntity<Subject> addEntity(@RequestBody Subject Subject)
	{
		Subject t1= SubjectServiceImple.addSubject(Subject);

		return new ResponseEntity<Subject>(t1,HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<Subject>> getEntity()
	{
		List<Subject> t1= SubjectServiceImple.getSubjects();

		return new ResponseEntity<List<Subject>>(t1,HttpStatus.OK);

	}
	@GetMapping("/{id}")
	public ResponseEntity<Subject> fiEntity(@PathVariable  Integer id)
	{
		Subject t1= SubjectServiceImple.getSubjectById(id);

		return new ResponseEntity<Subject>(t1,HttpStatus.OK);

	}
}
