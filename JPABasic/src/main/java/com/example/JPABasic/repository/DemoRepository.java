package com.example.JPABasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.JPABasic.entity.Employee;

public interface DemoRepository extends JpaRepository<Employee, Integer> 
{
	
	
//	List<Employee> findByCity (String city);
	
	List<Employee> findByNameAndCity(String name,String city);
	
	List<Employee> findByNameOrCity(String name,String city);

	@Query("select u from Employee u where u.name = ?1")
	Employee findByName (String name);
}
