package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anup Singh\\eclipse-workspace\\demoproject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username=driver.findElement(By.id("username"));
		
		username.sendKeys("student");
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.sendKeys("Password123");
		
		WebElement submit=driver.findElement(By.id("submit"));
		
		submit.click();
		driver.findElement(By.className("wp-block-button__link")).click();
		driver.quit();
	}

}
