package testNG;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AddListeners extends SC implements ITestListener
{
	ExtentSparkReporter createReport; 
 	ExtentReports createTest; 
 	ExtentTest createLog; 	
	void report()
	{
		createReport=new ExtentSparkReporter("MyProjectReport.html");
		createTest=new ExtentReports();
		createTest.attachReporter(createReport); 
		// Set Environment
		createTest.setSystemInfo("OperatingSystem", "Windown");
		createTest.setSystemInfo("Browesr", "Chrome");
		createTest.setSystemInfo("BrowesrVersion", "181.91.22.01"); 
 	 	createTest.setSystemInfo("User Name", "Anup Singh"); 
 	 	// Set Configuration
 	 	createReport.config().setDocumentTitle("MyprojectReportInfo");
 	 	createReport.config().setReportName("Module--Reports");
 	 	createReport.config().setTheme(Theme.DARK); 
	}

	  public void onStart(ITestContext Result) 
 	{ 		
		  report();
 	}
 	  public void onTestSuccess	(ITestResult Result) 
 	{ 		
 		 createLog=createTest.createTest(Result.getName());
	 	 createLog.log(Status.PASS,MarkupHelper.createLabel("TestCase pass", ExtentColor.GREEN));
 	} 
 	  public void onTestFailure	(ITestResult Result) 
 	{ 		
 		 try {
 			screenshot();
 		 } catch (IOException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		 }
 		 String path="C:\\Users\\Anup Singh\\eclipse-workspace\\demoproject\\Screenshot\\Error.png";
 		 createLog=createTest.createTest(Result.getName()); 
	 	 createLog.log(Status.FAIL,MarkupHelper.createLabel("TestCase Failed", ExtentColor.RED));
	 	createLog.fail("failtestscreenshot:"+createLog.addScreenCaptureFromPath(path));
 	} 
 	  public void onTestSkipped(ITestResult Result) 
 	{
 		 createLog=createTest.createTest(Result.getName()); 
	 	 createLog.log(Status.SKIP,MarkupHelper.createLabel("TestCase Skipped", ExtentColor.YELLOW));
 	} 
 	  public void onFinish(ITestContext Result) 
  	{ 		
 		 createTest.flush();
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
