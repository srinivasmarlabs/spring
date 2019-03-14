package com.demo.spring;

public class Emp {
	
	
	public Emp()
	{
		
	}
	
	public Emp(int empId,String name,String city,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name;
	private String city;
	private double salary;
	
	
	

}
