package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {

	WebDriver driver;
	By signin = By.xpath("//a[@href= 'login.htm']");
	By username=By.name("userName");
	By password=By.name("password");
	By login= By.name("Login");
	
	public Login_page(WebDriver driver) {
		this.driver=driver;
		

	}

	public void loginuser(String un,String pass)
	{
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
}
