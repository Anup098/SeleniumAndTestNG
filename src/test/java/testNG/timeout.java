package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {
	
	@Test(timeOut = 1000)
	void test1()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("password")).sendKeys("Password123");
    driver.findElement(By.id("submit")).click();
	driver.findElement(By.className("wp-block-button__link")).click();
	driver.quit();
	}

}
