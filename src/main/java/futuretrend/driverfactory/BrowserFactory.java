package futuretrend.driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import futuretrend.capibilities.ChromeBrowserCapibilities;
import futuretrend.capibilities.EdgeBrowserCapbilities;
import futuretrend.capibilities.FirefoxBrowserCapbilities;
import futuretrend.utilties.CommonFunction;

public class BrowserFactory {
	
	
	
	public static WebDriver initalizeDriver()
	{
		
		WebDriver driver=null;
		
		try {
			
			String browserkey=CommonFunction.readpropertFile("browser");
			
			
			
			if(browserkey.equalsIgnoreCase("chrome"))
			{
				
				driver=new ChromeDriver(ChromeBrowserCapibilities.option);
			}
			
			else if(browserkey.equalsIgnoreCase("firefox"))
			{
				
				driver=new FirefoxDriver(FirefoxBrowserCapbilities.option);
			}
			
			
			else if(browserkey.equalsIgnoreCase("edge"))
			{
				
				driver=new EdgeDriver(EdgeBrowserCapbilities.option);
			}
			
			else
			{
				System.out.println("Please check your Browser Name in property File");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		
		
		
		
	}

}
