package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public Employee updateEmployee(int id,Employee employee);
	
	public void deleteEmployee(int id);

}
