package com.mbusa.theampage.test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Golf extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "7";
	
	@Test
	public void GolfsTheam() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		
		
		System.out.println(" Execution Started");
		
		Reporter.GeneralUpdate("Scenario 7", "Golf", "Execution Started");
		driver.navigate().to("https://www.mbusa.com/mercedes/events/golf");
		Thread.sleep(500);		
		
		cf.isTextPresent(SessionID,object.EDP_topCTA, TestDatafile.Golf_topCTA_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading1_EDP, TestDatafile.Golf_Heading1_Golf_Data);
		cf.isTextPresent(SessionID,object.EDP_SubHeading, TestDatafile.Golf_SubHeading_Data);
		cf.isTextPresent(SessionID,object.EDP_Content, TestDatafile.Golf_Content_Data);
		cf.isTextPresent(SessionID,object.Golf_subtout, TestDatafile.Golf_subtout_Data);
		cf.highLightweb(object.EDP_Highlight1);
		cf.CheckWebImage(SessionID,object.EDP_herojpg,TestDatafile.Golf_subtout_img);
		cf.imagevalidation(SessionID,object.EDP_herojpg);
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer1, TestDatafile.Golf_modulenavclearer1_Data);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer2, TestDatafile.Golf_modulenavclearer2_Data);
		cf.isTextPresent(SessionID,object.EDP_modulenavclearer3, TestDatafile.Golf_modulenavclearer3_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading2_whtinclude, TestDatafile.Golf_Heading2_OfficialPatron_Data);
		cf.isTextPresent(SessionID,object.EDP_Heading3_LLCoffers, TestDatafile.Golf_SubHeading_OfficialPatron_Data);
		cf.isTextPresent(SessionID,object.EDP_WhatIncludedContent, TestDatafile.Golf_OfficialPatronContent_Data);
		cf.scrolldown(driver, object.Golf_Highlight);
		Thread.sleep(500);
		cf.highLightweb(object.Golf_Highlight);
		cf.CheckWebImage(SessionID,object.Golf_PGAimage,TestDatafile.Golf_PGAimage);
		cf.imagevalidation(SessionID,object.Golf_PGAimage);
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.Golf_PGAheading, TestDatafile.Golf_PGAheading_Data);
		cf.isTextPresent(SessionID,object.Golf_PGAAdress, TestDatafile.Golf_PGAAdress_Data);
		cf.isTextPresent(SessionID,object.Golf_PGAContent, TestDatafile.Golf_PGAContent_Data);
		cf.isTextPresent(SessionID,object.Golf_VOffcialS1, TestDatafile.Golf_VOffcialS1_Data);
		cf.CheckWebImage(SessionID,object.Golf__KitchenAidimage,TestDatafile.Golf__KitchenAidimage);
		cf.imagevalidation(SessionID,object.Golf__KitchenAidimage);
		cf.isTextPresent(SessionID,object.Golf_KitchenAid, TestDatafile.Golf_KitchenAid_Data);
		cf.isTextPresent(SessionID,object.Golf_KitchenAidAddress, TestDatafile.Golf_KitchenAidAddress_Data);
		cf.isTextPresent(SessionID,object.Golf_KitchenAidContent, TestDatafile.Golf_KitchenAidContent_Data);
		cf.isTextPresent(SessionID,object.Golf_VOffcialS2, TestDatafile.Golf_VOffcialS2_Data);
		cf.isTextPresent(SessionID,object.EDP_WhatsIncludeBacktoToplink, TestDatafile.Golf_MBChampbacktop_data);
		cf.scrolldown(driver, object.Golf_MBDlrChampionshipsimg);
		Thread.sleep(500);
		cf.isTextPresent(SessionID,object.EDP_Heading4_DropOff, TestDatafile.Golf_MBDlrChampionships_data);
		cf.isTextPresent(SessionID,object.Golf_MBDlrChampionshipssub, TestDatafile.Golf_MBDlrChampionships_subData);
		for (int i = 0 ; i <=2; i++) {
			System.out.println(" Print i:: I " + i);
			WebElement Golf_MBDlrChampContntlist = driver.findElement(By.xpath("//div[@id='module-2']/div/div/p["+(i+2)+"]"));
			cf.isTextPresent(SessionID,Golf_MBDlrChampContntlist, TestDatafile.Golf_MBDlrChampContntlist_Data[i]);
		}
		cf.CheckWebImage(SessionID,object.Golf_MBDlrChampionshipsimg,TestDatafile.Golf_MBDlrChampionshipsimg);
		cf.imagevalidation(SessionID,object.Golf_MBDlrChampionshipsimg);
		//cf.getscreenshot(SessionID);
		cf.highLightweb(object.Golf_Highlight1);
		cf.scrolldown(driver, object.Golf_MBGBrdAmmdrimg);
		Thread.sleep(500);
		cf.isTextPresent(SessionID,object.Golf_MBDlrbacktop, TestDatafile.Golf_MBDlrbacktop_data);
		cf.isTextPresent(SessionID,object.Golf_MBGBrdAmmdr, TestDatafile.Golf_MBGBrdAmmdr_Data);
		cf.isTextPresent(SessionID,object.Golf_MBGBrdAmmdrsub, TestDatafile.Golf_MBGBrdAmmdrsub_Data);
		cf.isTextPresent(SessionID,object.Golf_MBGBrdAmmdrconthead, TestDatafile.Golf_MBGBrdAmmdrconthead_Data);
		cf.isTextPresent(SessionID,object.Golf_MBGBrdAmmdrcontent, TestDatafile.Golf_MBGBrdAmmdrcontent_Data);
		cf.CheckWebImage(SessionID,object.Golf_MBGBrdAmmdrimg,TestDatafile.Golf_MBGBrdAmmdrimg);
		cf.imagevalidation(SessionID,object.Golf_MBGBrdAmmdrimg);
		object.Golf_ShowAll.click();
		Thread.sleep(500);
		List<WebElement> value = driver.findElements(By.xpath("//div[@class='theme-gallery gallery-accordion uxp2-gallery-container clearer']//li"));
		System.out.println(" Print value Size::  " + value);
		for (int i = 1 ; i <=value.size(); i++) {
			System.out.println(" Print value Size::  " + i);
			WebElement Golf_Galleryimgs = driver.findElement(By.xpath("//div[@class='theme-gallery gallery-accordion uxp2-gallery-container clearer']/ul/li["+(i)+"]"));
			cf.imagevalidation(SessionID,Golf_Galleryimgs);
		}
		object.Golf_closeAll.click();
		Thread.sleep(500);
		//cf.getscreenshot(SessionID);
		Reporter.GeneralUpdate("Scenario 7 ", "Mobile Application - Execution Ended ", "");
		System.out.println(" Execution End");
		
	}
}
