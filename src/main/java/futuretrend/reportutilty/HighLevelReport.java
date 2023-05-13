package futuretrend.reportutilty;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import futuretrend.utilties.CommonFunction;

public class HighLevelReport {
	
	
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlreporter;
	public static ExtentTest parenttest;
	public static ExtentTest childtest;
	
	
	
	
	public void generateHTMLReport()
	{
		
		try {
			
			long time=System.currentTimeMillis();
			
			String path=System.getProperty("user.dir")+"\\automationreport\\Report"+time+".html";
			htmlreporter=new ExtentSparkReporter(path);
			extent=new ExtentReports();
			extent.attachReporter(htmlreporter);
			
			 htmlreporter.config().setDocumentTitle("FutureTrend WebBased Testing");
			 htmlreporter.config().setReportName("FutureTrend Web Testing Report");
			 htmlreporter.config().setTheme(Theme.STANDARD);
			
			 String osname=System.getProperty("os.name");
			 String username=System.getProperty("user.name");
			 String browsername=CommonFunction.readpropertFile("browser");
			 
			 extent.setSystemInfo("System Name", username);
			 extent.setSystemInfo("OS Of SYSTEM", osname);
			 extent.setSystemInfo("Browser Name", browsername);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void saveReport()
	{
		
		extent.flush();
		
	}
	
	
	public void createNode(String name)
	{
		
		try {
			childtest=extent.createTest(name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	

}
