package com.techsquelly.practice.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.techsquelly.practice.dao.EmployeeCurdDao;
import com.techsquelly.practice.models.Employee;
import com.techsquelly.practice.service.EmployeeCurdService;

@RunWith(MockitoJUnitRunner.class) 
public class TestEmployeeCurdService {
	
	@Mock
	EmployeeCurdDao employeeCurdDao;
	@InjectMocks
	EmployeeCurdService employeeCurdService;
	@Test
	public void testCreatEmployee(){
		
		Employee emp = new Employee();
		emp.setEmployId(1);
		emp.setDpt("It");
		emp.setName("sanjay");
		emp.setSalary("30Lac");
		when(employeeCurdDao.creatEmployeeAtDao()).thenReturn(emp);
		Employee emp1=employeeCurdService.createEmployee();
		assertEquals(emp.getName(), emp1.getName());
	}
	

}
