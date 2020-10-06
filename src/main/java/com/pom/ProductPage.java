package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.generic.*;

public class ProductPage implements Auto_constant {
@FindBy(xpath="//img[@title=\"Create Product...\"]")
private WebElement Product_Add_icon;

@FindBy(name="productname")
private WebElement proNameTextBox;

@FindBy(xpath="(//input[@type=\"submit\"])[1]")
private WebElement saveButton;

@FindBy(xpath="(//input[@type=\"button\"])[1]")
private WebElement cancelButton;

@FindBy(name="search_text")
private WebElement serchBoxText;

@FindBy(id="bas_searchfield")
private WebElement dropDown;
@FindBy(name="submit")
private WebElement SearchNowBtn;

public	ProductPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void product_Add_perform()
{
	Product_Add_icon.click();
}
public void product_information() throws IOException
{
	proNameTextBox.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name,1, 0));
	saveButton.click();
}

public void search_product() throws IOException
{          serchBoxText.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 2, 0));
	Generic_Dropdown_Selectclass gds=new Generic_Dropdown_Selectclass();
	            gds.selectValue(dropDown, "productname");
	     
     /* Select sel=new Select(dropDown);
       sel.selectByValue("productname");
       SearchNowBtn.click();*/
}



























}
