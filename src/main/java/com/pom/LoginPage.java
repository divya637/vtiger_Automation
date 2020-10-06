package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.*;

public class LoginPage implements Auto_constant 
{
@FindBy(name="user_name")
private WebElement userNameTextBox;

@FindBy(name="user_password")
private WebElement userPasswordBox;

@FindBy(id="submitButton")
private WebElement submitButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void perform_login() throws Exception
{
	/*userNameTextBox.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 0, 0));
	userPasswordBox.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 0, 1));
	submitButton.click();*/
	
	//Properties File data 
	userNameTextBox.sendKeys(PropertiesLib.test1(Properties_path,"username"));
	userPasswordBox.sendKeys(PropertiesLib.test1(Properties_path,"password"));
	
	
	//ExcelLib.writeData(Excel_path, write_sheet_name, " username:admin", 0, 0);
	
	//ExcelLib.writeData(Excel_path, write_sheet_name, " password:manager", 1, 0);
	submitButton.click();
	
}
}