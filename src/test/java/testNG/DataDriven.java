package testNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	    @Test(dataProvider = "Datapro")
		void login(String username,String password)
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("submit")).click();
			
		}
	
	@DataProvider(name="Datapro")
	public String[][] getdata() throws Exception
	{
		String s1[][]=getExcelData();
		return s1;
	}
	public String[][]getExcelData() throws Exception {
		
		XSSFWorkbook wb;
		XSSFSheet ws;
		String file_name="D:\\Testcase.xlsx";
		
		FileInputStream fn=new FileInputStream(file_name);
		wb=new XSSFWorkbook(fn);
		ws=wb.getSheet("Sheet1");
		int rowcount=ws.getLastRowNum()+1;
		int colcount=ws.getRow(0).getLastCellNum();
		
		String s2[][]=new String[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++) 
 	 	{ 
 	 	 	for(int j=0;j<colcount;j++) 
 	 	 	{ 
 	 	 		s2[i][j]=ws.getRow(i).getCell(j).toString();
 	 	 	} 
 	 	 	}
		wb.close();
		return s2; 
 	 	} 

		
	}
	
