package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {

	public WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	    @Test
		void test1()
		{
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		}
	    @Test
		void test2()
		{
		   driver.findElement(By.id("submit")).click();
		}
	    @Test
		void test3()
		{
		driver.findElement(By.className("wp-block-button__link")).click();
		}
		@AfterClass
		void close()
		{
		driver.quit();
		}
	}



		
