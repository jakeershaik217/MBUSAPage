package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class EuropeanDeliveryProgram extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "6";
	
	
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("Scenario 1", "European Delivery Program", "Execution Started");
		driver.navigate().to("https://www.mbusa.com/mercedes/european_delivery_program");
		Thread.sleep(500);
		cf.isTextPresent(SessionID,object.EDP_topCTA, TestDatafile.EDP_topCTA_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading1_EDP, TestDatafile.EDP_Heading1_EDP_Data);
		cf.highLightweb(object.EDP_Highlight1);
		cf.isTextPresent(SessionID,object.EDP_SubHeading, TestDatafile.EDP_SubHeading_Data);
		cf.isTextPresent(SessionID,object.EDP_Content, TestDatafile.EDP_Content_Data);
		cf.isTextPresent(SessionID,object.EDP_lasttout, TestDatafile.EDP_lasttout_Data);
		cf.CheckWebImage(SessionID,object.EDP_herojpg,TestDatafile.EDP_EDP_herojpg_Data);
		cf.imagevalidation(SessionID,object.EDP_herojpg);
		cf.isTextPresent(SessionID,object.EDP_subtout, TestDatafile.EDP_subtout_Data);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer1, TestDatafile.EDP_modulenavclearer1_Data);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer2, TestDatafile.EDP_modulenavclearer2_Data);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer3, TestDatafile.EDP_modulenavclearer3_Data);
		cf.scrolldown(driver,object.EDP_Highlight2);
		Thread.sleep(500);
		cf.highLightweb(object.EDP_Highlight2);
		cf.isTextPresent(SessionID,object.EDP_Heading2_whtinclude, TestDatafile.EDP_Heading2_whtinclude_Data);
		cf.isTextPresent(SessionID,object.EDP_WhatIncludedContent, TestDatafile.EDP_WhatIncludedContent_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading3_LLCoffers, TestDatafile.EDP_Heading3_LLCoffers_Data);
		
		for (int i = 0 ; i <=14; i++) {
			System.out.println(" Print i:: I" + i);
			WebElement EDP_WhatIncludedPoints = driver.findElement(By.xpath("//div[@id='module-1']/div/div/ul/li["+(i+1)+"]"));
			cf.isTextPresent(SessionID,EDP_WhatIncludedPoints, TestDatafile.EDP_WhatIncludedPoints_Data[i]);
		}
		
		cf.scrolldown(driver,object.EDP_Highlight3);
		Thread.sleep(500);
		cf.highLightweb(object.EDP_Highlight3);
		cf.isTextPresent(SessionID,object.EDP_Heading4_DropOff, TestDatafile.EDP_Heading4_DropOff_Data);
		cf.isTextPresent(SessionID,object.EDP_DropOffPointsContent, TestDatafile.EDP_DropOffPointsContent_Data);
		cf.highLightweb(object.EDP_Highlight4);
		cf.CheckWebImage(SessionID,object.EDP_MercedesBenzdropoffmap,TestDatafile.EDP_MercedesBenzdropoffmap);
		cf.imagevalidation(SessionID,object.EDP_MercedesBenzdropoffmap);
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_Maptitle, TestDatafile.EDP_Maptitle_Data);
		Thread.sleep(500);
		
		WebElement map = driver.findElement(By.xpath("//div[@class='edp-map-title edp-map-tam']/h2/a")); 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", map);
		
	  	cf.CheckWebImage(SessionID,object.EDP_MercedesBenztripaccomap,TestDatafile.EDP_MercedesBenztripaccomap);
	  	cf.imagevalidation(SessionID,object.EDP_MercedesBenztripaccomap);
	  	//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_MapDom, TestDatafile.EDP_MapDom_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading5_OnceuBooked, TestDatafile.EDP_Heading5_OnceuBooked_Data);
		cf.isTextPresent(SessionID,object.EDP_SubHeading_OnceuBooked, TestDatafile.EDP_SubHeading_OnceuBooked_Data);
		cf.isTextPresent(SessionID,object.EDP_OnceuBooked_Content, TestDatafile.EDP_OnceuBooked_Content_Data);
		cf.highLightweb(object.EDP_Highlight5);
		cf.isTextPresent(SessionID,object.EDP_FAQ, TestDatafile.EDP_FAQ_Data);
		
		WebElement Expand = driver.findElement(By.xpath("//div[@class='accordion-expand']")); 
		executor.executeScript("arguments[0].click();", Expand);
		
		cf.isTextPresent(SessionID,object.EDP_PurchaseOptions, TestDatafile.EDP_PurchaseOptions_Data);
		for (int i = 0 ; i <=2; i++) {
			System.out.println(" Print i:: II " + i);
			
			WebElement EDP_PurchaseOptionsQ = driver.findElement(By.xpath("//div[@id='js-purchasing_options-"+(i+1)+"']/h4"));
			WebElement EDP_PurchaseOptionsA = driver.findElement(By.xpath("//div[@id='js-purchasing_options-"+(i+1)+"']/div[1]"));
			cf.isTextPresent(SessionID,EDP_PurchaseOptionsQ, TestDatafile.EDP_POQuestions_Data[i]);
			cf.isTextPresent(SessionID,EDP_PurchaseOptionsA, TestDatafile.EDP_POAnswers_Data[i]);
		}
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_Insurance, TestDatafile.EDP_Insurance_Data);
		for (int i = 0 ; i <=2; i++) {
			System.out.println(" Print i:: III " + i);
			
			WebElement EDP_InsuranceQ = driver.findElement(By.xpath("//div[@id='js-insurance-"+(i+1)+"']/h4"));
			WebElement EDP_InsuranceA = driver.findElement(By.xpath("//div[@id='js-insurance-"+(i+1)+"']/div[1]"));
			cf.isTextPresent(SessionID,EDP_InsuranceQ, TestDatafile.EDP_InsQuestions_Data[i]);
			cf.isTextPresent(SessionID,EDP_InsuranceA, TestDatafile.EDP_InsAnswers_Data[i]);
		}
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_TouringEuropa, TestDatafile.EDP_TouringEuropa_Data);
		for (int i = 0 ; i <=7; i++) {
			System.out.println(" Print i:: III " + i);
			
			WebElement EDP_TouringEuropaQ = driver.findElement(By.xpath("//div[@id='js-touring_europe-"+(i+1)+"']/h4"));
			WebElement EDP_TouringEuropaA = driver.findElement(By.xpath("//div[@id='js-touring_europe-"+(i+1)+"']/div[1]"));
			cf.isTextPresent(SessionID,EDP_TouringEuropaQ, TestDatafile.EDP_TEQuestions_Data[i]);
			cf.isTextPresent(SessionID,EDP_TouringEuropaA, TestDatafile.EDP_TEAnswers_Data[i]);
		}
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_DeliverytotheUS, TestDatafile.EDP_DeliverytotheUS_Data);
		for (int i = 0 ; i <=2; i++) {
			System.out.println(" Print i:: IV " + i);
			
			WebElement EDP_DeliverytotheUSQ = driver.findElement(By.xpath("//div[@id='js-delivery_to_the_us-"+(i+1)+"']/h4"));
			WebElement EDP_DeliverytotheUSA = driver.findElement(By.xpath("//div[@id='js-delivery_to_the_us-"+(i+1)+"']/div[1]"));
			cf.isTextPresent(SessionID,EDP_DeliverytotheUSQ, TestDatafile.EDP_DTUSQuestions_Data[i]);
			cf.isTextPresent(SessionID,EDP_DeliverytotheUSA, TestDatafile.EDP_DTUSAnswers_Data[i]);
		}
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_WhatsIncludeBacktoToplink, TestDatafile.EDP_WhatsIncludeBacktoToplink_Data);
		cf.isTextPresent(SessionID,object.EDP_TTTransitBacktoToplink, TestDatafile.EDP_TTTransitBacktoToplink_Data);
		cf.isTextPresent(SessionID,object.EDP_FQABactoTopklink, TestDatafile.EDP_FQABacktoToplink_Data);
		cf.isTextPresent(SessionID,object.EDP_Learnmoreaturdealer, TestDatafile.EDP_Learnmoreaturdealer_Data);
		cf.isTextPresent(SessionID,object.EDP_LMatUrDealersubheading, TestDatafile.EDP_LMatUrDealersubheading_Data);
		cf.isTextPresent(SessionID,object.EDP_LMSecondHeading_EDP, TestDatafile.EDP_LMSecondHeading_EDP_Data);
		cf.scrolldown(driver,object.EDP_Highlight7);
		Thread.sleep(500);
		cf.highLightweb(object.EDP_Highlight7);
		cf.isTextPresent(SessionID,object.EDP_YorLocalDealer, TestDatafile.EDP_YorLocalDealer_Data);
		cf.isTextPresent(SessionID,object.EDP_YorLocalDealerinfo, TestDatafile.EDP_YorLocalDealerinfo_Data);
		cf.isTextPresent(SessionID,object.EDP_YorLocalDealerZip, TestDatafile.EDP_YorLocalDealerZip_Data);
		cf.isButtonfound(SessionID,object.EDP_YorLocalDealerZipbtn);
		//cf.getscreenshot(SessionID);
		Reporter.GeneralUpdate("Scenario 6", "European Delivery Program", "Execution End");
		System.out.println(" Execution End");
		
		
	}
}
