package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass2 {
	
	public static WebDriver driver;
	public ReadConfiguration r=new ReadConfiguration();
	String browser=r.getBrowser();
	String url=r.getUrl();
	
	@BeforeTest
	public void setup()
	{
		switch(browser)
		{
		case "chrome" :
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
		case "msedge" :
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		break;
		case "firefox" :
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		break;
		default :
			driver=null;
		
		}
	}
	

}
