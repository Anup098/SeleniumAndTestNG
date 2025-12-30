package com.demoproject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndIframeAndDATEPICCKER {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// iframe by the indexing
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame(0);
		WebElement a1=driver.findElement(By.id("bseindex"));
		System.out.println(a1.getText());

//		For Number Of Frame
//		List<WebElement>l1=driver.findElements(By.tagName("iframe"));
//		System.out.println(l1.size());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		// Click on: Iframe with in an Iframe
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// -------- Switch to FIRST (outer) iframe --------
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);

		// -------- Switch to SECOND (inner) iframe --------
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerFrame);

		// -------- Enter text inside input box --------
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anup");
		
		
		

		// iframe by the xpath
		driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://jqueryui.com/datepicker/");
				
				WebElement b1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(b1);
				driver.findElement(By.id("datepicker")).click();	
		
	}

}
