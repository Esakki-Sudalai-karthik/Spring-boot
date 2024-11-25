package com.example.JPABasic.controller;

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
import com.example.JPABasic.entity.Employee;
import com.example.JPABasic.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController
{
	
	@Autowired 
	EmployeeService employeeService;
	
	
	//addEmployee
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	
	//getAll
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	//getEmployeeById
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	//update EmployeeById
	@PutMapping("/update/{id}")
	public Employee updateEmployeeById(@PathVariable("id") int id, @RequestBody Employee employee)
	{
		return employeeService.updateEmployeeById(id, employee);
	}
	
	//delete EmployeeById
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id)
	{
		employeeService.deleteEmployeeById(id);
	}
	
	//delete Employee
	@DeleteMapping("/deleteAll")
	public void deleteAllEmployee(Employee employee)
	{
		employeeService.deleteAllEmployee(employee);
	}
	
	
	//getEmployeeByNameAndCity
	@GetMapping("/nameandcity/{name},{city}")
	public List<Employee> getEmployeeByNameAndCity(@PathVariable("name") String name ,@PathVariable("city") String city)
	{
		return employeeService.getEmployeeByNameAndCity(name, city);
	}
	
	
	//getEmployeeByNameOrCity
	@GetMapping("/nameorcity/{name},{city}")
	public List<Employee> getEmployeeByNameOrCity(@PathVariable("name") String name,@PathVariable("city") String city)
	{
		return employeeService.getEmployeeByNameOrCity(name, city);
	}

	
	//getByName
	@GetMapping("/name/{name}")
	public Employee getByName(@PathVariable String name)
	{
		return employeeService.getByName(name);
	}
	
	
	
}
