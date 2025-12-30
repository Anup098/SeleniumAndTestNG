package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeTest
	public void broweserSetup()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	public void screenshot() throws IOException
	{
		TakesScreenshot tsc=(TakesScreenshot)driver;	
		File a3=tsc.getScreenshotAs(OutputType.FILE);
		File a4=new File("C:\\Users\\Anup Singh\\eclipse-workspace\\demoproject\\Screenshot\\Error.png");
		FileUtils.copyFile(a3, a4);
	}
}
