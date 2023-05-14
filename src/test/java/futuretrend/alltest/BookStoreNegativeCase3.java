package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.BookStorePage;
import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class BookStoreNegativeCase3 extends TestBase {
	
	
	@Test
	public void searchbookstorecasenegative3()
	{
		
		createNode("searchbookstorecasenegative3");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		BookStorePage bookpage=new BookStorePage();
		bookpage.reachbookStorePage();
		bookpage.searchbookbyTitlecase6();
	}

}
