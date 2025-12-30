package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	public WebDriver driver;
	@Test
	void a1()
	{
		driver=new ChromeDriver();
		driver.get("https://youtube.com");
	}
	@Test
	void a2()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

}


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite" parallel="tests">
//  <test thread-count="5" name="testNG">
//    <classes>
//      <class name="testNG.Parallel"/>
//    </classes>
//  </test> <!-- Test -->
//  <test thread-count="5" name="xml2">
//    <classes>
//      <class name="xml2.Parallel2"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

