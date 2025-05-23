package com.example.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
