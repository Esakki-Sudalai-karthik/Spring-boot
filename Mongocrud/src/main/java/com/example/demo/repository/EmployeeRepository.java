package com.example.demo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.dto.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>
{
	
	//custom method creating
	
	List<Employee> findByName(String name);
	
	List<Employee> findByCountry(String country); 

	
}
