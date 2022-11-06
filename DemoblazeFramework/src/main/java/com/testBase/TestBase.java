package com.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.google.j2objc.annotations.Property;



import freemarker.log.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public  static Logger logger;
	
	@BeforeClass
	
	public void start()
	{
		 logger=Logger.getLogger("Dalal Street Framework");
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Framework Execution Started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework Execution Finished");
	}
	
	//@Parameters("browser")
	
	
	
	@BeforeMethod
	public void setup()
	{
		String br="chrome";
		
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver() ;
		}
		
		else
		{
			System.out.println("please provid correct browser");
		}
		
		logger.info("Browser launched");
		
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		logger.info("open url,maximized Browser and applied implicit wait");
		
		
		
		
	}	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Browser closed");
	}
}
