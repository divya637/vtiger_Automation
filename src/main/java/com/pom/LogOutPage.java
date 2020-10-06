package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.*;

public class LogOutPage {
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement Administrator;

	@FindBy(xpath="//a[.=\"Sign Out\"]")
	private WebElement signOutButton;
	
	public LogOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout_Perform(WebDriver driver)
	{
       Generic_Actionsclass ga=new Generic_Actionsclass();
           ga.mouseHoverAction(driver, Administrator);
		    signOutButton.click();
	}

}
