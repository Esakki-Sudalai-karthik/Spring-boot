package com.example.JPABasic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPABasic.entity.Employee;
import com.example.JPABasic.repository.DemoRepository;

@Service
public class EmployeeService 
{
	
	@Autowired 
	DemoRepository demoRepository;
	
	//create a Employee record
	public Employee addEmployee(Employee employee)
	{
		return demoRepository.save(employee);
	}
	

	//get AllEmployee
	public List<Employee> getAllEmployee()
	{
		return demoRepository.findAll();
	}

	
	//getEmployeeById
	public Employee getEmployeeById(int id)
	{
		return demoRepository.findById(id).get();
	}
	
	
	//update a Employee
	public Employee updateEmployeeById(int id , Employee employee)
	{
		Employee existingEmployee = demoRepository.findById(id).orElse(null);
		if(existingEmployee != null)
		{	
			existingEmployee.setName(employee.getName());
			existingEmployee.setAge(employee.getAge());
			existingEmployee.setCity(employee.getCity());
			existingEmployee.setSalary(employee.getSalary());
			return demoRepository.save(existingEmployee);
		}
		return demoRepository.save(employee);
	}
	
	//delete EmployeeById
	public void deleteEmployeeById(int id)
	{
		demoRepository.deleteById(id);
	}
	
	//delete AllEmployee
	public void deleteAllEmployee(Employee employee)
	{
		demoRepository.delete(employee);
	}
	

	//getEmployeeByNameAndCity
	public List<Employee> getEmployeeByNameAndCity(String name,String city)
	{
		return demoRepository.findByNameAndCity(name, city);
	}
	
	//getEmployeeByNameOrCity
	public List<Employee> getEmployeeByNameOrCity(String name,String city)
	{
		return demoRepository.findByNameOrCity(name, city);
	}
	
	
	//getByName
	public Employee getByName(String name)
	{
		return demoRepository.findByName(name);
	}

	
}
