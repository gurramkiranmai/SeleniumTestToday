package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.login_pagefactory;
import Utility_Package.Browser_Factory;

public class login_tc_pagefactory {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver = Browser_Factory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp/");
	  login_pagefactory log =PageFactory.initElements(driver,login_pagefactory.class);
	  log.loginuser("lalitha","Password123");
	  
  }
}
