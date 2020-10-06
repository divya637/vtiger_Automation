package com.script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.ProductPage;

public class ProductTest extends BaseTest{
	@Test
	public void product() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.perform_login();
		
		HomePage hp=new HomePage(driver);
		hp.product_create_perform();
		
		ProductPage pp=new ProductPage(driver);
	     pp.product_Add_perform();
		pp.product_information();
		
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(act_title, exp_title);
		Reporter.log(" Displayes Successfully",true);
		
	
		
		
		
		
	
}

}
