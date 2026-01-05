package zzpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("s25 ultra",Keys.ENTER);
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Samsung Galaxy S25 Ultra 5G (Titanium Silverblue, 256 GB)']")).click();
		String childwindow=driver.getWindowHandle();
//		Thread.sleep(2000);
//		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//button[@class='dSM5Ub ugg2XR KCQxN7 KcXDCU']")).click();

	}

}
