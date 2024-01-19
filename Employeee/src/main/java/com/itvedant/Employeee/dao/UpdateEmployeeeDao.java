package com.itvedant.Employeee.dao;

public class UpdateEmployeeeDao {
	String name;
	String email;
	Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UpdateEmployeeeDao [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}
