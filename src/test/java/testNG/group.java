package testNG;

import org.testng.annotations.Test;

public class group {
	
	@Test(groups = "positive")
	void a()
	{
		System.out.println("a");
	}
	@Test(groups = "negative")
	void b()
	{
		System.out.println("b");
	}
	@Test(groups = "positive")
	void c()
	{
		System.out.println("c");
	}
	@Test(groups = "negative")
	void d()
	{
		System.out.println("d");
	}

}

// run this on testng.xml
// 
// <?xml version="1.0" encoding="UTF-8"?>
// <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
// <suite name="demoproject">
// <groups>
// <run>
// <include name="positive"></include>
// </run>
// </groups>
//   <test thread-count="5" name="testNG">
//     <classes>
//       <class name="testNG.group"/>
//     </classes>
//   </test> <!-- Test -->
// </suite> <!-- Suite -->
