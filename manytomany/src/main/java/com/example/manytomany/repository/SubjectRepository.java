package com.example.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Subject;
@Repository
public interface SubjectRepository  extends JpaRepository<Subject, Integer>{

}
