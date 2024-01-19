package com.itvedant.Employeee.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.itvedant.Employeee.dao.EmployeeeDAO;
import com.itvedant.Employeee.dao.UpdateEmployeeeDao;
import com.itvedant.Employeee.entites.Employeee;


@Service
public class EmployeeeService {

	private Map<Integer,Employeee> Employeees = new HashMap<>();
	
	private AtomicInteger counter = new AtomicInteger();
	
	public Employeee createEmployeee(EmployeeeDAO employeedao) {
		Employeee employeee = new Employeee();
		employeee.setId(counter.incrementAndGet());
		employeee.setName(employeedao.getName());
		employeee.setEmail(employeedao.getEmail());
		employeee.setSalary(employeedao.getSalary());
		
       
		Employeees.put(employeee.getId(), employeee);
		return employeee;
		
	}
	// To Get all the employee
				public Collection<Employeee> getAllEmployeee(){
					return this.Employeees.values();
    }
	
	
				   
	// To get employee by Id
				 public Employeee getAllEmployeeeById(Integer id) {
					 Employeee employeee = this.Employeees.get(id);
					 
					 if(employeee == null) {
						 throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Student Not Found");
					 }
					 return employeee;
				 }
				 
		
				   
		// Delete Employee
				   public String deleteEmployeee(Integer id) {
					   
					   this.Employeees.remove(id);
					   
					   return "Employeee Removed";
				   }
				   
				 	
				    
				  // Update particular employeees by id
				    
				    public Employeee updateEmployeee(UpdateEmployeeeDao updateEmployeeeDao, Integer id) {
				    	
				    	Employeee employeee = this.getAllEmployeeeById(id);
				    	
				    	if(updateEmployeeeDao.getName()!= null) {
				    		employeee.setName(updateEmployeeeDao.getName());
				    	}
				    	
				    	if(updateEmployeeeDao.getEmail()!= null) {
				    		employeee.setEmail(updateEmployeeeDao.getEmail());
				    	}
				    	
				    	if(updateEmployeeeDao.getSalary()!=null) {
				    		employeee.setSalary(updateEmployeeeDao.getSalary());
				    	}
				    	
				    	return employeee;
				    }
          }


