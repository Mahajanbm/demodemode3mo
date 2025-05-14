package com.example.manytoone.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manytoone.entity.Employee;
import com.example.manytoone.serviceimple.EmployeeServiceImple;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
	private	EmployeeServiceImple employeeServiceImple;

	public EmployeeController(EmployeeServiceImple employeeServiceImple) {
		super();
		this.employeeServiceImple = employeeServiceImple;
	}
	@PostMapping
	public ResponseEntity<Employee> addEntity(@RequestBody Employee employee)
	{
		Employee e1=employeeServiceImple.addEmployee(employee);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);

	}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> upEntity(@PathVariable int id,@RequestBody Employee employee)
	{
		Employee e1=employeeServiceImple.updateEmployee(employee);
		return new ResponseEntity<Employee>(e1, HttpStatus.CREATED);

	}
	@GetMapping
	public ResponseEntity<List<Employee>> getEntity()
	{
		List<Employee> e1=employeeServiceImple.getEmployees();
		return new ResponseEntity<List<Employee>>(e1, HttpStatus.OK);

	}
	@DeleteMapping("/{id}")
	public void deletedata(@PathVariable Integer Id)
	{
		employeeServiceImple.deleteEmp(Id);
	}
}
