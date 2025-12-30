package com.demoproject.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// Tag and Id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//Tag and Attribute
		driver.findElement(By.cssSelector("input[data-test=password]")).sendKeys("secret_sauce");
		// Tag and Class
		driver.findElement(By.cssSelector("input.submit-button")).click();
		// Tag and class and attribute
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
		driver.findElement(By.cssSelector("button#checkout")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}