package com.example.SpringBootDemo.democontroller;

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
import com.example.SpringBootDemo.demodto.DemoEmployee;
import com.example.SpringBootDemo.demoservice.DemoService;

@RestController
@RequestMapping (value = "/employee")
public class DemoController 
{
	@Autowired DemoService demoService;
	
	//get AllEmployee
	@GetMapping("/getAll")
	public List<DemoEmployee> getAllEmployee()
	{
		return demoService.getAllEmployee();
	}

	//get EmployeeById
	@GetMapping("/get/{id}")
	public DemoEmployee getEmployeeById(@PathVariable("id") String id)
	{
		return demoService.getEmployeeById(id);
	}
	
	//create a new employee
	@PostMapping("/add")
	public DemoEmployee addEmployee(@RequestBody DemoEmployee demoEmployee)
	{
		return demoService.addEmployee(demoEmployee);
	}
	
	
	//update Employee
	@PutMapping("/update/{id}")
	public DemoEmployee updateEmployee(@PathVariable("id") String id, @RequestBody DemoEmployee demoEmployee)
	{
		return demoService.updateEmployee(id, demoEmployee);
	}
	
	//delete Employee
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable("id") String id)
	{
		 demoService.deleteEmployeeById(id);
		 return "Employee deleted with id :"+id;
	}
	
	//getEmployeeByName
	@GetMapping("/name/{name}")
	public List<DemoEmployee> getEmployeeByName(@PathVariable("name") String name)
	{
		return demoService.findByName(name);
	}
	
	
	//getEmployeeAge
	@GetMapping("/age/{age}")
	public List<DemoEmployee> getEmployeeAge(@PathVariable("age") String Age)
	{
		return demoService.findByAge(Age);
	}
}
