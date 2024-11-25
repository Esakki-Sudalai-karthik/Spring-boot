package com.example.SpringBootDemo.demoservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.example.SpringBootDemo.demodto.DemoEmployee;
import com.example.SpringBootDemo.demorepository.DemoRepository;

@Service
public class DemoService 
{
	@Autowired 
	DemoRepository demoRepository;
	
	//get All Employee
	public List<DemoEmployee> getAllEmployee()
	{
		return demoRepository.findAll();
	}
	
	//get EmployeeById
	public DemoEmployee getEmployeeById(String id)
	{
		return demoRepository.findById(id).orElse(null);
	}
	
	//create a new employee
	public DemoEmployee addEmployee(DemoEmployee demoEmployee)
	{
		return demoRepository.save(demoEmployee);
	}
	
	//update Employee
	public DemoEmployee updateEmployee(String id,DemoEmployee demoEmployee)
	{
		DemoEmployee existingEmployee = demoRepository.findById(id).orElse(null);
		if( existingEmployee != null)
		{
			existingEmployee.setName(demoEmployee.getName());
			existingEmployee.setAge(demoEmployee.getAge());
			existingEmployee.setEmail(demoEmployee.getEmail());
			existingEmployee.setCoutry(demoEmployee.getCountry());
			return demoRepository.save(existingEmployee);
		}
		return demoRepository.save(demoEmployee);
	}
	
	//delete Employee
	public void deleteEmployeeById(String id)
	{
		demoRepository.deleteById(id);
	}
	
	
	//findByName
	public List<DemoEmployee> findByName(String name)
	{
		return demoRepository.findByName(name);
	}
	
	
	//findByAge
	public List<DemoEmployee> findByAge(String age)
	{
		return demoRepository.findByAge(age);
	}
	
}
