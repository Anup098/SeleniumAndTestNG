package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class SC extends BaseClass
{
	
	@Test
	void login()
	{
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
	}
	

}
