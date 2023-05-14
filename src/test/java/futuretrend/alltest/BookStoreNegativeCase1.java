package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.BookStorePage;
import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class BookStoreNegativeCase1 extends TestBase {
	
	
	@Test
	public void searchbookstorecasenegative1()
	{
		
		createNode("searchbookstorecasenegative1");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		BookStorePage bookpage=new BookStorePage();
		bookpage.reachbookStorePage();
		bookpage.searchbookbyAuthorcase4();
	}

}
