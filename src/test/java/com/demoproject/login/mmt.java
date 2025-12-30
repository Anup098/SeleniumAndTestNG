package com.demoproject.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mmt {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//img[@alt='minimize']")).click();
		
		driver.findElement(By.id("fromCity")).sendKeys("Gorakhpur");
		Thread.sleep(2000);
		WebElement doubleclick=driver.findElement(By.id("react-autowhatever-1-section-0-item-0"));
		Actions right=new Actions(driver);
		right.doubleClick(doubleclick).perform();
		 
		driver.findElement(By.id("toCity")).sendKeys("New Delhi");
		Thread.sleep(2000);
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		
		String expectedMonthYear = "March 2026";
        String expectedDay = "9";

        while (true) {
           
            String currentMonthYear=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();

            if (currentMonthYear.equalsIgnoreCase(expectedMonthYear)) 
            {    
                List<WebElement>l1=driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='dateInnerCell']/p[1]"));

                for (WebElement l2 : l1) {
                    String dayText = l2.getText();
                    
                    if (dayText.equals(expectedDay)) 
                    {
                        l2.click();
                        break;
                    }
                }
                break; 
            } 
             else 
            {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
        }
        
        driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
}
