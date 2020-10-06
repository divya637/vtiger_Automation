package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrobleTicketsPage {
@FindBy(xpath="//td[@colspan=\"7\"]/table/tbody/tr/td")
private List<WebElement> table_element;

@FindBy(xpath="//div/table[@class=\"lvt small\"]//tr")
private  List<WebElement> inner_table_element;

@FindBy(xpath="//div/table[@class=\"lvt small\"]//tr/td")
private List<WebElement> Inner_table_data;
public TrobleTicketsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
  public void perform()
  {
	  int count=table_element.size();
	  System.out.println(count);
	  for(int i=0;i<count;i++)
	  {
		  WebElement ele=table_element.get(i);
		               ele.click();
		        int count1=inner_table_element.size(); 
		        System.out.println(count1);
		         for(int j=0;j<count1;j++)
		               {    
		            	   String text=inner_table_element.get(j).getText();
		            	   System.out.println(text+""+ j);
		               }
		            	  /* int count2=Inner_table_data.size();
		            	   for(int k=1;k<=count2;k++)
		            	   {
		            		  String value= Inner_table_data.get(k).getText();
		            		  System.out.println(value+""+k );
		            	   }*/
		            	   
		               
	  }
  }
}





