package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
  
	    WebDriver driver;
	    
  
         By username=By.id("user_login");
         By password=By.id("user_pass");
         By logbutton=By.id("wp-submit");
	    
         public LoginPage(WebDriver driver)
         {
        	 this.driver=driver;
         }
  
  
         public void typeUserName(String uid)
         {
        	 driver.findElement(username).sendKeys(uid);
         }
         
         public void typePassword(String pid)
         {
        	 driver.findElement(password).sendKeys(pid);
         }
         
         
        public void clickLogin()
         {
        	 driver.findElement(logbutton).click();
         }
         
         
         public void loginToWordpress(String userid,String pass)
         {
        	 driver.findElement(username).sendKeys(userid);
        	 driver.findElement(password).sendKeys(pass);
        	 driver.findElement(logbutton).click();
         }
         
         
         
         
}

