package futuretrend.alltest;

import org.testng.annotations.Test;

import futuretrend.allpages.BookStorePage;
import futuretrend.allpages.LoginPage;
import futuretrend.driverfactory.TestBase;

public class BookStoreCase3 extends TestBase {
	
	
	@Test
	public void searchbookstorecase1()
	{
		
		createNode("searchbookstorecase3");
		LoginPage page=new LoginPage();
		page.enterUserName();
		page.enterPassword();
		page.clickLoginbutton();
		BookStorePage bookpage=new BookStorePage();
		bookpage.reachbookStorePage();
		bookpage.searchbookbyTitlecase3();
	}

}
