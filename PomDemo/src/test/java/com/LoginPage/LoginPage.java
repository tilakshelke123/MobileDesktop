package com.LoginPage;

import com.BasePAge.BasePage;

public abstract class LoginPage extends BasePage {

//	public LoginPage() {
//		System.out.println("Login page constructor");
//		initElement();
//	}
//
//
//
//	protected  void initElement();



	public void enterUsername(String uname) {
		// TODO Auto-generated method stub
		System.out.println("Username :"+uname);
	}

	public void enterPassword(String pass) {
		// TODO Auto-generated method stub
		System.out.println("Password: "+pass);
	}

	public abstract void clickOnLoginButton();

	

}
