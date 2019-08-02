package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import Pages.registration_page;
import Utility_Package.Browser_Factory;

public class registration_page_test {
	String expectedresult ="User Registered Succesfully!!! Please login";
	WebDriver driver;
  @Test
  public void registration_test() {
	  WebDriver driver = Browser_Factory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	  registration_page log =new registration_page(driver);
	  log.signupuser ("kuiitf","yl","mjyuir","pasd253","pasd253","pnce @gmail.com","8529631852","15/04/1995","Anantapur","Black");
	  String  msg = driver.findElement(By.xpath("//div[@id='errormsg'][4]")).getText();
	  
	  
	  Assert.assertEquals(msg,expectedresult);
	  System.out.println("pass");
	 
  }
}
