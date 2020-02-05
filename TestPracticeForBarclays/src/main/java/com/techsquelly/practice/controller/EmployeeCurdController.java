package com.techsquelly.practice.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsquelly.practice.models.Employee;
import com.techsquelly.practice.service.EmployeeCurdService;

@RestController
@RequestMapping("/employee")
public class EmployeeCurdController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeCurdController.class);
	@Autowired
	EmployeeCurdService employeeCurdService;
	
	HashMap<Long,Employee> employeeCollection = new HashMap<>(32); 
	@PostMapping("/v1/create")
	public  HashMap<Long, Employee> createEmployee(@RequestBody Employee emp1 ){
		
		
		Employee emp=employeeCurdService.createEmployee();
		
		employeeCollection.put(Long.valueOf(1), emp);
		logger.info("ssssssssssssss" + employeeCollection.toString());
		return employeeCollection;
		
		
	}
	
	
	

}
