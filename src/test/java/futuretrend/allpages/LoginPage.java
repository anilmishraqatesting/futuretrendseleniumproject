package futuretrend.allpages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import futuretrend.driverfactory.TestBase;
import futuretrend.utilties.CommonFunction;

public class LoginPage extends TestBase {



	@FindBy(xpath = "//input[@data-key='username']")
	public WebElement usernametextbox;

	@FindBy(xpath = "//input[@data-key='user_password']")
	public WebElement passwordtextbox;


	@FindBy(xpath = "//input[@value='Login']")
	public WebElement loginbutton;


	@FindBy(xpath = "//h2[contains(text(),'QA Automation')]")
	public WebElement headertext;




	public LoginPage()
	{

		PageFactory.initElements(driver, this);
	}



	CommonFunction function=new CommonFunction();

	public void enterUserName()
	{
		String username=CommonFunction.readpropertFile("username");
		function.enterData(usernametextbox, username, "username");	

	}


	public void enterPassword()
	{

		String password=CommonFunction.readpropertFile("password");
		function.enterData(passwordtextbox, password, "Password");

	}


	public void clickLoginbutton()
	{

		function.click(loginbutton, "Login button");

	}



	public void validateLoggedinUser()
	{


		try {
			String text=headertext.getText();
			Assert.assertEquals(text, "QA Automation");
			childtest.log(Status.PASS, "Logged In User is valid");
		} catch (Exception e) {
			childtest.log(Status.FAIL, "Logged in user is invalid");
		}



	}












































}
