package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class LoginTest extends TestBase{
	
	
	
	
	@Test
	public void loginCase()
	{
		createNode("loginCase");
		LoginPage page=new LoginPage();
		 page.enterUserName();
		 page.enterPassword();
		 page.clickLoginbutton();
		 page.validateLoggedinUser();
		
		
		
		
	}

}
