package com.demoproject.login;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecom_Project {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("test"+System.currentTimeMillis()+"@gmail.com");
		
		driver.findElement(By.cssSelector("i.icon-user")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("Anup");
        driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("Singh");
        driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("Test@123");
        
        WebElement daydropdown=driver.findElement(By.tagName("select"));
        Select scday=new Select(daydropdown);
		scday.selectByValue("9");
		
		WebElement monthDropdown=driver.findElement(By.id("months"));
        Select scMonth=new Select(monthDropdown);
        scMonth.selectByValue("2");
			
        WebElement yearDropdown = driver.findElement(By.id("years"));
        Select scYear = new Select(yearDropdown);
        scYear.selectByValue("2001");
        
        driver.findElement(By.id("newsletter")).click();
        
        driver.findElement(By.id("submitAccount")).click();
        
        driver.findElement(By.xpath("//a[@title='Add my first address']")).click();
        
        driver.findElement(By.id("company")).sendKeys("Ducat");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Near Sab Mall");
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("sector 27");
        driver.findElement(By.id("city")).sendKeys("Noida");
        
        WebElement statedropdown=driver.findElement(By.id("id_state"));
        Select scstate=new Select(statedropdown);
        scstate.selectByValue("14");
		
		driver.findElement(By.id("postcode")).sendKeys("12345");
		driver.findElement(By.id("phone")).sendKeys("0987654321");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea[@data-validate='isMessage']")).sendKeys("Nothing");
		driver.findElement(By.id("alias")).sendKeys("kooch bhi nhi");
		driver.findElement(By.xpath("//button[contains(@name,'submitAddress')]")).click();
		driver.findElement(By.className("btn")).click();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']")).click();
		
//		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.tagName("select"));
		Select sc=new Select(dropdown);
		sc.selectByIndex(2);
		
		driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,'Proceed to checkout')]"))).click();
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'standard-checkout')]"))).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		driver.findElement(By.id("cgv")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@name,'processCarrier')]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'button btn')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollTo(0,400)");
		
        TakesScreenshot js1=(TakesScreenshot)driver;	
		File a3=js1.getScreenshotAs(OutputType.FILE);
		File a4=new File("C:\\Users\\Anup Singh\\eclipse-workspace\\SeleniumAndTestNG\\ScreenshotOrderComplete.png");
		FileUtils.copyFile(a3, a4);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
