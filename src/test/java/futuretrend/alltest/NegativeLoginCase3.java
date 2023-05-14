package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class NegativeLoginCase3 extends TestBase {
	
	@Test
	public void negativeLoginCase3()
	{
		createNode("negativeLoginCase3");
		LoginPage page=new LoginPage();
		page.validateThirdNegativeLoginCase();
		
		
	}
	
	

}
