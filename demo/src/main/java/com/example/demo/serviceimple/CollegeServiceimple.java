package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.service.CollegeService;
@Service
public class CollegeServiceimple implements CollegeService{
	private	CollegeRepository collegeRepository;

	public CollegeServiceimple(CollegeRepository collegeRepository) {
		super();
		this.collegeRepository = collegeRepository;
	}

	@Override
	public College addCollege(College college) {
		
		College c1=collegeRepository.save(college);
		return c1;
	}

	@Override
	public College updateCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<College> getColleges() {
	List<College> c1=collegeRepository.findAll();
		return c1;
	}

	@Override
	public void deleteCollege(Integer Id) {
		// TODO Auto-generated method stub

	}

}
