package com.pom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.*;


public class CalenderPage implements Auto_constant{
@FindBy(xpath="//td[@class=\"calAddButton\"]")
private WebElement addBtn;
@FindBy(id="addcall")
private WebElement callLink;
@FindBy(name="subject")
private WebElement Event_name;
@FindBy(name="visibility")
private WebElement CheckBox;
@FindBy(name="description")
private WebElement   Desc_box ;
@FindBy(name="location")
private WebElement Location_textbox;

@FindBy(id="eventstatus")
private WebElement Status_drpDwn;

@FindBy(name="assigntype")
private WebElement RadioBtn;

@FindBy(id="taskpriority")
private WebElement priority_dropDwn;
@FindBy(name="sendnotification")
private WebElement select_chkbx;


@FindBy(id="starthr")
private WebElement hour_Select;

@FindBy(id="startfmt")
private WebElement formt_Select;

@FindBy(id="startmin")
private WebElement min_Select;

@FindBy(id="jscal_trigger_date_start")
private WebElement cal_satar_icon;

@FindBy(xpath="(//tr[@class=\"daysrow\"]/td[text()=\"7\"])[1]")
private WebElement start_date;



@FindBy(id="endhr")
private WebElement end_hour_Select;

@FindBy(id="endfmt")
private WebElement end_formt_Select;

@FindBy(id="endmin")
private WebElement end_min_Select;

@FindBy(id="jscal_trigger_due_date")
private WebElement cal_end_icon;

@FindBy(xpath="(//tr[@class=\"headrow\"]/td[text()=\"�\"])[1]")
private WebElement month_click;


@FindBy(xpath="(//tr[@class=\"daysrow\"]/td[text()=\"14\"])[2]")
private WebElement end_date;




@FindBy(xpath="//td[@id=\"cellTabRelatedto\"]/a")
private WebElement Related_link;




@FindBy(id="parent_type")
private WebElement Related_To_dropdwn;



@FindBy(name="selectparent")
private WebElement select_btn;


@FindBy(xpath="//a[@id=\"2\"]")
private WebElement name;

@FindBy(xpath="(//input[@name=\"selectcnt\"])[1]")
private WebElement select_contact;

@FindBy(xpath="//a[@id=\"calendarCont25\"]")
private WebElement cont_Name;

@FindBy(id="all_contacts")
private WebElement Show_contactBtn;
@FindBy(name="eventsave")
private WebElement saveBtn;

public CalenderPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Add_click(WebDriver driver) throws IOException, InterruptedException
{
	Generic_Actionsclass ga=new Generic_Actionsclass();
	       ga.mouseHoverAction(driver, addBtn);
	          callLink.click();
             Event_name.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 3, 0));
          boolean flag=CheckBox.isSelected();
          if(flag)
          {
        	  System.out.println("selected");
          }
          else
          {
        	  CheckBox.click();
          }
        Desc_box.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 3, 1));
        Location_textbox.sendKeys(ExcelLib.readData(Excel_path, Sheet_Name, 3, 2));
        
        Generic_Dropdown_Selectclass gsc=new  Generic_Dropdown_Selectclass();
        gsc.selectValue(Status_drpDwn, "Held");
        RadioBtn.click();
       
        Generic_Dropdown_Selectclass gsc1=new  Generic_Dropdown_Selectclass();
        gsc1.selectValue(priority_dropDwn, "Medium");
         select_chkbx.click();
         Generic_Dropdown_Selectclass gsc2=new  Generic_Dropdown_Selectclass();
          gsc2.selectText(hour_Select,"10");
          
          Generic_Dropdown_Selectclass gsc3=new  Generic_Dropdown_Selectclass();
          gsc3.selectText(min_Select,"25");

          
          Generic_Dropdown_Selectclass gsc4=new  Generic_Dropdown_Selectclass();
          gsc4.selectText(formt_Select,"AM");
          cal_satar_icon.click();
          start_date.click();
          
          Generic_Dropdown_Selectclass gsc5=new  Generic_Dropdown_Selectclass();
          gsc5.selectText(end_hour_Select,"06");
          
          Generic_Dropdown_Selectclass gsc6=new  Generic_Dropdown_Selectclass();
          gsc6.selectText(end_min_Select,"40");
          
          Generic_Dropdown_Selectclass gsc7=new  Generic_Dropdown_Selectclass();
          gsc7.selectText(end_formt_Select,"AM");
          Thread.sleep(1000);
          cal_end_icon.click();
          
        	 // month_click.click();
         
          end_date.click();
          
       Related_link.click();
          
          
          
          Generic_Dropdown_Selectclass gsc8=new  Generic_Dropdown_Selectclass();
          gsc8.selectText(Related_To_dropdwn,"Opportunities");
          select_btn.click();
          
       Set<String>window=driver.getWindowHandles();
               int count=window.size();
               System.out.println(count);
       ArrayList <String>list=new ArrayList(window);
               driver.switchTo().window(list.get(1));
                  name.click();
                 
                  
                  driver.switchTo().window(list.get(0));
                  select_contact.click();
               
                 
                 Set<String> cont_list =driver.getWindowHandles(); 
                  ArrayList<String> list2=new ArrayList(cont_list);
                  driver.switchTo().window(list2.get(1));
                 Show_contactBtn.click();
                  cont_Name.click();
                 
                  driver.switchTo().window(list.get(0));
                  saveBtn.click();
          
          
          
}

}
