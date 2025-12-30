package com.demoproject.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MMTtrainstatus {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
//		driver.findElement(By.xpath("//img[@alt='minimize']")).click();
		
		driver.findElement(By.className("menu_Trains")).click();

		driver.findElement(By.xpath("//span[@data-cy='liveTrainStatus']")).click();
		
		driver.findElement(By.id("trainNum")).click();
	
		driver.findElement(By.className("react-autosuggest__input")).sendKeys("12555");
		
		Thread.sleep(1000);
		driver.findElement(By.className("sr_city")).click();
		
		Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE).perform();
		
		driver.findElement(By.className("primaryBtn")).click();
//		driver.findElement(By.xpath("//img[@alt='minimize']")).click();
		driver.findElement(By.xpath("//textarea[@class='tp-dt-enhanced-input-box']")).sendKeys("NO");
		driver.findElement(By.xpath("//img[@class='tp-dt-enhanced-search-icon']")).click();
	}

}

