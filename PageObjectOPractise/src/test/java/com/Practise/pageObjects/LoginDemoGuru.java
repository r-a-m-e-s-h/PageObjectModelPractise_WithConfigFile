package com.Practise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoGuru {
	
	
	WebDriver ldriver;
	
	public  LoginDemoGuru(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	public static WebElement username;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	public static WebElement login_btn;
	
	public void Login_UserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void Login_pwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login_btn_click()
	{
		login_btn.click();
	}
	
	

}
