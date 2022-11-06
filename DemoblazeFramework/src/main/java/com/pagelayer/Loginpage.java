package com.pagelayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Loginpage extends TestBase {

	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------object repository----------
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()=\"Log In\"]")
	private WebElement login_button;

	//---------------Action methods-----
	
	public void enterEmailAddress()
	{
		email_txtbox.sendKeys("nitinmathe3010@gmail.com");
	}
	
	public void enterPassword()
	{
		password_txtbox.sendKeys("Nitin@123");
	}
	
	public void clickLoginButton()
	{
		login_button.click();
	}
	
}
