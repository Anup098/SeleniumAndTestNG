package com.demoproject.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectParticularInaTableorWEBTABLE {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.letskodeit.com/practice");
		WebElement a=driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
		System.out.println(a.getText());
		
		WebElement a1=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		System.out.println(a1.getText());
		
		WebElement a2=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]"));
		System.out.println(a2.getText());
		
		List<WebElement> e1=driver.findElements(By.xpath("//table/tbody/tr"));
		int row=e1.size();
		System.out.println(row);
		
		List<WebElement> e2=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		int col=e2.size();
		System.out.println(col);
	//for all table data view	
		for(WebElement e3:e1)
		{
			System.out.println(e3.getText());
		}
		
	}

}
