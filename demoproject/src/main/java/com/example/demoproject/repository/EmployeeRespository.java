package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoproject.entity.Employee;
@Repository
public interface EmployeeRespository  extends JpaRepository<Employee, Integer>{

}
