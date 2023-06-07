package com.Practise.testCases;

import org.testng.annotations.Test;

import com.Practise.pageObjects.LoginDemoGuru;
import com.Practise.pageObjects.NewCustomer;

public class TC_NewCustomer_002 extends BaseClass {
	
	@Test
	public void NewCutomer_Test() throws InterruptedException
	{
		LoginDemoGuru d = new LoginDemoGuru(driver);
		
		d.Login_UserName(User_ID);
		d.Login_pwd(User_pwd);
		d.login_btn_click();
		
		NewCustomer nc = new NewCustomer(driver);
		
		nc.Newcust_btn_Click();
		
		logger.info("New Customer Button is clicked");
		
		nc.SetUserName(nc_username1);
		
		logger.info("Username is entered ");
		
		nc.SelectGender();
		
		logger.info("Gender is selected");
		
		nc.SetDOB(nc_dd, nc_mm, nc_yyyy);
		
		logger.info("Date of Birth is Selected");
		
		nc.SetAddress(nc_address1);
		
		logger.info("Address is Entered");
		
		nc.SetCity(nc_city1);
		
		logger.info("City name is Entered");
		
		nc.Setstate(nc_State1);
		
		logger.info("State name is entered");
		
		nc.SetPincode(nc_pin);
		
		logger.info("Pin number is entered");
		
		nc.SetPhoneNum(nc_pnum);
		
		logger.info("Phone number is entered");
		
		nc.SetEmail(nc_Email);
		
		logger.info("Email id is entered");
		
		nc.Click_On_Submit_btn();
		
		logger.info("NewCustomer Submit button is clicked");
		
		Thread.sleep(2000);
		
		
		
		
		
				
	}

}
