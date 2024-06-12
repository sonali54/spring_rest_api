package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeRepo.findAll();
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = employeeRepo.findById(id).get();
		return employee;
	}

	@Override
	public Employee updateEmployee(int id,Employee employee) {
		Employee emp = employeeRepo.findById(id).get();
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		
		Employee updatedEmployee = employeeRepo.save(emp);
		
		return updatedEmployee;
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}

}
