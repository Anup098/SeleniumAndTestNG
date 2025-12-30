package testNG;

import org.testng.annotations.Test;

public class LoginClass extends BaseClass2 {
	
	
	@Test
	void login()
	{
		driver.get(url);
	}
	
	

}
