package com.generic;

import org.openqa.selenium.WebElement;

import com.graphbuilder.curve.Point;

public class Generic_WebElement {
	public String text(WebElement ele)
	{
		String text=ele.getText();
		System.out.println(text);
		return text;
	}
	public Point location(WebElement ele)
	{
		Point loc=(Point) ele.getLocation();
		System.out.println(loc);
		return loc;
	}
	
	public String attribute(WebElement ele,String attribute)
	{
	  String attr = ele.getAttribute(attribute);
		System.out.println(attr);
		return attribute;
	}
	
	
	
	
	
	
}
