package com.demoproject.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopups {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testpages.herokuapp.com/pages/basics/alerts-javascript/");
		
		WebElement e1=driver.findElement(By.id("alertexamples"));
		Actions act=new Actions(driver);
		act.click(e1).perform();
//		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.id("confirmexample"));
		Actions act1=new Actions(driver);
		act1.click(e2).perform();
//		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.id("promptexample"));
		Actions act2=new Actions(driver);
		act2.click(e3).perform();
//		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Anup");
//		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
