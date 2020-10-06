package com.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;

import com.generic.BaseTest;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.ProductPage;

public class ProSeaTest extends BaseTest{

public void product_search() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.perform_login();
		
		HomePage hp=new HomePage(driver);
		hp.product_create_perform();
		
		ProductPage pp=new ProductPage(driver);
	     pp.search_product();
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(act_title, exp_title);
		Reporter.log("  Search Displayes Successfully",true);
}}
