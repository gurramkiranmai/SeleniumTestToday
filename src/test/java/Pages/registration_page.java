package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registration_page {
	WebDriver driver;
	
	By signup = By.xpath("//a[@href='RegisterUser.htm']");
	By username = By.id("userName");
	By firstname = By.id("firstName");
	By lastname = By.id("lastName");
	By password = By.id("password");
	By cpassword = By.id("pass_confirmation");
	By gender = By.xpath("//input[@value ='Female']");
	By gmail = By.id("emailAddress");
	By mobnum = By.id("mobileNumber");
	By dob = By.name("dob");
	By address = By.id("address");
	By question  = By.xpath("//*[@name='securityQuestion']/option[2]");
	By answer = By.id("answer");
	By register = By.name("Submit");
	
	
	public registration_page(WebDriver driver) {
		this.driver=driver;
		}
	
	public void signupuser (String un,String fn,String ln,String pass,String cpass,String mail,String num,String db,String ad,String ans) 
	{
		driver.findElement(signup).click();
		driver.findElement(username).sendKeys(un);
		driver.findElement(firstname).sendKeys(fn);
		driver.findElement(lastname).sendKeys(ln);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(cpassword).sendKeys(cpass);
		driver.findElement(gender).click();
		driver.findElement(gmail).sendKeys(mail);
		driver.findElement(mobnum).sendKeys(num);
		driver.findElement(dob).sendKeys(db);
		driver.findElement(address).sendKeys(ad);
		driver.findElement(question).click();
		driver.findElement(answer).sendKeys(ans);
		driver.findElement(register).submit();

	}

}
