package com.example.JPABasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.JPABasic.entity.Employee;

@SpringBootApplication
//@Component 
public class JpaBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBasicApplication.class, args);
		
//		Employee emp = new Employee();
//		System.out.println(emp.getName());
		
	}

}
