package futuretrend.driverfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

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
		
		try {
			driver=BrowserFactory.initalizeDriver();
			DriverFactorySetting.getInstance().setDriver(driver);
			driver=DriverFactorySetting.getInstance().getDriver();
			CommonFunction function=new CommonFunction();
			function.launchURL();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@AfterMethod
	public void closeTest()
	{
		
		try {
			DriverFactorySetting.getInstance().removeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
