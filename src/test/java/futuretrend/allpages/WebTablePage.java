package futuretrend.allpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import futuretrend.driverfactory.TestBase;
import futuretrend.utilties.CommonFunction;

public class WebTablePage extends TestBase {
	
	
	
	@FindBy(xpath = "(//a[@href='https://anilmishraqatesting.com/elements/'])[2]")
	public WebElement elementslink;
	
	@FindBy(xpath = "//span[contains(text(),'Web Tables')]")
    public WebElement webtableslink;
	
	
	public WebTablePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	CommonFunction function=new CommonFunction();
	public void reachWebtablePage()
	{
		
		function.click(elementslink, "Elements");
		function.click(webtableslink, "Webtable");
	}
	
	
	
	public void fetchTableData()
	{
		
		try {
			
			
		int rowcount=driver.findElements(By.xpath("//tbody/tr")).size();
			
		for(int i=0;i<rowcount;i++)
		{
			
			List<WebElement> colsize=driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
			for(int j=0;j<colsize.size();j++)
			{
				
				childtest.log(Status.PASS, "Data ==>   "+colsize.get(j).getText()+"");
				
			}
			
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
