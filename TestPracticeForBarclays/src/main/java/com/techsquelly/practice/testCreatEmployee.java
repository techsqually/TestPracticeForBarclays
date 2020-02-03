package com.techsquelly.practice;

import static org.junit.Assert.*;

import javax.jws.soap.SOAPBinding;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testCreatEmployee {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.print("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("AfterTest");
	} 

	@Test
	public void test() {
		System.out.println("test case 1");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void testCreatEmployee() {
		System.out.println("test case 2");
	    Assert.assertEquals(true, true);
	}

}
