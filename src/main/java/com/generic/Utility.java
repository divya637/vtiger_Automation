package com.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Utility implements ITestListener
{
//@Override
	public void onTestFailure(ITestResult result) 
{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	       File dst=new File("./screenshot/screen.jpeg");
	       try {
			Files.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
	}

	
	

}
