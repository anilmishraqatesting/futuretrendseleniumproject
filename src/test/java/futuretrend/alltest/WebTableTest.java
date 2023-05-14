package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.LoginPage;
import futuretrend.allpages.WebTablePage;
import futuretrend.driverfactory.TestBase;

public class WebTableTest extends TestBase{
	
	
	@Test
	public void webtablecase1()
	{
		
		createNode("webtablecase1");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		WebTablePage webpage=new WebTablePage();
		webpage.reachWebtablePage();
		webpage.fetchTableData();
		
		
		
	}

}
