package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.className("submit-button")).click();
      //..................By.partialLinktest("Sauce Lab Backpa")for incomplete link
       driver.findElement(By.linkText("Sauce Labs Backpack")).click();
     
        driver.findElement(By.id("add-to-cart")).click();
       
        driver.findElement(By.className("shopping_cart_link")).click();
        
        driver.findElement(By.id("checkout")).click();
         
	}

}
