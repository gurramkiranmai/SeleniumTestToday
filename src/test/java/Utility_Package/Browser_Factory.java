package Utility_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Factory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browsername,String url) {
		
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium 3.0\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		

	}

}
