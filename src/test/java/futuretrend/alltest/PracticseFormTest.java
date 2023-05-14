package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.allpages.PracticseFormPage;
import futuretrend.driverfactory.TestBase;

public class PracticseFormTest extends TestBase {
	
	
	@Test
	public void practicseformCase1()
	{
		createNode("practicseformCase1");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		PracticseFormPage page1=new PracticseFormPage();
		page1.reachPracticseFromPage();
		page1.enterFirstName();
		page1.enterLastName();
		page1.enterEMailAddres();
		page1.clickGenderMale();
		page1.enterMobilenumber();
		page1.enterDOB();
		page1.selectHobbiesSport();
		page1.selectFile();
		page1.entercurrentaddress();
		page1.entercity();
		page1.enterState();
		page1.selectcountry();
		page1.clickonSendMessage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
