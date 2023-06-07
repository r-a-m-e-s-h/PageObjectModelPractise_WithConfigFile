package com.Practise.testCases;

import org.testng.annotations.Test;

import com.Practise.pageObjects.LoginDemoGuru;




public class TC_Login_001 extends BaseClass {
	
	
	@Test
	public void LoginPage()
	{
		
		//driver.get(DemoGuru_URL);
		
		logger.info("Demo Guru URL Opened");
		
		
		LoginDemoGuru d = new LoginDemoGuru(driver);		
		
		d.Login_UserName(User_ID);
		
		logger.info("User name entered");
		
		d.Login_pwd(User_pwd);
		
		logger.info("Password is entered");
		
		d.login_btn_click();
		
		logger.info("Login button is clicked");
		
		System.out.println(" After Login  DemoGuru Title is  : "+driver.getTitle());
		
	}

}
