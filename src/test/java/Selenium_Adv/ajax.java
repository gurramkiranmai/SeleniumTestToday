package Selenium_Adv;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebElement;

public class ajax {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	  By container = By.cssSelector(".demo-container");
	  WebDriverWait wait =new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(container));
	  
	  WebElement noDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	  String TextBeforeAjaxCall = noDatesTextElement.getText().trim();
	  
	  driver.findElement(By.linkText("2")).click();
	  
	  By loader = By.className("raDiv");
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	  
	  WebElement DatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	  wait.until(ExpectedConditions.visibilityOf(DatesTextElement));
	  String TextAfterAjaxCall = DatesTextElement.getText().trim();
	  
	  System.out.println(TextBeforeAjaxCall);
	  System.out.println(TextAfterAjaxCall);
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
