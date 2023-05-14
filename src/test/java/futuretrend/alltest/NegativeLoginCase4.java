package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class NegativeLoginCase4 extends TestBase {
	
	@Test
	public void negativeLoginCase4()
	{
		createNode("negativeLoginCase4");
		LoginPage page=new LoginPage();
		page.validatefourthNegativeLoginCase();
		
		
	}
	
	

}
