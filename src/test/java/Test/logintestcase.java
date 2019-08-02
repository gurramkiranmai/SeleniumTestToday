package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Login_page;
import Utility_Package.Browser_Factory;

public class logintestcase {
	WebDriver driver;
	
  @Test
  public void test() {
	  WebDriver driver = Browser_Factory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	  Login_page log =new Login_page(driver);
	  log.loginuser("lalitha","Password123");
	  
	  
  }
}
