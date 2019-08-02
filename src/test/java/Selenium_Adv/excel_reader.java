package Selenium_Adv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel_reader {
  @Test
  public void readdata() throws IOException {
	 
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
		  j++;
	
		  String pass = sheet1.getRow(i).getCell(j).getStringCellValue(); 
		  System.out.println("username is " +username +" and password is " +pass);
		 
	  }
	  
	 
		  
		
	  
	  
	  
	  
	
	  
	  wb.close();
	  
	  
	  }
  }
}

