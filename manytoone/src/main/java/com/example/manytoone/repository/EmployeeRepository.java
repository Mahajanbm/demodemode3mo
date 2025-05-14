package com.example.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytoone.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
