package Selenium_Adv;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class first {
  @Test (priority =0)
  public void Login() {
	  System.out.println("Login");
	   
  }
  
  @Test(enabled = true)
  public void Search() {
	  System.out.println("Search");
	   
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
	  
	  
	  
  }

}
