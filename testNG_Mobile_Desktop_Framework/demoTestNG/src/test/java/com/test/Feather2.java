package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Feather2 {

	@BeforeGroups
	public void BeforeGroups1() {
		System.out.println("Before groups");
		
	}
	
	@Test( groups= {"Group1"}) 
	public void testFeature1() {
		System.out.println("testFeature1_2 group1");
	}

	@Test( groups= {"Group1"})
	public void testFeature2_2() {
		System.out.println("testFeature2_2 group1_");
	}
	
	@Test( groups= {"Group2"})
	public void testFeature3_2() {
		System.out.println("testFeature3_2 group2");
	}
	@Test( groups= {"Group3"},enabled = false)
	public void testFeature4_2() {
		System.out.println("testFeature4-2");
	}
	@Test( groups= {"Group4"})
	public void testFeature5_2() {
		System.out.println("testFeature5_2 group3");
	}

	@BeforeSuite
	public void Beforesuit() {
		System.out.println("Beforesuit");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeGroups({"Group1","Group2","Group3","Group4"})
	public void BeforeGroups() {
		System.out.println("BeforeGroups");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

}
