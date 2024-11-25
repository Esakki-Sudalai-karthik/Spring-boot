package com.example.SpringBootDemo.demodto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class DemoEmployee 
{
	@Id
	private String id;
	private String name;
	private String age;
	private String email;
	private String country;
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAge()
	{
		return age;
	}
	
	public void setAge(String age)
	{
		this.age = age;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getCountry()
	{
		return country;
	}
	
	public void setCoutry(String country)
	{
		this.country = country;
	}
	
}
