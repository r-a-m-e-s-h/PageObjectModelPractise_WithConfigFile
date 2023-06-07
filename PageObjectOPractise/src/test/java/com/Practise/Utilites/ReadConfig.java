package com.Practise.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig()
	{

		File src = new File("./Configuration/config"); 



		try {

			FileInputStream fis = new FileInputStream(src);


			pro = new Properties();

			pro.load(fis);

		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Exception is  "+e.getMessage()); 
		}


	}

	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	public String getUserName()
	{
		String uname = pro.getProperty("LoginuserName");
		return uname;
	}
	public String getPwd()
	{
		String pwd= pro.getProperty("LoginpassWord");
		return pwd;
		
	}
	
	public String G_URL()
	{
		String google_URL = pro.getProperty("G_URL");
		return google_URL;
	}
	public String G_SearchText()
	{
		String G_text=pro.getProperty("G_SearchText");
		return G_text;
	}



}
