package com.mbusa.theampage.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Maintenance_Manuals extends Launch  {
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void FAQ() throws Exception
	{
		
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
String SessionID = "3";
		
		
		driver.navigate().to("https://www.mbusa.com/mercedes/service_and_parts/maintenance_manuals");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("Scenario 3", "Maintenance_Manuals", "Execution Started");
		ArrayList a1 =  new ArrayList();
			Thread.sleep(2000);
	cf.isTextPresent(SessionID,object.MM_Heading, TestDatafile.MM_Heading);
		cf.isTextPresent(SessionID,object.MM_para, TestDatafile.MM_para);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		int cu=0,cn=0;
				
				cf.highLightweb(object.MM_dropdown_1);
				Select sel1 = new Select(object.MM_dropdown_1);
				List<WebElement> top = sel1.getOptions();
				
				
				
					for(int k=0;k<top.size();k++){
						
						
						sel1.selectByIndex(k);
						Thread.sleep(1000);
						cf.highLightweb(object.MM_dropdown_2);
						Select sel2 = new Select(object.MM_dropdown_2);
						List<WebElement> down = sel2.getOptions();
						for(int l=0;l<down.size();l++){
							if(k!=0 && l!=0){
							sel1.selectByIndex(k);
							sel2.selectByIndex(l);
							wait.until(ExpectedConditions.textToBePresentInElement(object.MM_dropdown_heading, TestDatafile.Model_heading[k][l]));
							cf.isTextPresent(SessionID,object.MM_dropdown_heading, TestDatafile.Model_heading[k][l]);
							cf.isTextPresent(SessionID,object.MM_subheading, TestDatafile.Manual_heading[k][l]);
							cf.Linknavigation(SessionID,object.MM_PDF_link, TestDatafile.Manual_PDF_Link[k][l]);
							cf.Linkvalidation(SessionID,object.MM_PDF_link);
							cf.isButtonfound(SessionID,object.MM_Email_button);
						    cf.isTextPresent(SessionID,object.MM_downlaod_static_message, TestDatafile.MM_downlaod_static_message);
							
							}
						}
						
						
					}

					
				Thread.sleep(3000);
				cf.isTextPresent(SessionID,object.MM_Your_Preferred_Dealer, TestDatafile.MM_Your_Preferred_Dealer);
				try{
					
               if(object.MM_Change_dealer_button.isDisplayed()==true)	{
            	   
            	   cf.Clickandwait(object.MM_Change_dealer_button, object.MM_Dealer_Name);
            	   cf.Clickandwait(object.MM_Dealer_Name, object.MM_Zipcode_input);
            	   cf.Inputbox(object.MM_Zipcode_input, TestDatafile.MM_Zipcode_input);
            	   cf.Clickandwait(object.MM_Zipcode_find_Button, object.MM_Dealer_Name);
            	   cf.Clickandwait(object.MM_Dealer_Name, object.MM_Dealer_Name_after);
            	   //cf.Linknavigation(SessionID,object.MM_Dealer_Name_after, TestDatafile.MM_Dealer_Name_after);
            	   cf.Linkvalidation(SessionID,object.MM_Dealer_Name_after);
            	   cf.isTextPresent(SessionID,object.MM_Dealer_Name_address, TestDatafile.MM_Dealer_Name_address);
            	   cf.Linknavigation(SessionID,object.MM_Dealer_phonenumber, TestDatafile.MM_Dealer_phonenumber);
            	   //cf.Linkvalidation(SessionID,object.MM_Dealer_phonenumber);
            	   cf.Linknavigation(SessionID,object.MM_Dealer_scheduleaservice, TestDatafile.MM_Dealer_scheduleaservice);
            	   //cf.Linkvalidation(SessionID,object.MM_Dealer_scheduleaservice);
            	   cf.isenabled(SessionID,object.MM_Dealer_Map);
            	   cf.isTextPresent(SessionID,object.MM_Dealer_common_1, TestDatafile.MM_Dealer_common_1);
            	   cf.isTextPresent(SessionID,object.MM_Dealer_common_2, TestDatafile.MM_Dealer_common_2);
               }
				
              
				}catch(Exception e){
					
					 
		            	   
		            	   cf.Inputbox(object.MM_Zipcode_input, TestDatafile.MM_Zipcode_input);
		            	   cf.Clickandwait(object.MM_Zipcode_find_Button, object.MM_Dealer_Name);
		            	   cf.Clickandwait(object.MM_Dealer_Name, object.MM_Dealer_Name_after);
		            	   //cf.Linknavigation(SessionID,object.MM_Dealer_Name_after, TestDatafile.MM_Dealer_Name_after);
		            	   cf.Linkvalidation(SessionID,object.MM_Dealer_Name_after);
		            	   cf.isTextPresent(SessionID,object.MM_Dealer_Name_address, TestDatafile.MM_Dealer_Name_address);
		            	   cf.Linknavigation(SessionID,object.MM_Dealer_phonenumber, TestDatafile.MM_Dealer_phonenumber);
		            	   //cf.Linkvalidation(SessionID,object.MM_Dealer_phonenumber);
		            	   cf.Linknavigation(SessionID,object.MM_Dealer_scheduleaservice, TestDatafile.MM_Dealer_scheduleaservice);
		            	   //cf.Linkvalidation(SessionID,object.MM_Dealer_scheduleaservice);
		            	   cf.isenabled(SessionID,object.MM_Dealer_Map);
		            	   cf.isTextPresent(SessionID,object.MM_Dealer_common_1, TestDatafile.MM_Dealer_common_1);
		            	   cf.isTextPresent(SessionID,object.MM_Dealer_common_2, TestDatafile.MM_Dealer_common_2);
		            	   
		             
				}
               
		
		
		
		
	}
	
	
	

}
