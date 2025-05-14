package com.example.manytoone.service;

import java.util.List;

import com.example.manytoone.entity.Employee;

public interface EmployeeService {
	Employee addEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	List<Employee> getEmployees();
	void deleteEmp(int id);
}
