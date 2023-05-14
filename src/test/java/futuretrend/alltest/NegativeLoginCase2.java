package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class NegativeLoginCase2 extends TestBase {
	
	@Test
	public void negativeLoginCase2()
	{
		createNode("negativeLoginCase2");
		LoginPage page=new LoginPage();
		page.validatesecondNegativeLoginCase();
		
		
	}
	
	

}
