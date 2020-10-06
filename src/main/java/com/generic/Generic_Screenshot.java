package com.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Generic_Screenshot {
	public static String photo(WebDriver driver,ITestResult res)throws Exception

	{
		String photo="./screenshot/";
		
		Date d= new Date();
		
		String d1=d.toString();
		
		String date=d1.replace(":", "-");
		String tcname=res.getTestName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+tcname+".jpeg");
		String path=dst.getAbsolutePath();//path=exact location
		try
		{
		Files.copy(src,dst);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return path;
		
		
	}
	}


