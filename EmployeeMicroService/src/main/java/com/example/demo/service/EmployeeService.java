package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(Long id);
	public List<Employee> getAllEmployees();
	public Employee saveEmployee(Employee employee);
	
}
