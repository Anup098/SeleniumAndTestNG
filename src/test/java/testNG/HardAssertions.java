package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	public static WebDriver driver;
	
	@Test
 	void googleTitleVerify() 
 	{ 
 	 	driver=new ChromeDriver();  	 	
 	 	driver.get("https://google.com");  	 	
 	 	String ExpTille="Google"; 
 	 	String ActTitle= driver.getTitle(); 
 	 	Assert.assertEquals(ExpTille,ActTitle);
 	} 

	public class AssertNotEquals { 
	 	 
	 	@Test 
	 	void googleTitleVerify() 
	 	{ 
	 	 	driver=new ChromeDriver();  	 	
	 	 	driver.get("https://google.com");  	 	
	 	 	String ExpTille="Google"; 
	 	 	String ActTitle= driver.getTitle(); 
	 	 	Assert.assertNotEquals(ExpTille,ActTitle); 
	 	} 

	 	public class AssertTrue { 
	 	 	 
	 	 	@Test 
	 	 	void googleTitleVerify() 
	 	 	{ 
	 	 	 	driver=new ChromeDriver();  	 	
	 	 	 	driver.get("https://google.com"); 
	 	 	 	WebElement e1=driver.findElement(By.name("q")); 
	 	 	 	Assert.assertTrue(e1.isDisplayed()); 
	 	 	} 
	 	} 

	 	public class AssertFrue { 
	 	 	 
	 	 	@Test 
	 	 	void googleTitleVerify() 
	 	 	{ 
	 	 	 	driver=new ChromeDriver();  	 	
	 	 	 	driver.get("https://google.com"); 
	 	 	 	WebElement e1=driver.findElement(By.name("q")); 
	 	 	 	Assert.assertFalse(e1.isDisplayed()); 
	 	 	} 
	 	} 


	}
}
