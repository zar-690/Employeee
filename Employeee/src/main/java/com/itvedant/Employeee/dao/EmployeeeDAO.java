package com.itvedant.Employeee.dao;

public class EmployeeeDAO {
	private String name;
	private String email;
	private Integer salary;
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
		return "EmployeeeDAO [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
}
