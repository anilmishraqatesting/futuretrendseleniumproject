package futuretrend.allpages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import futuretrend.driverfactory.TestBase;
import futuretrend.testdatareader.ReadTestDataFile;
import futuretrend.utilties.CommonFunction;

public class PracticseFormPage extends TestBase{
	
	
	
	@FindBy(xpath = "(//a[@href='https://anilmishraqatesting.com/forms/'])[2]")
	public WebElement formLink;
	
	@FindBy(xpath = "(//a[@href='https://anilmishraqatesting.com/practice-form/'])")
	public WebElement practicseformLink;
	
	
	@FindBy(name="name-1-first-name")
	public WebElement firstnametxtbox;
	
	
	@FindBy(name="name-1-last-name")
	public WebElement lastnametxtbox;
	
	
	@FindBy(name="email-1")
	public WebElement emailtxtbox;
	
	@FindBy(xpath = "//label[@title='Male']")
	public WebElement malerb;
	
	@FindBy(name="phone-1")
	public WebElement mobiletxtbox;
	
	@FindBy(name="date-1")
	public WebElement datetxtbox;
	
	
	@FindBy(xpath = "//label[@title='Sports']")
	public WebElement sportscb;
	
	@FindBy(name="upload-1")
	public WebElement uploadfile;
	
	
	@FindBy(name="textarea-1")
	public WebElement currentaddresstxtarea;
	
	
	@FindBy(name="address-1-city")
	public WebElement citytxtbox;
	
	@FindBy(name="address-1-state")
	public WebElement statetxtbox;
	
	
	@FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
	public WebElement dd1Link;
	
	
	@FindBy(xpath = "(//input[@class='select2-search__field'])[1]")
	public WebElement searchfieldtxtbox;
	
	@FindBy(xpath = "//li[starts-with(text(),'India')]")
	public WebElement selectcountryLink;
	
	
	@FindBy(xpath = "//button[starts-with(text(),'Send Message')]")
	public WebElement sendmessagebutton;
	
	
	
	public PracticseFormPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	CommonFunction function=new CommonFunction();
	ReadTestDataFile xlsfile=new ReadTestDataFile();
	
	public void enterFirstName()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(firstnametxtbox, map.get(1).get(0).toString(), map.get(1).get(0).toString());
		
	}
	
	public void enterLastName()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(lastnametxtbox, map.get(1).get(1).toString(), map.get(1).get(1).toString());
		
	}
	
	
	public void enterEMailAddres()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(emailtxtbox, map.get(1).get(2).toString(), map.get(1).get(2).toString());
		
	}
	
	public void clickGenderMale()
	{
		
		function.click(malerb, "Male");
	}
	
	
	public void enterMobilenumber()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(mobiletxtbox, map.get(1).get(3).toString(), "Mobile Number");
		
	}
	
	
	public void enterDOB()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(datetxtbox, map.get(1).get(4).toString(), "Date");
		
	}
	
	
	public void selectHobbiesSport()
	{
		

		function.click(sportscb, "Sports checkbox");
		
	}
	
	
	
	public void selectFile()
	{
		String path=System.getProperty("user.dir")+"\\upload\\test.png";
		
		function.enterData(uploadfile, path, "upload File");
	}
	
	
	public void entercurrentaddress()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(currentaddresstxtarea, map.get(1).get(5).toString(), "current address");
		
	}
	
	public void entercity()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(citytxtbox, map.get(1).get(6).toString(), "City");
		
	}
	
	
	public void enterState()
	{
		
		Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
		
		function.enterData(statetxtbox, map.get(1).get(7).toString(), "State");
		
	}
	
	
	public void selectcountry()
	{
		try {
			function.scrollPage(sendmessagebutton);
			//CommonFunction.waitforseconds();
			
			Map<Integer, List<Object>> map=xlsfile.readxlsFile("logindata.xlsx", "login");
			function.click(dd1Link, "arrow of country");
			function.click(searchfieldtxtbox, "");
			
			function.enterdatabyAction(searchfieldtxtbox, map.get(1).get(8).toString(), "enter country");
			function.click(selectcountryLink, "select India");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickonSendMessage()
	{
		
		function.click(sendmessagebutton, "Send Message");
	}
	
	
	
	public void reachPracticseFromPage()
	{
		
		function.click(formLink, "Form Link");
		function.click(practicseformLink, "Practicse Form Link");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
