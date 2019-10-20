package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Environment extends Launch{
	
	commonfunctions cf = new commonfunctions();
		
	@Test
	public void Environment() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "16";
      	driver.navigate().to("https://www.mbusa.com/mercedes/benz/green");
      	Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 16", "Environment", "Execution Started");
		cf.isTextPresent(SessionID,object.EM_topCTA, TestDatafile.EM_topCTA_Data);
		cf.highLightweb(object.EM_Ener_Mob_Highlight);
		cf.isTextPresent(SessionID,object.EM_Heading_Ener_Mob, TestDatafile.EM_Heading_Ener_Mob_Data);		
		cf.isTextPresent(SessionID,object.EM_SubHeading_Ener_Mob, TestDatafile.EM_SubHeading_Ener_Mob_Data);
		cf.isTextPresent(SessionID,object.EM_Ener_Mob_Content, TestDatafile.EM_Ener_Mob_Content_Data);
		cf.CheckWebImage(SessionID,object.EM_Ener_Mob_Img, TestDatafile.EM_Ener_Mob_Img_Data);
		cf.isTextPresent(SessionID,object.EM_Ener_Mob_Discover, TestDatafile.EM_Ener_Mob_Discover_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Int, TestDatafile.EM_Elec_Int_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Veh, TestDatafile.EM_Elec_Veh_Data);
		cf.isTextPresent(SessionID,object.EM_HYB_Dri, TestDatafile.EM_HYB_Dri_Data);
		cf.isTextPresent(SessionID,object.EM_A_Leg, TestDatafile.EM_A_Leg_Data);
		cf.isTextPresent(SessionID,object.EM_Flex_Fuel, TestDatafile.EM_Flex_Fuel_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Veh_FAQ, TestDatafile.EM_Elec_Veh_FAQ_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Veh_FAQ_Text, TestDatafile.EM_Elec_Veh_FAQ_Text_Data);
		cf.isTextPresent(SessionID,object.EM_View_FAQ, TestDatafile.EM_View_FAQ_Data);
		cf.isTextPresent(SessionID,object.EM_Heading_Elec_Int, TestDatafile.EM_Heading_Elec_Int_Data);
		cf.isTextPresent(SessionID,object.EM_SubHeading_Elec_Int, TestDatafile.EM_SubHeading_Elec_Int_Int_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Int_Text, TestDatafile.EM_Elec_Int_Text_Data);	
		cf.CheckWebImage(SessionID,object.EM_Elec_Int_Img, TestDatafile.EM_Elec_Int_Img_Data);
		cf.isTextPresent(SessionID,object.EM_Heading_Plug_Hyb, TestDatafile.EM_Heading_Plug_Hyb_Data);	
		cf.isTextPresent(SessionID,object.EM_SubHeading_Plug_Hyb, TestDatafile.EM_SubHeading_Plug_Hyb_Data);
		cf.isTextPresent(SessionID,object.EM_Plug_Hyb_Text, TestDatafile.EM_Plug_Hyb_Text_Data);	
		cf.CheckWebImage(SessionID,object.EM_Plug_Hyb_Img, TestDatafile.EM_Plug_Hyb_Img_Data);		
		cf.isTextPresent(SessionID,object.EM_Avlb, TestDatafile.EM_Avlb_Data);
		cf.isTextPresent(SessionID,object.EM_Avlb_C, TestDatafile.EM_Avlb_C_Data);
		cf.CheckWebImage(SessionID,object.EM_Avlb_C350e_Img, TestDatafile.EM_Avlb_C350e_Img_Data);
		for(int i=0;i<=1;i++){
			cf.mouseover(driver.findElement(By.xpath("//div[@id='module-2']/div/div/div/ul/li["+(i+1)+"]/a")),driver.findElement(By.xpath("//div[@id='module-2']/div/div/div/ul/li["+(i+1)+"]/div/a/img")));
			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='module-2']/div/div/div/ul/li["+(i+1)+"]/div/a/img")), TestDatafile.Plug_Hyb_C_GLE_Img[i]);
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-2']/div/div/div/ul/li["+(i+1)+"]/div/div")),TestDatafile.EM_Avlb_C350E_NameandPrice_Data[i]);
			
		}
		
	//Flexible Fuel Vehicles
		cf.isTextPresent(SessionID,object.EM_Heading_Flex_Veh, TestDatafile.EM_Heading_Flex_Veh_Data);		
		cf.highLightweb(object.EM_Flex_Veh_Highlight);
		cf.isTextPresent(SessionID,object.EM_SubHeading_Flex_Veh, TestDatafile.EM_SubHeading_Flex_Veh_Data);
		cf.isTextPresent(SessionID,object.EM_Flex_Veh_Text, TestDatafile.EM_Flex_Veh_Text_Data);
		
		for(int i=0;i<=2;i++){
		cf.mouseover(driver.findElement(By.xpath("//div[@id='module-3']/div/div/div/ul/li["+(i+1)+"]/a")),driver.findElement(By.xpath("//div[@id='module-3']/div/div/div/ul/li["+(i+1)+"]/div/a/img")));
		cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='module-3']/div/div/div/ul/li["+(i+1)+"]/div/a/img")), TestDatafile.EM_Flex_Veh_Avlb_Img_Data[i]);
		cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-3']/div/div/div/ul/li["+(i+1)+"]/div/div")),TestDatafile.EM_Flex_Veh_Avlb_NameAndPrice[i]);
		
	}
		
		//Electric Vehicles
		cf.highLightweb(object.EM_Elec_Veh_Highlight);
		cf.isTextPresent(SessionID,object.EM_Heading_Elec_Veh, TestDatafile.EM_Heading_Elec_Veh_Data);	
		cf.isTextPresent(SessionID,object.EM_SubHeading_Elec_Veh, TestDatafile.EM_SubHeading_Elec_Veh_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Veh_Text, TestDatafile.EM_Elec_Veh_Text_Data);
		cf.CheckWebImage(SessionID,object.EM_Elec_Veh_Img, TestDatafile.EM_Elec_Veh_Img_Data);
		cf.isTextPresent(SessionID,object.EM_Elec_Veh_Avlb, TestDatafile.EM_Elec_Veh_Avlb_Data);
		cf.isTextPresent(SessionID,object.EM_Avlb_Elec_Veh_B, TestDatafile.EM_Avlb_Elec_Veh_B_Data);
		cf.CheckWebImage(SessionID,object.EM_Avlb_Elec_Veh_B_Img, TestDatafile.EM_Avlb_Elec_Veh_B_Img_Data);
		cf.isTextPresent(SessionID,object.EM_Avlb_Elec_Veh_B250E_NameAndPrce, TestDatafile.EM_Avlb_Elec_Veh_B250E_NameAndPrce_Data);
			
		
		//A Legacy in Efficiency
		cf.highLightweb(object.EM_A_Leg_Highlight);
		cf.isTextPresent(SessionID,object.EM_Heading_Leg_Eff, TestDatafile.EM_Heading_Leg_Eff_Data);
		cf.isTextPresent(SessionID,object.EM_SubHeading_Leg_Eff, TestDatafile.EM_SubHeading_Leg_Eff_Data);
		cf.isTextPresent(SessionID,object.EM_A_Leg_Eff_Text, TestDatafile.EM_A_Leg_Eff_Text_Data);
		cf.CheckWebImage(SessionID,object.EM_Elec_Leg_Eff_Img, TestDatafile.EM_Elec_Leg_Eff_Img_Data);
		
		Thread.sleep(6000);
		for(int i=0;i<=3;i++){
		cf.highLightweb(driver.findElement(By.xpath("//div[@id='content']/div[3]/div[6]/div[2]/div["+(i+1)+"]")));
		cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/a/img")), TestDatafile.EM_Title_Img_Data[i]);
		cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/a")), TestDatafile.EM_links[i]);
		//cf.Linkvalidation(driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/a")));
		
		
		cf.Javascriptmouseover(driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/h2/a")));
		cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/h2/a")), TestDatafile.EM_Title_Data[i]);
		cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/h2/a")), TestDatafile.EM_links[i]);
		//cf.Linkvalidation(driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/h2/a")));
		
		
		cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/p/a")),TestDatafile.EM_Text_Data[i]);
		cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/p/a")), TestDatafile.EM_links[i]);
		//cf.Linkvalidation(driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/p/a")));
		
		
		
		
		
		
		cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/div/p/a")),TestDatafile.EM__Learnmore_Data[i]);
		cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/p/a")), TestDatafile.EM_links[i]);
		//cf.Linkvalidation(driver.findElement(By.xpath("//div[@class='tout-row']/div["+(i+1)+"]/div/p/a")));
				
	}
		
			
}
		
		
		
	}

