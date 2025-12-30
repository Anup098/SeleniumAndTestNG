package testNG;

import org.testng.annotations.Test;

public class disable {
	
	@Test 
 	void java() 
 	{ 
 	 	System.out.println("java"); 
 	} 
 	@Test 
 	void selenium() 
 	{ 
 	 	System.out.println("selenium"); 
 	} 
// 	for normal disable
 	@Test(enabled = false)
 	void python() 
 	{ 
 	 	System.out.println("python"); 
 	} 
 	@Test 
 	void testng() 
 	{ 
 	 	System.out.println("testng"); 
 	} 

}
//for skip or exclude the test case by testng.xml         [for this we can delete this (enabled = false) ]
//<suite name="Suite">
//<test thread-count="5" name="Test">
//<classes>
//  <class name="testNG.disable">
//  <methods>
//  <exclude name="python"></exclude>
//  </methods>
//  </class>
//</classes>
//</test> <!-- Test -->
//</suite> <!-- Suite -->

//for only include the test case use [<include name="python"></inclue>] [for this we can delete this (enabled = false) ]

//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="testNG.disable">
//      <methods>
//     <include name="python"></include>
//      </methods>
//      </class>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

//for starting vale of test case is like (logout,loegin) use like [log.*] or regular expression.

//		<?xml version="1.0" encoding="UTF-8"?>
//		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//		<suite name="Suite">
//		  <test thread-count="5" name="Test">
//		    <classes>
//		      <class name="testNG.disable">
//		      <methods>
//		     <include name="log.*"></include>
//		      </methods>
//		      </class>
//		    </classes>
//		  </test> <!-- Test -->
//		</suite> <!-- Suite -->








