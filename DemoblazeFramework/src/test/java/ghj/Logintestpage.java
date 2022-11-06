package ghj;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pagelayer.Loginpage;
import com.utility.Utilclass;

public class Logintestpage  {
String  expected_url="https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void verifyLoginPage() throws InterruptedException
	{
		Loginpage login=new Loginpage();
		Utilclass util=new Utilclass();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickLoginButton();
		Thread.sleep(3000);
	String	actual_url=util.geturl();
	Assert.assertEquals(actual_url, expected_url);
		
	}

}
