package com.example.JPABasic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "employee")
public class Employee 
{
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String city;
	@Column
	private int salary;
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
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
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	

}
