package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.*;

public class HomePage implements Auto_constant {
	
	@FindBy(linkText="Products")
	private WebElement Product_icon;
	
	@FindBy(linkText="Calendar")
	private WebElement Calender_icon;
	
	@FindBy(linkText="Leads")
	private WebElement Lead_icon;
	
	@FindBy(linkText="Organizations")
	private WebElement Organization_icon;
	
	
	
	@FindBy(linkText="Opportunities")
	private WebElement Opportunities_icon;
	
	
	@FindBy(linkText="Documents")
	private WebElement Documents_icon;
	
	
	@FindBy(linkText="Email")
	private WebElement Email_icon;
	
	
	@FindBy(linkText="Trouble Tickets")
	private WebElement TroubleTickets_icon;
	
	@FindBy(linkText="Dashboard")
	private WebElement Dashboard_icon;

	public	HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void product_create_perform()
{
	Product_icon.click();
}
public void Calender_create_perform()
{
	Calender_icon.click();
}
public void Lead_create_perform()
{
	Lead_icon.click();
}
public void Oppor_create_perform()
{
	Opportunities_icon.click();
}
public void Organization_create_perform()
{
	Organization_icon.click();
}

public void TrobleTicket_create_perform()
{
	TroubleTickets_icon.click();

}

}

