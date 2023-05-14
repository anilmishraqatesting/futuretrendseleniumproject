package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class NegativeLoginCase1 extends TestBase {
	
	@Test
	public void negativeLoginCase1()
	{
		createNode("negativeLoginCase1");
		LoginPage page=new LoginPage();
		page.validateFirstNegativeLoginCase();
		
		
	}
	
	

}
