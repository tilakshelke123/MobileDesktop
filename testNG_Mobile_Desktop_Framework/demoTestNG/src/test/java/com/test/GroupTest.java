package com.test;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = {"smoke","Intgration"})
	public void  test1() {
		System.out.println("LOgin Exicuted");
		
	}
	@Test(groups = {"Intgration"})
	public void  test2() {
		System.out.println("homePage Exicuted");
	}
	
	@BeforeGroups  ("smoke")
	public void  BeforeGroupssmoke() {
		System.out.println("BeforeGroups SMOKE");
		
	}
	
	@BeforeGroups  ("Intgration")
	public void  BeforeGroupsIntgration() {
		System.out.println("BeforeGroups Intgration");
		
	}


}
