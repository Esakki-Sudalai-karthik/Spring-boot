package com.example.SpringBootDemo.demorepository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringBootDemo.demodto.DemoEmployee;

public interface DemoRepository extends MongoRepository<DemoEmployee, String> 
{
	List<DemoEmployee> findByName (String name);
	
	List<DemoEmployee> findByAge (String Age);

}
