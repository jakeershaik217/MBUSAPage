package com.mbusa.theampage.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Prepaid_Maintainance extends Launch {
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void FAQ() throws Exception
	{
		
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		
		String SessionID = "3";
		driver.navigate().to("https://www.mbusa.com/mercedes/service_and_parts/maintenance#waypoint=express-service");
		Thread.sleep(500);
			
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 3", "Prepaid_Maintainance", "Execution Started");
		cf.isTextPresent(SessionID,object.PPM_Herocarousal_Heading1, TestDatafile.PPM_Herocarousal_Heading1);
		cf.isTextPresent(SessionID,object.PPM_Herocarousal_Heading2, TestDatafile.PPM_Herocarousal_Heading2);
		cf.isTextPresent(SessionID,object.PPM_Herocarousal_Heading3, TestDatafile.PPM_Herocarousal_Heading3);
		cf.CheckWebImage(SessionID,object.PPM_Herocarousal_Image, TestDatafile.PPM_Herocarousal_Image);
		cf.imagevalidation(SessionID,object.PPM_Herocarousal_Image);
		cf.Linknavigation(SessionID,object.PPM_Herocarousal_Link, TestDatafile.PPM_Herocarousal_Link);
		cf.Linkvalidation(SessionID,object.PPM_Herocarousal_Link);
		
		for(int i=1;i<=3;i++){
			
			
			
			cf.Click(driver.findElement(By.xpath("//nav[@id='sub-nav-v2']/div/ul/li["+i+"]/a")));
			if(i==1){ //Maintanance
			for(int j=0;j<=1;j++){
				
				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='maintenance']/div/div["+(j+1)+"]/div/div/div[2]/h3")),TestDatafile.PPM_Header_1[j]);
				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='maintenance']/div/div["+(j+1)+"]/div/div/div[2]/h2")),TestDatafile.PPM_Header_2[j]);
				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='maintenance']/div/div["+(j+1)+"]/div/div/div[2]/p")),TestDatafile.PPM_para[j]);
			
			
			if(j==1){//in side Maintanance
				
				
				cf.Linknavigation(SessionID,object.PPM_Maintinance_link_Learnmore_1, TestDatafile.PPM_Maintinance_link_Learnmore_1);
			    cf.Linkvalidation(SessionID,object.PPM_Maintinance_link_Learnmore_1);
			    cf.Linknavigation(SessionID,object.PPM_Maintinance_View_Your_Maintenance_Button, TestDatafile.PPM_Maintinance_View_Your_Maintenance_Button);
			    cf.Linkvalidation(SessionID,object.PPM_Maintinance_View_Your_Maintenance_Button);
			}
             if(j==1){
				
				cf.CheckWebImage(SessionID,object.PPM_Maintinance_Image, TestDatafile.PPM_Maintinance_Image);
				cf.imagevalidation(SessionID,object.PPM_Maintinance_Image);
				cf.Linknavigation(SessionID,object.PPM_Maintinance_link_Learnmore_2, TestDatafile.PPM_Maintinance_link_Learnmore_2);
			    cf.Linkvalidation(SessionID,object.PPM_Maintinance_link_Learnmore_2);
			    
			}
			}
			}
		if(i==2){//Express_Services
			
			
			cf.CheckWebImage(SessionID,object.PPM_Express_Services_img, TestDatafile.PPM_Express_Services_img);
			cf.imagevalidation(SessionID,object.PPM_Express_Services_img);
			cf.isTextPresent(SessionID,object.PPM_Express_Services_Heading_1, TestDatafile.PPM_Express_Services_Heading_1);
			cf.isTextPresent(SessionID,object.PPM_Express_Services_Heading_2, TestDatafile.PPM_Express_Services_Heading_2);
			cf.isTextPresent(SessionID,object.PPM_Express_Services_Heading_3, TestDatafile.PPM_Express_Services_Heading_3);
		    cf.Linknavigation(SessionID,object.PPM_Express_Services_learnmore_link, TestDatafile.PPM_Express_Services_learnmore_link);
		    cf.Linkvalidation(SessionID,object.PPM_Express_Services_learnmore_link);
		    cf.Linknavigation(SessionID,object.PPM_Express_Services_Findas_link, TestDatafile.PPM_Express_Services_Findas_link);
		    cf.Linkvalidation(SessionID,object.PPM_Express_Services_Findas_link);
		
		}
		
		if(i==3){//Prepaid_Maintainance
			
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Heading_1, TestDatafile.PPM_Prepaid_Maintainance_Heading_1);
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Heading_2, TestDatafile.PPM_Prepaid_Maintainance_Heading_2);
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Heading_3, TestDatafile.PPM_Prepaid_Maintainance_Heading_3);
			cf.Linknavigation(SessionID,object.PPM_Prepaid_Maintainance_learmore_link, TestDatafile.PPM_Prepaid_Maintainance_learmore_link);
			cf.Linkvalidation(SessionID,object.PPM_Prepaid_Maintainance_learmore_link);
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_para,TestDatafile.PPM_Prepaid_Maintainance_Dropdown_para);
			cf.CheckWebImage(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_image, TestDatafile.PPM_Prepaid_Maintainance_Dropdown_image);
			cf.imagevalidation(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_image);
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_price, TestDatafile.PPM_Prepaid_Maintainance_Dropdown_price);
			cf.isTextPresent(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_text, TestDatafile.PPM_Prepaid_Maintainance_Dropdown_text);
			cf.Linknavigation(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_link, TestDatafile.PPM_Prepaid_Maintainance_Dropdown_link);
			cf.Linkvalidation(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_link);
			cf.Linknavigation(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_Contactadealer_button, TestDatafile.PPM_Prepaid_Maintainance_Dropdown_Contactadealer_button);
			cf.Linkvalidation(SessionID,object.PPM_Prepaid_Maintainance_Dropdown_Contactadealer_button);
			
			cf.dropdown(driver, Dropdown_1, driver.findElement(By.xpath("//div[@class='liquid-wrapper']/div[2]/div[1]/select[1]")));
			cf.dropdown(driver, Dropdown_2, driver.findElement(By.xpath("//div[@class='liquid-wrapper']/div[2]/div[1]/select[2]")));
			cf.dropdown(driver, Dropdown_3, driver.findElement(By.xpath("//div[@class='liquid-wrapper']/div[2]/div[1]/select[3]")));
			
			
		}
		
		
		}
	
		
		cf.isTextPresent(SessionID,object.PPM_Featured, TestDatafile.PPM_Featured);
		
		for(int i=0;i<3;i++){
			
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(i+1)+"]/div[2]/h2")),TestDatafile.PPM_title[i]);
			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(i+1)+"]/div[1]/a/img")),TestDatafile.PPM_img[i]);
			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(i+1)+"]/div[2]/h3/a")),TestDatafile.PPM_link[i]);
		}
		
		
		
	}

}
