package com.script;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.TrobleTicketsPage;

public class TicketTroubleTest extends BaseTest {
@Test
public void TT_perform() throws Exception
{
	LoginPage lp=new LoginPage(driver);
	lp.perform_login();
	
	HomePage hp=new HomePage(driver);
	        hp.TrobleTicket_create_perform();
	        
	        
	        TrobleTicketsPage ttp=new TrobleTicketsPage(driver);
	        ttp.perform();
	        
}
}
