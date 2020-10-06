package com.script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.Assert;
import org.testng.Reporter;


import com.generic.BaseTest;
import com.pom.LogOutPage;
import com.pom.LoginPage;
@Listeners(com.generic.Utility.class)
public class Login_LogoutTest extends BaseTest {
	@Test
	public void login() throws Exception
	{

		LoginPage lp=new LoginPage(driver);
		lp.perform_login();
		
		log.info("username completed");
		log.info("password completed");
		
		String actual_title=driver.getTitle();
		//String expected_title="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		//Assert.assertEquals(actual_title, expected_title);
		//Reporter.log("HomePage Displayes Successfully,Login perfotm",true);
	
	// logout Script
		
   LogOutPage lop= new LogOutPage(driver);
    lop.logout_Perform(driver);
	   log.info("logout");
	 String act_msg=driver.getTitle();
	String exp_msg="vtiger CRM 5 - Commercial Open Source CRM";
	Assert.assertEquals(act_msg, exp_msg);
	Reporter.log("Logout Susscessfull",true);

}

}
