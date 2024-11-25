package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	
	@Autowired 
	EmployeeRepository employeeRepository;
	
	
	//create a new employee
	public Employee addEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	//get All Employee
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}
	
	
	//get employee by id
	public Employee getEmployeeById(String id)
	{
		return employeeRepository.findById(id).orElse(null);
	}
	
	
	//update Employee
	public Employee updateEmployee(String id,Employee employee)
	{
		Employee existingEmployee = employeeRepository.findById(id).orElse(null);
		if(existingEmployee != null)
		{
			existingEmployee.setName(employee.getName());
			existingEmployee.setAge(employee.getAge());
			existingEmployee.setEmail(employee.getEmail());
			existingEmployee.setCountry(employee.getCountry());
			return employeeRepository.save(existingEmployee);
		}
		return employeeRepository.save(employee);
	}
	
	
	//delete Employee
	public void deleteEmployee(String id)
	{
		employeeRepository.deleteById(id);
	}
	
	
	//get Employee by name
	public List<Employee> getEmployeeByName(String name)
	{
		return employeeRepository.findByName(name);
	}
	
	
	//get Employee by country
	public List<Employee> getEmployeeByCountry(String country)
	{
		return employeeRepository.findByCountry(country);
	}
	
}
