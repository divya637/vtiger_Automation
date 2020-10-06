package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Dropdown_Selectclass {
public void selectIndex(WebElement ele,int i)
{
	Select s=new Select(ele);
	s.selectByIndex(i);
}

public void selectText(WebElement ele,String text)
{
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}



public void selectValue(WebElement ele,String value)
{
	Select s=new Select(ele);
	s.selectByValue(value);
}
}
