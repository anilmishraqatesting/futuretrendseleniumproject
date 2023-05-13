package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;
import futuretrend.utilties.CommonFunction;

public class LoginTest extends TestBase{
	
	
	
	
	@Test
	public void loginCase()
	{
		createNode("loginCase");
		LoginPage page=new LoginPage();
		CommonFunction.launchURL();
		 page.enterUserName();
		 page.enterPassword();
		 page.clickLoginbutton();
		 page.validateLoggedinUser();
		
		
		
		
	}

}
