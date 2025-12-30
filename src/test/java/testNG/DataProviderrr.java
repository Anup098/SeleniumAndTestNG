package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderrr {
	public WebDriver driver;

	@Test(dataProvider = "Datapro")
	void m1(String user,String pass)
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
	}
	@DataProvider(name="Datapro")
	public String[][] getData()
	{
		String a[][]=new String[2][2];
		a[0][0]="student";
		a[0][1]="Password123";
		a[1][0]="abc";
		a[1][1]="bac";
		return a;
		
	}
}
