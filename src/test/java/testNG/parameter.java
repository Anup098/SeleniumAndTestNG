package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Parameters({"i","j"})
	@Test
	void x1(int a,int b) 
	{
		System.out.println(a+b);
	}
	
}


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Suite">
//  <test thread-count="5" name="parameter">
//  <classes>
//  <class name="testNG.parameter"></class>
//  </classes>
//  <parameter name="i" value="9999"></parameter>
//  <parameter name="j" value="999"></parameter>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->

