package com.demoproject.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//ALERT POP UPS
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	//FOR DISMISS ALERT POP UPS  use   driver.switchTO().alert().dismiss();
		
		
		//for right click 
         driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		 Actions right=new Actions(driver);
		 right.contextClick(rightclick).perform(); 
		
		
		// for move mouse pointer a particular element
		 driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//button[contains(@class,'a-button-text')]")).click();
			WebElement movemouse=driver.findElement(By.xpath("//div[text()='EN']"));
			Actions act1=new Actions(driver);
			act1.moveToElement(movemouse).perform();
		
		
			
		
	}

}
