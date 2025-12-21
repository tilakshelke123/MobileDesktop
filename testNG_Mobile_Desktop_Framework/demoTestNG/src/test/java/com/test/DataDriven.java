package com.test;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	@Test(dataProvider ="getUserData" )
	public void  test1(String uname,String Pass) throws InterruptedException {
		System.out.println("DataDriven test For Login Executing");
		Thread.sleep(5000);
		System.out.println("uname:"+uname+"Password:"+Pass);
	}
	
	@DataProvider(name="getUserData",parallel=true)
	public Object[][] getUserData(){
		return new Object[][] {
			{"user1","password1"},
			{"user2","password2"}
		};
		
	}
		@DataProvider(name="getUserData1",parallel=true)
		public Object[][] getUserData1(){
			return new Object[][] {
				{"user3","password3"},
				{"user4","password4"}
			};
			
	}

}
