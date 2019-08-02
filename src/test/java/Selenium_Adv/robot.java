package Selenium_Adv;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot {

	public static void main(String[] args) throws AWTException {

		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32(2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open page
		driver.get("file:///C:/Selenium 3.0/fileupload.html");
		driver.findElement(By.id("1")).click();
		robot.delay(1000);
		String path="C:\\Users\\Training_c2d.02.11\\Downloads\\Vehicle Parking Sticker Form.docx";
		StringSelection sel = new StringSelection(path);
		//copy to clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
