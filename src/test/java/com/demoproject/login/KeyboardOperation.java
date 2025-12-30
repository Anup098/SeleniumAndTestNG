package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOperation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Anup");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
	//CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyDown(Keys.CONTROL).perform();
		
	}

}
