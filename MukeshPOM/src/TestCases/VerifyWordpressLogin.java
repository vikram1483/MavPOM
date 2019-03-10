package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class VerifyWordpressLogin
{
	@Test
	public void verifyValidLogin()
	{
	 
	WebDriver driver=new FirefoxDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://demosite.center/wordpress/wp-login.php");
	 
	LoginPage login=new LoginPage(driver);
	 
	 //login.loginToWordpress("admin", "demo123");
	
	login.typeUserName("admin");
	login.typePassword("demo123");
	login.clickLogin();

	//driver.quit();
	 
	}
}
