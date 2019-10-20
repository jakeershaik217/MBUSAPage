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

public class Compare_Models extends Launch  {
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void FAQ() throws Exception
	{
		
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
String SessionID = "21";
		
		
		driver.navigate().to("https://www.mbusa.com/mercedes/vehicles/compare");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 21", "Compare Models", "Execution Started");
		
			
	    		WebDriverWait wait = new WebDriverWait(driver, 100);

	    		cf.isTextPresent(SessionID, object.Compare_Model, TestDatafile.Compare_Model);
	    		cf.isTextPresent(SessionID, object.Compare_Model_Para, TestDatafile.Compare_Model_para);
	    		cf.Linknavigation(SessionID, object.Compare_Model_Para_link, TestDatafile.Compare_Model_Para_link);
				
								
				
cf.highLightweb(object.Compare_Model_year);
Select sel1 = new Select(object.Compare_Model_year);
List<WebElement> top = sel1.getOptions();
			
for(int i=1;i<top.size();i++){//Years loop
						
						
		sel1.selectByIndex(i);
		
		Thread.sleep(1000);
		cf.highLightweb(object.Compare_Model_maker);
		wait.until(ExpectedConditions.visibilityOf(object.Compare_Model_maker));
		
		Select sel2 = new Select(object.Compare_Model_maker);
		
		List<WebElement> down_1 = sel2.getOptions();
					
						
		   for(int j=1;j<down_1.size();j++){//Car Makers loop
							
			
			sel2.selectByIndex(j);
			
			Thread.sleep(1000);
			cf.highLightweb(object.Compare_Model_class);
			wait.until(ExpectedConditions.visibilityOf(object.Compare_Model_class));
			Select sel3 = new Select(object.Compare_Model_class);
			List<WebElement> down_2 = sel3.getOptions();
			
			       for(int k=1;k<down_2.size();k++){//Class loop
				  
			    	   sel3.selectByIndex(k);
			    	  
			    	   Thread.sleep(2000);
			    	   cf.highLightweb(object.Compare_Model_model);
			    	   wait.until(ExpectedConditions.visibilityOf(object.Compare_Model_model));
			    	  Select sel4 = new Select(object.Compare_Model_model);
						List<WebElement> down_3 = sel4.getOptions();
						
						 for(int l=1;l<down_3.size();l++){//Model loop
							 
							 sel1.selectByIndex(i);
							 sel2.selectByIndex(j);
							 sel3.selectByIndex(k);
							 sel4.selectByIndex(l);
							 Thread.sleep(2000);
							 wait.until(ExpectedConditions.visibilityOf(object.Compare_Model_image));
														 	
							 
							 	if(object.Compare_Model_title.getText().contains("2017")){
							 cf.CheckWebImage(SessionID, object.Compare_Model_image, TestDatafile. Model_Image_2017[k][l]);
							 cf.imagevalidation(SessionID, object.Compare_Model_image);
							 cf.isTextPresent(SessionID, object.Compare_Model_title, TestDatafile. Model_Title_2017[k][l]);
							 cf.isTextPresent(SessionID, object.Compare_Model_view_inventory, TestDatafile.Compare_Model_view_inventory);
							 cf.isTextPresent(SessionID, object.Compare_Model_change_button, TestDatafile.Compare_Model_change_button);
							 cf.isTextPresent(SessionID, object.Compare_Model_change_price, TestDatafile.Model_price_2017[k][l]);
							 	}
							 	else if(object.Compare_Model_title.getText().contains("2018")){
							 cf.CheckWebImage(SessionID, object.Compare_Model_image, TestDatafile. Model_Image_2018[k][l]);
							 cf.imagevalidation(SessionID, object.Compare_Model_image);
							 cf. isTextPresent(SessionID, object.Compare_Model_title, TestDatafile. Model_Title_2018[k][l]);
							 cf.isTextPresent(SessionID, object.Compare_Model_view_inventory, TestDatafile.Compare_Model_view_inventory);
							 cf.isTextPresent(SessionID, object.Compare_Model_change_button, TestDatafile.Compare_Model_change_button);
							 cf.isTextPresent(SessionID, object.Compare_Model_change_price, TestDatafile.Model_price_2018[k][l]);
							 	}
							 
							Thread.sleep(2000);
							
							 cf.Click(object.Compare_Model_change_button);
						 }
				  
			         }
							
							}
						}

	
						
						
					}

					
					
		
	}
	
	
	


