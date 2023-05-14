package futuretrend.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import futuretrend.driverfactory.TestBase;
import futuretrend.utilties.CommonFunction;

public class RadioButtonPage extends TestBase {
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Radio Button')]")
	public WebElement radiobuttonlink;
	
	
	@FindBy(xpath = "//input[@value='Yes']")
	public WebElement yesrb;
	
	@FindBy(xpath = "//input[@value='Impressive']")
	public WebElement impresiverb;
	
	@FindBy(xpath = "//input[@value='No']")
	public WebElement norb;
	
	
	@FindBy(xpath = "//p[contains(text(),'You have selected')]/span[contains(text(),'Yes')]")
	public WebElement yesradiobuttonvalidate;
	
	
	@FindBy(xpath = "//p[contains(text(),'You have selected')]/span[contains(text(),'Impressive')]")
	public WebElement impressiverbvalidate;
	
	
	@FindBy(xpath = "//p[contains(text(),'You have selected')]/span[contains(text(),'No')]")
	public WebElement norbvalidate;
	
	
	
	public RadioButtonPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	CommonFunction function=new CommonFunction();
	public void reachRadiobuttonPage()
	{
		WebTablePage page=new WebTablePage();
		function.click(page.elementslink, "Elements");
		function.click(radiobuttonlink, "Radio button link");
	}
	
	
	
	public void selectYesAndValidate()
	{
		
		function.click(yesrb, "Yes radio button");
		function.checkElement(yesradiobuttonvalidate, "Validate selected Yes radio button");
		
	}
	
	
	public void selectImpressiveAndValidate()
	{
		
		function.click(impresiverb, "Impressive radio button");
		function.checkElement(impressiverbvalidate, "Validate selected Impressive radio button");
		
	}
	
	public void selectNoAndValidate()
	{
		
		function.click(norb, "No radio button");
		function.checkElement(norbvalidate, "Validate selected NO radio button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
