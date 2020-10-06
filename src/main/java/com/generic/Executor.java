package com.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executor {
	public void scrolldown(WebDriver driver,WebElement ele)
	{    String jcode="argument[0].ScrollIntoview(true)";
	     String jcode2="argument[0].click()";
	     String jcode1="window.ScrollBy(0,document.body.scrollHeight)";
	    
		JavascriptExecutor je=(JavascriptExecutor)driver;
		                je.executeScript(jcode1);
		                
		                // je.executeScript(jcode2, ele);
		
		
	}

}
