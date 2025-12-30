package testNG;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=0) 
	 	void d() 
	 	{ 
	 	 	System.out.println("java"); 
	 	} 
	 	@Test(priority=1) 
	 	void b() 
	 	{ 
	 	 	System.out.println("selenium"); 
	 	} 
	 	@Test(priority=2) 
	 	void a() 
	 	{ 
	 	 	System.out.println("python"); 
	 	} 
	 	@Test(priority=3) 
	 	void c() 
	 	{ 
	 	 	System.out.println("testng"); 
	 	} 


}
