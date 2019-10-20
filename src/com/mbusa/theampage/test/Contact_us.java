package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Contact_us extends Launch{
	
	commonfunctions cf = new commonfunctions();
	
	
	
	
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "17";
      	driver.navigate().to("https://mercedes-benz.custhelp.com/");
      	Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 17", "Contact_us", "Execution Started");
		cf.isTextPresent(SessionID,object.Contact_US_Customer_Support_1, TestDatafile.Contact_US_Customer_Support_1);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_1, TestDatafile.Contact_US_FAQ_1_1);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_2, TestDatafile.Contact_US_FAQ_1_2);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_3, TestDatafile.Contact_US_FAQ_1_3);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_4, TestDatafile.Contact_US_FAQ_1_4);
		cf.isDisplay(SessionID,object.Contact_US_FAQ_1_5);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_6, TestDatafile.Contact_US_FAQ_1_6);
		cf.isButtonfound(SessionID,object.Contact_US_FAQ_1_7);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_8, TestDatafile.Contact_US_FAQ_1_8);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_9, TestDatafile.Contact_US_FAQ_1_9);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_10, TestDatafile.Contact_US_FAQ_1_10);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_11, TestDatafile.Contact_US_FAQ_1_11);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_17, TestDatafile.Contact_US_FAQ_1_12);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_13, TestDatafile.Contact_US_FAQ_1_13);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_14, TestDatafile.Contact_US_FAQ_1_14);
		//cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_15, TestDatafile.Contact_US_FAQ_1_15);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_16, TestDatafile.Contact_US_FAQ_1_16);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_12, TestDatafile.Contact_US_FAQ_1_17);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_18, TestDatafile.Contact_US_FAQ_1_18);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_19, TestDatafile.Contact_US_FAQ_1_19);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_20, TestDatafile.Contact_US_FAQ_1_20);
		cf.isTextPresent(SessionID,object.Contact_US_FAQ_1_15, TestDatafile.Contact_US_FAQ_1_21);
		cf.Clickandwait(object.Contact_US_FAD_1_1, object.Contact_US_FAD_1_3);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_1, TestDatafile.Contact_US_FAD_1_1);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_2, TestDatafile.Contact_US_FAD_1_2);
		cf.isDisplay(SessionID,object.Contact_US_FAD_1_3);
		cf.isButtonfound(SessionID,object.Contact_US_FAD_1_4);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_5, TestDatafile.Contact_US_FAD_1_5);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_6, TestDatafile.Contact_US_FAD_1_6);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_7, TestDatafile.Contact_US_FAD_1_7);
		cf.isTextPresent(SessionID,object.Contact_US_FAD_1_8, TestDatafile.Contact_US_FAD_1_8);
		cf.Clickandwait(object.Contact_US_Call_1_1, object.Contact_US_Call_1_4);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_1, TestDatafile.Contact_US_Call_1_1);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_2, TestDatafile.Contact_US_Call_1_2);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_3, TestDatafile.Contact_US_Call_1_3);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_4, TestDatafile.Contact_US_Call_1_4);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_5, TestDatafile.Contact_US_Call_1_5);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_6, TestDatafile.Contact_US_Call_1_6);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_7, TestDatafile.Contact_US_Call_1_7);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_8, TestDatafile.Contact_US_Call_1_8);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_9, TestDatafile.Contact_US_Call_1_9);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_10, TestDatafile.Contact_US_Call_1_10);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_11, TestDatafile.Contact_US_Call_1_11);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_12, TestDatafile.Contact_US_Call_1_12);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_13, TestDatafile.Contact_US_Call_1_13);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_14, TestDatafile.Contact_US_Call_1_14);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_15, TestDatafile.Contact_US_Call_1_15);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_16, TestDatafile.Contact_US_Call_1_16);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_17, TestDatafile.Contact_US_Call_1_17);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_18, TestDatafile.Contact_US_Call_1_18);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_19, TestDatafile.Contact_US_Call_1_19);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_20, TestDatafile.Contact_US_Call_1_20);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_21, TestDatafile.Contact_US_Call_1_21);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_22, TestDatafile.Contact_US_Call_1_22);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_23, TestDatafile.Contact_US_Call_1_23);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_24, TestDatafile.Contact_US_Call_1_24);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_25, TestDatafile.Contact_US_Call_1_25);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_26, TestDatafile.Contact_US_Call_1_26);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_27, TestDatafile.Contact_US_Call_1_27);
		cf.isTextPresent(SessionID,object.Contact_US_Call_1_24, TestDatafile.Contact_US_Call_1_24);
		
		
		
	}
	
}