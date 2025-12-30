package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions
{

	public static WebDriver driver;
	
	@Test 
 	void googleTitleVerify() 
 	{ 
 	 	driver=new ChromeDriver();  	 	
 	 	driver.get("https://google.com");  	 	
 	 	String ExpTille="Google"; 
 	 	String ActTitle= driver.getTitle();  	 	
 	 	SoftAssert as=new SoftAssert();  	 	
 	 	as.assertEquals(ExpTille, ActTitle); 
 	 	System.out.println("hello"); 

 	}
	
//	public class SoftAssert { 
//	 	 
//	 	@Test 
//	 	void googleTitleVerifyy() 
//	 	{ 
//	 	 	WebDriver driver=new ChromeDriver();  	 	
//	 	 	driver.get("https://google.com");  	 	
//	 	 	String ExpTille="Google"; 
//	 	 	String ActTitle= driver.getTitle();  	 	
//	 	 	SoftAssert as1=new SoftAssert();  	 	
//	 	 	as1.assertEquals(ExpTille, ActTitle);  	 	
//	 	 	System.out.println("hello"); 
//	 	 	as1.assertAll(); 
//	 	 	 
//	 	} 
//	} 

}
