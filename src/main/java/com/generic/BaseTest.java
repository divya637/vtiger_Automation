package com.generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class BaseTest implements Auto_constant
{
	public ExtentReports  reports;
	public ExtentTest test;
     public	Logger log;   public  Appender appender;
	public static WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	public void appOpen(String browsername) throws Exception
	
	{   		//use for log 4j implementation
		 Layout layout=new PatternLayout("%d%c%m%n");
		  appender=new FileAppender(layout,"./reports/log4j.log");
		 	log=Logger.getLogger(this.getClass().getName());
		 	 BasicConfigurator.configure();   
		  
		//ExtentReport Object Creation 
		reports=new ExtentReports("./reports/screenshot.html",false);
	       test=reports.startTest("Regresson");

		      String url= PropertiesLib.test1("./propertyData/p.properties", "url");
		    
		      if(browsername.equalsIgnoreCase("chrome"))
		      {
	       System.setProperty(Chrome_key, Chrome_value);
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      
	      driver.get(url);
		      }
		      else if(browsername.equalsIgnoreCase("firefox"))
		      {
		    	  System.setProperty(Gecko_key, Gecko_value);
			      driver=new FirefoxDriver();
			      driver.manage().window().maximize();
			      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			      
			      driver.get(url);
		      }
		      
	  }
	@AfterMethod
	public void closeApp(ITestResult res) throws Exception
	{
		   String path=Generic_Screenshot.photo(driver,res);
		    int status =res.getStatus();
		    String tcname=res.getName();
		   
		    if(status==1)
		    {
		    	
		    	test.log(LogStatus.PASS,tcname+"tc is passed"+test.addScreenCapture(path));
		    	
		    }
		    if(status==2)
		    {
		    	
		    	test.log(LogStatus.FAIL,test.addScreenCapture(path));
		    	
		    }
	   reports.endTest(test);
	    reports.flush();
		driver.quit();
		
	
}
}