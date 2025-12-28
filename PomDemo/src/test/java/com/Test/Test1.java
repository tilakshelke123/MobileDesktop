package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.LoginPage.LoginPage;
import com.LoginPage.LoginPageAndroid;
import com.LoginPage.LoginPageIos;

public class Test1 {

//	WebDriver driver;

//	@Test(enabled = false)
//	public void testMethod1() {
////		driver.findElement(By.id("userid")).sendKeys("");
////		driver.findElement(By.id("password")).sendKeys("");
////		System.out.println("Test1Mwthod Executed Successfully ");
//
//		LoginPage loginpage = new LoginPage();
//		loginpage.enterUsername("test@test.com");
//		loginpage.enterPassword("Password123");
//		loginpage.clickOnLoginButton();
//		Assert.assertEquals(loginpage.getPageTitle(), "Page title", "succesfull assertion");
//	}

	@Test
	public void mobileLoginMethod() {
		System.out.println("Moblie Login Method");
		LoginPage loginpage=null;
		if(System.getProperty("platform").equals("Ios")) {
			loginpage= new LoginPageIos();
		}
		else if(System.getProperty("platform").equals("android")){
			
			loginpage= new LoginPageAndroid();
//			loginpage.clickOnLoginButton();
		}
		loginpage.enterUsername("user1");
		loginpage.enterPassword("pass@123");
		loginpage.clickOnLoginButton();
	}

}
