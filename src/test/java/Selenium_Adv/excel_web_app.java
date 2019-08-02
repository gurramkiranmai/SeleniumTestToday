package Selenium_Adv;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class excel_web_app {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/");	
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@href= 'login.htm']")).click();
	  File src = new File ("C://Selenium 3.0//first.xlsx");
	  FileInputStream f1 = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(f1);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  int i = 0;
	  int j = 0;
	  int k = sheet1.getLastRowNum();
	  
	 
	  for (i=0;i<=k;i++) {
		  for (j=0;j<=1;j++) {
	  String username = sheet1.getRow(i).getCell(j).getStringCellValue();
	  driver.findElement(By.id("userName")).sendKeys(username);
	  j++;
	  String password = sheet1.getRow(i).getCell(j).getStringCellValue(); 
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("Login")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.navigate().back();
	  driver.findElement(By.id("userName")).clear();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  /*
	  sheet1.getRow(0).createCell(2).setCellValue("pass");
	  sheet1.getRow(1).createCell(2).setCellValue("fail");
	  
	  FileOutputStream fo = new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
	  */
		  }
	  }
	  
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
