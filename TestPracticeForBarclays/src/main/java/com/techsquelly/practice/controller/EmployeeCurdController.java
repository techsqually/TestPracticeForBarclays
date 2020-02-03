package com.techsquelly.practice.controller;

import java.util.HashMap;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsquelly.practice.models.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeCurdController {
	HashMap<Long,Employee> employeeCollection = new HashMap<>(32); 
	@PostMapping("/v1/create")
	public  HashMap<Long, Employee> createEmployee(@RequestBody Employee emp1 ){
		
		Employee emp=new Employee();
		emp.setEmployId(1);
		emp.setDpt("It");
		emp.setName("sanjay");
		emp.setSalary("30Lac");
		
		employeeCollection.put(Long.valueOf(1), emp);
		
		return employeeCollection;
		
		
	}
	
	
	

}
