package zzpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testautom {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("name")).sendKeys("Anup Singh");
		driver.findElement(By.id("email")).sendKeys("ts"+System.currentTimeMillis()+"@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Nothing");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		driver.findElement(By.xpath("//input[@id='saturday']")).click();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select sc=new Select(country);
		sc.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//option[@value='white']")).click();
		driver.findElement(By.xpath("//option[@value='dog']")).click();
		
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).sendKeys("D:\\DUCAT\\CUCUMBER\\Git.pdf");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		
		driver.findElement(By.id("input1")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='input2']")).sendKeys("nu");
		driver.findElement(By.xpath("//input[@id='input3']")).sendKeys("p");
		driver.findElement(By.xpath("//button[text()='START']")).click();
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		driver.switchTo().alert().accept();
////		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
////		driver.close();
//		driver.findElement(By.xpath("//button[@id='PopUp']")).click();
//		driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']")).click();
////		driver.close();
		WebElement ms=driver.findElement(By.xpath("//button[text()='Point Me']"));
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(ms).perform();
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions dc=new Actions(driver);
		dc.doubleClick(doubleclick).perform();
		
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();

//		WebElement dropdown = driver.findElement(By.id("comboBox"));
//		dropdown.click();
//		Select sc1=new Select(dropdown);
//		sc1.selectByVisibleText("Item 3");
		
		driver.findElement(By.linkText("Apple")).click();


	}

}
