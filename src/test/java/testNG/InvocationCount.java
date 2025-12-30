package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InvocationCount {
	
	public WebDriver driver;
	
	@Test(invocationCount = 1000000000)
	void test1()
	{
		System.out.println("ANUP Singh");

	}

}