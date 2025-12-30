package com.demoproject.login;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotandIMGclick {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//for specific element screenshot
		driver.get("https://www.opencart.com/");
		WebElement submit=driver.findElement(By.xpath("//div[@class='col-md-12']"));
		// for particular element
		File a1=submit.getScreenshotAs(OutputType.FILE);
		File a2=new File("D:\\SeleniumScreenshot\\colmd121.png");
		FileUtils.copyFile(a1, a2);
		Thread.sleep(3000);
		//for full page screenshot	And IMAGE CLICK
		WebElement act=driver.findElement(By.xpath("//img[@title='PayPal']"));
		Actions click=new Actions(driver);
		click.click(act).perform();
		
		TakesScreenshot js=(TakesScreenshot)driver;
		
		File a3=js.getScreenshotAs(OutputType.FILE);
		File a4=new File("D:\\SeleniumScreenshot\\Payapl1.png");
		FileUtils.copyFile(a3, a4);
		
        
	}

}
