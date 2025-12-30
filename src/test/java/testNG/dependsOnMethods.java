package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class dependsOnMethods {
	
	@Test(dependsOnMethods="python") 
	 	void java() 
	 	{ 
	 	 	System.out.println("java"); 
	 	} 
	 	@Test 
	 	void selenium() 
	 	{ 
	 	 	System.out.println("selenium"); 
	 	} 
	 	@Test 
	 	void Automation() 
	 	{ 
	 	 	System.out.println("Automation"); 
	 	} 
	 	@Test 
	 	void python() 
	 	{ 
	 	  Assert.assertTrue(false); // for forcefully failed the test case	 
	 	} 
	 	@Test 
	 	void testng() 
	 	{ 
	 	 	System.out.println("testNG"); 
	 	 	 
	 	} 


}
