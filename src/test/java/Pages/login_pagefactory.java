package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class login_pagefactory {

	WebDriver driver;
	
	public login_pagefactory(WebDriver driver) 
	{
		this.driver=driver;

	}
	@FindBy(how=How.XPATH, using="//a[@href= 'login.htm']")
	WebElement signin;
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	@FindBy(how=How.NAME, using="password")
	WebElement password;
	@FindBy(how=How.NAME, using="Login")
	WebElement login;
	
	public void loginuser(String un,String pass)
	{
		signin.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		login.click();
	}
}
