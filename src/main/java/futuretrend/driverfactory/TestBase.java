package futuretrend.driverfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import futuretrend.reportutilty.HighLevelReport;
import futuretrend.utilties.CommonFunction;

public class TestBase extends HighLevelReport{
	
	public static WebDriver driver=null;
	
	
	@BeforeSuite
	public void startReporting()
	{
		
		generateHTMLReport();
		
	}
	
	@AfterSuite
	public void closereporting()
	{
		
		saveReport();
	}
	
	
	@BeforeMethod
	public void startTest()
	{
		
		driver=BrowserFactory.initalizeDriver();
		DriverFactorySetting.getInstance().setDriver(driver);
		driver=DriverFactorySetting.getInstance().getDriver();
		
	}
	
	
	@AfterMethod
	public void closeTest()
	{
		
		DriverFactorySetting.getInstance().removeDriver();
		
	}
	

}
