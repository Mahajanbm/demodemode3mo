package com.example.manytoone.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manytoone.entity.Employee;
import com.example.manytoone.repository.EmployeeRepository;
import com.example.manytoone.service.EmployeeService;
@Service
public class EmployeeServiceImple implements EmployeeService{

	private	EmployeeRepository employeeRepository;


	public EmployeeServiceImple(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee e1=employeeRepository.save(employee);
		return e1;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee e1=employeeRepository.findById(employee.getId()).get();
		e1.setName(employee.getName());
		e1.setOrg(employee.getOrg());
		e1.setCity(employee.getCity());
		e1.setSalary(employee.getSalary());
		Employee employee2=employeeRepository.save(e1);
		return employee2;
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> l1=employeeRepository.findAll();
		return l1;
	}

	@Override
	public void deleteEmp(int id) {
		employeeRepository.deleteById(id);

	}

}
