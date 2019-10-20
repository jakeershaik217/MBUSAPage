package com.mbusa.theampage.test;

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



public class MobileApplication extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "2";
	
	@Test
	public void Mobileapps() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		
		
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 2", "MobileApplication - Execution Started ", "");
		
		driver.navigate().to("https://www.mbusa.com/mercedes/mobile/applications");
		Thread.sleep(500);
		
		cf.isTextPresent(SessionID,object.Mob_Heading, TestDatafile.Mob_Heading_Data);
		cf.isTextPresent(SessionID,object.Mob_SubHeading, TestDatafile.Mob_SubHeading_Data);
		for (int i = 0 ; i <=2; i++) 
		{
			WebElement Mob_Menus = driver.findElement(By.xpath("//div[@class='type-filter rounded-rect filter']/div["+(i+1)+"]"));
			cf.isTextPresent(SessionID,Mob_Menus, TestDatafile.Mob_Menus_Data[i]);
			
		}
		cf.isTextPresent(SessionID,object.Mob_Heading, TestDatafile.Mob_Heading_Data);
		cf.isTextPresent(SessionID,object.Mob_Mercedesmetitle, TestDatafile.Mob_Mercedesmetitle_Data);
		cf.isTextPresent(SessionID,object.Mob_ApplicationDescription, TestDatafile.Mob_ApplicationDescription_Data);
		cf.isTextPresent(SessionID,object.Mob_Download, TestDatafile.Mob_Download_Data);
		cf.isTextPresent(SessionID,object.Mob_IOSAND, TestDatafile.Mob_IOSAND_Data);
		cf.isTextPresent(SessionID,object.Mob_MYMBFStitle, TestDatafile.Mob_MYMBFStitle_Data);
		cf.isTextPresent(SessionID,object.Mob_MYMBFSDEscription, TestDatafile.Mob_MYMBFSDEscription);
		cf.isTextPresent(SessionID,object.Mob_MyMBFSDownload, TestDatafile.Mob_MyMBFSDownload);
		cf.isTextPresent(SessionID,object.Mob_MyMBFSIOSAND, TestDatafile.Mob_MyMBFSIOSAND);
		
		Reporter.GeneralUpdate("Scenario 2 ", "Mobile Application - Execution Ended ", "");
		System.out.println(" Execution End");
		//cf.getscreenshot(SessionID);
	}
}
