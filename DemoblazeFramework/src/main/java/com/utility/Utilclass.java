package com.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Utilclass extends TestBase {
	
	public Utilclass()
	{
		PageFactory.initElements(driver, this);	
	}
	
// url
	
	public String geturl()
	{
	String	current_url=driver.getCurrentUrl();
	return current_url;
	
	}
	static String path="C:\\Users\\Sagar\\eclipse-workspace\\Framework\\screenshots\\";
	public static void takescreenshot(String FileName )
	{
		try 
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			//File des=new File(path+"sample.png");
			//File des=new File(path+FileName+".png");
			File des=new File(path+FileName+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
			
		}
		catch(IOException e)
		{
		System.out.println("Please provide correct path");
		e.printStackTrace();
	    }
	}
	}
