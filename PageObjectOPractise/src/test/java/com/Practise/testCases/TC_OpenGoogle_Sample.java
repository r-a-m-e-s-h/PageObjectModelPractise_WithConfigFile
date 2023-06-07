package com.Practise.testCases;

import org.testng.annotations.Test;

import com.Practise.pageObjects.OpenGoogle;

public class TC_OpenGoogle_Sample extends BaseClass{
	
	
	
	@Test
	public void LaunchChrome()
	{
		driver.get(Googleurl);
		
		logger.info("URL is Opened");
		
		OpenGoogle g = new OpenGoogle(driver);
		
		g.searchTerm(SearchText);
		
		logger.info("Search Term is entered and Enter Button is clicked");
		
		System.out.println("The Title is : "+driver.getTitle());
		
		logger.info("Last Step");
		
	}

}
