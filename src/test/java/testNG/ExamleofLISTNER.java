package testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testNG.AddListeners.class)
public class ExamleofLISTNER 
{
    @Test
	void pass()
	{
		System.out.println("PASS");
	}
	@Test
	void Skip()
	{
		throw new SkipException("Skipped");
	}
	@Test
	void fail()
	{
		Assert.assertTrue(false);
	}
}
//<suite name="Suite">
//<listeners>
//<listener class-name="testNG.AddListeners"></listener>
//</listeners>
//  <test thread-count="5" name="Test">
//    <classes>
//      <class name="testNG.SC"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
