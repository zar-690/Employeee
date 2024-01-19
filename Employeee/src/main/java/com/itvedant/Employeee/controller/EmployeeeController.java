package com.itvedant.Employeee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.Employeee.dao.EmployeeeDAO;
import com.itvedant.Employeee.dao.UpdateEmployeeeDao;
import com.itvedant.Employeee.services.EmployeeeService;


@RestController
@RequestMapping("employeees")
public class EmployeeeController {
	
	@Autowired
	EmployeeeService employeeeservice;
	
	// Status Code
		// Header
		// Body
		@PostMapping("/add")
		public ResponseEntity<?> create(@RequestBody EmployeeeDAO employeedao){
			return ResponseEntity.ok(this.employeeeservice.createEmployeee(employeedao));
		}
		@GetMapping("")
		public ResponseEntity<?> getAll(){
			return ResponseEntity.ok(this.employeeeservice.getAllEmployeee());
        }

		@GetMapping("/{id}")
		public ResponseEntity<?> getByID(@PathVariable("id") Integer id){
			return ResponseEntity.ok(this.employeeeservice.getAllEmployeeeById(id));
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable("id") Integer id){
			return ResponseEntity.ok(this.employeeeservice.deleteEmployeee(id));
		}
		
		@PutMapping("/{id}")
		public ResponseEntity<?> update(@RequestBody UpdateEmployeeeDao updateEmployeeDao, @PathVariable("id") Integer id){
			return ResponseEntity.ok(this.employeeeservice.updateEmployeee(updateEmployeeDao, id));
		}
		

		@PatchMapping("/{id}")
		public ResponseEntity<?> update1(@RequestBody UpdateEmployeeeDao updateEmployeeeDao, @PathVariable("id") Integer id){
			return ResponseEntity.ok(this.employeeeservice.updateEmployeee(updateEmployeeeDao, id));
		}

		
}