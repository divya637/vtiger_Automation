package com.script;

import java.io.IOException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pom.CalenderPage;
import com.pom.HomePage;
import com.pom.LoginPage;

public class CalenderTest extends BaseTest {
	@Test
	public void perform_calender() throws Exception
	{
		  /*Layout layout=new PatternLayout("%d%c%m%n");
			Appender appender=new FileAppender(layout,"./reports/calender.log");
			BasicConfigurator.configure(appender);
			Logger log=Logger.getLogger(this.getClass().getName());
		              log.info("sucess");*/
		
		LoginPage lp=new LoginPage(driver);
		lp.perform_login();
		
		HomePage hp=new HomePage(driver);
		   hp.Calender_create_perform();
		// log.info("calander call");
		   
		   
		   CalenderPage cp= new CalenderPage(driver);
		    cp.Add_click(driver);
		    String actual=driver.getTitle();
		    System.out.println(actual);
		    //String expected="Administrator - Calendar - vtiger CRM 5 - Commercial Open Source CRM";
		    //Assert.assertEquals(actual, expected);
		     
		 //  log.info("add event successful");
		   Reporter.log("successfull");
		   
	}

}
