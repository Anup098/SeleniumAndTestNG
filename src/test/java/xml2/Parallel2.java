package xml2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	
	public WebDriver driver;
	@Test
	void a3()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	void a4()
	{
		driver=new ChromeDriver();
		driver.get("https://fb.com");
	}

}
