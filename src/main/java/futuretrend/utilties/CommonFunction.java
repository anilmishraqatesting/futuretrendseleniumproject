package futuretrend.utilties;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import futuretrend.driverfactory.TestBase;

public class CommonFunction extends TestBase{
	
	
	
	public static String readpropertFile(String key)
	{
		
		String output="";
		try {
			
			String path=System.getProperty("user.dir")+"\\src\\main\\java\\futuretrend\\envproperties\\config.properties";
			
			FileInputStream file=new FileInputStream(path);
			
			Properties prop=new Properties();
			prop.load(file);
			
			output=prop.getProperty(key);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
		
		
		
		
	}
	
	
	
	public void click(WebElement element,String message)
	{
		
		try {
			
			element.click();
			childtest.log(Status.PASS, "Sucessfully click on "+message);
			
		} catch (Exception e) {
			
			childtest.log(Status.FAIL, "Unable to click on "+message);
			
		}
		
	}
	
	
	
	public void enterData(WebElement element,String data,String message)
	{
		
		
		try {
			
			element.sendKeys(data);
			childtest.log(Status.PASS, "Sucessfully entered data "+data+" for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to enter the data "+data+" for "+message);
			
		}
		
		
	}
	
	
	public void selectDropdownByValue(WebElement element,String value,String message)
	{
		
		try {
			
			Select se=new Select(element);
			se.selectByValue(value);
			childtest.log(Status.PASS, "Sucessfully selected drop down value "+value+" for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to select the drop down value "+value+" for "+message);
			
		}
		
		
	}
	
	
	
	
	
	public void selectDropdownByText(WebElement element,String text,String message)
	{
		
		try {
			
			Select se=new Select(element);
			se.selectByValue(text);
			childtest.log(Status.PASS, "Sucessfully selected drop down value "+text+" for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to select the drop down value "+text+" for "+message);
			
		}
		
		
	}
	
	
	
	public void acceptAlertMessage(String message)
	{
		
		
		try {
			
			Alert al=driver.switchTo().alert();
			al.accept();
			childtest.log(Status.PASS, "Sucessfully Accepted Alert Message for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to Accept Alert Message for "+message);
			
		}
		
	}
	
	public void disnissAlertMessage(String message)
	{
		
		
		try {
			
			Alert al=driver.switchTo().alert();
			al.dismiss();
			childtest.log(Status.PASS, "Sucessfully Dismissed Alert Message for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to Dismiss Alert Message for "+message);
			
		}
		
	}
	
	
	
	
	
	public String getTextAlertMessage(String message)
	{
		
		String text="";
		try {
			
			Alert al=driver.switchTo().alert();
			 text=al.getText();
			childtest.log(Status.PASS, "Sucessfully Get Alert Message text for "+message);
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to GET Alert Message Text for "+message);
			
		}
		return text;
		
	}
	
	
	
	
	public void moveToFrame(WebElement element,String message)
	{
		
		try {
			
			driver.switchTo().frame(element);
			childtest.log(Status.PASS, "Sucessfully moved in Frame for "+message);
		} catch (Exception e) {
			childtest.log(Status.PASS, "Unable to move in Frame for "+message);
		}
		
	}
	
	
	
	public void switchToNewWindow(String message)
	{
		
	try {
		
		
		Set<String> windowhandle=driver.getWindowHandles();
		
		Iterator<String> itr=windowhandle.iterator();
		
		while(itr.hasNext())
		{
			
			String windowid=itr.next();
			driver.switchTo().window(windowid);
		}
		
		childtest.log(Status.PASS, "Sucessfully moved in New window for "+message);
		
	} catch (Exception e) {
		childtest.log(Status.PASS, "Unable to move in New window for "+message);
		
	}	
	}
	
	
	
	
	
	public String getOldWindowHandle()
	{
		
		String oldwindow="";
	try {
		
		oldwindow=driver.getWindowHandle();
		
		childtest.log(Status.PASS, "Sucessfully get old iwndow handler");
		
		
	} catch (Exception e) {
		childtest.log(Status.FAIL, "Unable to get old window handler");
	}
	return oldwindow;	
	}
	
	
	
	
	
	
	
	
	
	
	public static void launchURL()
	{
		String url="";
		try {
			 url=CommonFunction.readpropertFile("url");
			driver.get(url);
			childtest.log(Status.PASS, "Sucessfully Launched the url "+url+"");
			
			
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Unable to launch url "+url+"");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
