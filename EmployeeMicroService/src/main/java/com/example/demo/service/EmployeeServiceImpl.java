package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;
	
	public Employee getEmployee(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee not found with Id " + id));
	}
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	
	public Employee saveEmployee(Employee employee) {
		if(employee.getId() != null) {
			return repository.findById(employee.getId()).map(empToBeUpdated -> {
				empToBeUpdated.setName(employee.getName());
				empToBeUpdated.setCountry(employee.getCountry());
				return repository.save(empToBeUpdated);
			}).orElseThrow(() -> new ResourceNotFoundException("Employee not found with Id " + employee.getId()));
		}
		
		return repository.save(employee);
		}
	
}
