package com.liseInfotech.RestAssuredTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuitAnnotationTest {

//	test -normal method -------------------
	@Test
	public void testCase1() {
		System.out.println("This is the Normal Test-Case...");
	}
	
//	beforeMethod - afterMethod -----------------
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");
	}
	
	@AfterMethod 
	public void afterMethod() {
		System.out.println("This will execute after every Method");
	}
	
//	beforeClass - afterClass ----------------
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}
	
//	BeforeTest-AfterTest ---------------- 
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
	}
	
//	beforeSuit - After Suit
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("This will execute before the Test Suite");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("This will execute after the Test Suite");
	}
}
