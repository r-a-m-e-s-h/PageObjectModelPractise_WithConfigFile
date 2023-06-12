package com.Practise.testCases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Practise.Utilites.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	// demo user ID = mngr507509
	
	// demo pwd = emyhAvy
	
	
	ReadConfig config =  new ReadConfig();
	
	public String Googleurl = config.G_URL();
	
	public String SearchText= config.G_SearchText();
	
	public String DemoGuru_URL = config.getApplicationURL();
			                    										//"https://demo.guru99.com/V1/index.php";    //"https://demo.guru99.com/Agile_Project/Agi_V1/";
	
	public String User_ID = config.getUserName();                                    //"mngr507509";   //"1303";
	
	public String User_pwd = config.getPwd();                            //"emyhAvy";       //"Guru99";
	
	
	// ---------- New Cutomer Adding Details ------ ( Here we sending data from Base Class )
	
	public String nc_username1 = "Naruto";
	
	public String nc_address1 = "Hidden Leaf Village ";
	
	public String nc_State1 = "Konaha-Japan";
	
	public String nc_pin = "126";
	
	public String nc_Email = "narutoUzumaki@leafVillage.com";
	
	public String nc_pnum = "1234567890";
	
	public String nc_mm = "August";
	
	public String nc_dd = "15";
	
	public String nc_yyyy = "1998";
	
	public String nc_city1 = "Leaf Village";
	
	//---------------------------------	
	
	
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(DemoGuru_URL);
		
		logger = Logger.getLogger("Practise") ;
		
		PropertyConfigurator.configure("Log4j.properties");				
				
	}
	
	@AfterClass
	public void tearDow()
	{
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver  driver, String testcaseName) throws IOException
	{
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest =  new File(System.getProperty("user.dir")+"/Screenshots/"+testcaseName+".png");
		FileUtils.copyFile(src, dest);
		System.out.println("The screenshot takes");
		
		
	}
	
	public void clickAlert(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	
	

}
