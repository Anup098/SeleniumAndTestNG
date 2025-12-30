package com.demoproject.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws Exception {
		
		String expMonth="May";
		String expYear="2026";
		String expDay="23";
		String checkoutday="30";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		//WebElement a1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String actMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if(expMonth.equals(actMonth) && expYear.equals(actYear))
			{
				List<WebElement> l1 = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement l2:l1)
				{
					String actDay = l2.getText();
					
					if(expDay.equals(actDay))
					{
						l2.click();
						break; 
					}
				}
				
				break;
			}
			else
			{
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
	    }
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.easemytrip.com/hotels/");
		
		driver.findElement(By.id("htl_dates")).click();
		
		WebElement Year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select sc=new Select(Year);
		sc.selectByValue("2026");
		
		WebElement Month=driver.findElement(By.xpath(" //select[@class='ui-datepicker-month']"));
		Select sc1=new Select(Month);
		sc1.selectByValue("9");
		
	    List<WebElement>l1=driver.findElements(By.xpath("//table/tbody/tr/td"));
	    
	    for(WebElement l2:l1)
	    {
	    	String actDay=l2.getText();
	    	
	    	if(expDay.equals(actDay))
	    	{
	    		l2.click();
	    		break;
	    	}
	    }
	    
	   List<WebElement>l2=driver.findElements(By.xpath("//table/tbody/tr/td"));

	    for (WebElement l3:l2) 
	    {
	        String actDay=l3.getText();

	        if (checkoutday.equals(actDay)) 
	        {
	            l3.click();
	            break;
	        }
	    }
	
	}
}