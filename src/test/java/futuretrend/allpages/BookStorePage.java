package futuretrend.allpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import futuretrend.driverfactory.TestBase;
import futuretrend.utilties.CommonFunction;

public class BookStorePage extends TestBase {
	
	
	@FindBy(xpath = "//a[contains(text(),'Book Store Application')]")
	public WebElement bookstoreapplicationlink;
	
	
	@FindBy(xpath = "(//span[contains(text(),'Book Store')])[1]")
	public WebElement bookstoreLink;
	
	
	@FindBy(id="searchInput")
	public WebElement searchbooktxtbox;
	
	
	@FindBy(xpath = "//button[@onclick='searchBooks()']")
	public WebElement searchbooksbutton;
	
	
	@FindBy(xpath = "//tr[td[contains(text(),'Lee Child')]][td[contains(text(),'Dell')]]/td[contains(text(),'$17')]")
   
	public WebElement authorbookfullrowtxt;
	
	@FindAll(
	@FindBy(xpath="//tr[td[contains(text(),'bac')]][td[contains(text(),'xyz')]]/td[contains(text(),'$17')]")
	)
	public List<WebElement> wrongbookrowttx;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'No Middle Name')]")
	public WebElement nomiddlenameLink;
	
	
	@FindBy(xpath = "//button[contains(text(),'Add to Cart')]")
	public WebElement addtocartbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Pay Now')]")
	public WebElement paynowlink;
	
	
	
	
	public BookStorePage()
	{
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	CommonFunction function=new CommonFunction();
	
	public void reachbookStorePage()
	{
		
		function.click(bookstoreapplicationlink, "Book Store Application Link");

		function.click(bookstoreLink, "Book Store  Link");
	}
	
	public void searchbookbyAuthorcase1()
	{
		
		function.enterData(searchbooktxtbox, "Lee", "Search Author");
		function.click(searchbooksbutton, "search button");
		function.checkElement(authorbookfullrowtxt, "Valid Author row");
		
	}
	
	
	public void searchbookbypublishercase2()
	{
		
		function.enterData(searchbooktxtbox, "Dell", "Search Publisher");
		function.click(searchbooksbutton, "search button");
		function.checkElement(authorbookfullrowtxt, "Valid Publisher row");
		
	}
	
	
	public void searchbookbyTitlecase3()
	{
		
		function.enterData(searchbooktxtbox, "No Middle Name", "Search By Title");
		function.click(searchbooksbutton, "search button");
		function.checkElement(authorbookfullrowtxt, "Valid Title row");
		
	}
	
	
	
	
	
	
	
	
	public void searchbookbyAuthorcase4()
	{
		
		function.enterData(searchbooktxtbox, "abc", "Search Author");
		function.click(searchbooksbutton, "search button");
		function.checkNegativeElement(wrongbookrowttx, "Wrong book row data");
		
	}
	
	
	public void searchbookbypublishercase5()
	{
		
		function.enterData(searchbooktxtbox, "xyz", "Search Publisher");
		function.click(searchbooksbutton, "search button");
		function.checkNegativeElement(wrongbookrowttx, "Wrong book row data");
		
	}
	
	
	public void searchbookbyTitlecase6()
	{
		
		function.enterData(searchbooktxtbox, "pqrs", "Search By Title");
		function.click(searchbooksbutton, "search button");
		function.checkNegativeElement(wrongbookrowttx, "Wrong book row data");
		
	}
	
	
	
	
	
	public void purchasebook()
	{
		
			
			function.enterData(searchbooktxtbox, "Lee", "Search Author");
			function.click(searchbooksbutton, "search button");	
			function.click(nomiddlenameLink, "No Middle Name ");
			function.click(addtocartbutton, "Add to cart");
			function.click(paynowlink, "Paynow");
			function.acceptAlertMessage("Payment Sucessfull");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
