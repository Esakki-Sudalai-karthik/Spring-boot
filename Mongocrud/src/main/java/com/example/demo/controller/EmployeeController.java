package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/Employee") 
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;
	
	
	//create Employee
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	
	//get All employee
	@GetMapping("/all")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	
	//get EmployeeById
	@GetMapping("/details/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	
	
	//update Employee
	@PutMapping("/update/{id}")
	public Employee UpdateEmployee(@PathVariable("id") String id,@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
	}
	
	
	//delete employeeById
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") String id)
	{
		employeeService.deleteEmployee(id);
		
	}
	
	
	//get EmployeeByName
	@GetMapping("/name/{name}")
	public List<Employee> getEmployeeByName(@PathVariable("name") String name)
	{
		return employeeService.getEmployeeByName(name);
	}
	
	
	//get EmployeeByCountry
	@GetMapping("/country/{country}")
	public List<Employee> getEmployeeByCountry(@PathVariable("country") String country)
	{
		return employeeService.getEmployeeByCountry(country);
	}
	

}
