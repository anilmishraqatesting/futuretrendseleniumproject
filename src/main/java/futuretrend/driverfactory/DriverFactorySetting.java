package futuretrend.driverfactory;

import org.openqa.selenium.WebDriver;

public class DriverFactorySetting {
	
	
	
	ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static DriverFactorySetting instance=new DriverFactorySetting();
	
	private DriverFactorySetting()
	{
		
		
	}
	
	
	
	public static DriverFactorySetting getInstance()
	{
		
		return instance;
	}
	
	
	
	
	public void setDriver(WebDriver localdriver)
	{
		
		driver.set(localdriver);
		
	}
	
	public WebDriver getDriver()
	{
		
		return driver.get();
	}
	
	
	
	public void removeDriver()
	{
		
		driver.get().quit();
		driver.remove();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
