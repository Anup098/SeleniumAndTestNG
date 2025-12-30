package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//..if linkText methods fall,replace with //tag name[text()='Sauce Labs Backpack'] 
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bac')]")).click();
		//..if the attribute is incomplete use //tag name [contains(@attributename,'attribute value')]
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
