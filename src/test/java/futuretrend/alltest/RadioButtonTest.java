package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.allpages.RadioButtonPage;
import futuretrend.driverfactory.TestBase;

public class RadioButtonTest extends TestBase{
	
	
	@Test
	public void radiobuttoncase()
	{
		
		
		createNode("radiobuttoncase");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		RadioButtonPage rbpage=new RadioButtonPage();
		
		rbpage.reachRadiobuttonPage();
		rbpage.selectYesAndValidate();
		rbpage.selectImpressiveAndValidate();
		rbpage.selectNoAndValidate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
