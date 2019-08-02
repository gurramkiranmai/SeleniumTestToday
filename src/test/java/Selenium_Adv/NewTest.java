package Selenium_Adv;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/");	
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  WebElement search = driver.findElement(By.xpath("//input[@name='products']"));
	
		  
	  Actions act = new Actions(driver);
	  act.keyDown(search,Keys.SHIFT).perform();
	  act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	  Set<String> Set = driver.getWindowHandles();
		for (String s:Set)
		{
			driver.switchTo().window(s);
			
		}
	  String text =  driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
	  Assert.assertTrue(text.contains("Hand bag"));
  }
  
  
  @BeforeClass
                                                          
  public void beforeClass() {
	  
  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(2)\\chromedriver.exe");
  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
