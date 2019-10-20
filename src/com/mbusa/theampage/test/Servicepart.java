package com.mbusa.theampage.test;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;
import org.junit.Test;



public class Servicepart extends Launch{
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "10";
		driver.navigate().to("https://www.mbusa.com/mercedes/service_and_parts/overview");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		
		Reporter.GeneralUpdate("ID 10", "Servicepart", "Execution Started");	
		cf.isTextPresent(SessionID,object.SP_header1, TestDatafile.SP_header1_data);
		cf.isTextPresent(SessionID,object.SP_para1, TestDatafile.SP_para1_data);
		cf.isTextPresent(SessionID,object.SP_link1, TestDatafile.SP_link1_data);
		cf.CheckWebImage(SessionID,object.SP_img1, TestDatafile.SP_img1_data);
		cf.isTextPresent(SessionID,object.SP2_header1, TestDatafile.SP2_header1_data);
		cf.CheckWebImage(SessionID,object.SP2_img1, TestDatafile.SP2_img1_data);
		cf.isTextPresent(SessionID,object.SP2_link1m, TestDatafile.SP2_link1m_data);
		cf.isTextPresent(SessionID,object.SP2_link2m, TestDatafile.SP2_link2m_data);
		cf.isTextPresent(SessionID,object.SP2_link3m, TestDatafile.SP2_link3m_data);
		cf.isTextPresent(SessionID,object.SP2_link4m, TestDatafile.SP2_link4m_data);
		cf.isTextPresent(SessionID,object.SP2_link5m, TestDatafile.SP2_link5m_data);
		cf.isTextPresent(SessionID,object.SP2_link6m, TestDatafile.SP2_link6m_data);
		cf.isTextPresent(SessionID,object.SP2_link7m, TestDatafile.SP2_link7m_data);
		cf.Linknavigation(SessionID,object.SP2_link8m, TestDatafile.SP2_link8m_data);
		cf.CheckWebImage(SessionID,object.SP2_img1r, TestDatafile.SP2_img1r_data);
		cf.isTextPresent(SessionID,object.SP2_link1r, TestDatafile.SP2_link1r_data);
		cf.isTextPresent(SessionID,object.SP2_link2r, TestDatafile.SP2_link2r_data);
		cf.isTextPresent(SessionID,object.SP2_link3r, TestDatafile.SP2_link3r_data);
		cf.isTextPresent(SessionID,object.SP2_link4r, TestDatafile.SP2_link4r_data);
		cf.isTextPresent(SessionID,object.SP2_link5r, TestDatafile.SP2_link5r_data);
		cf.isTextPresent(SessionID,object.SP2_link6r, TestDatafile.SP2_link6r_data);
		cf.isTextPresent(SessionID,object.SP2_link7r, TestDatafile.SP2_link7r_data);
		cf.isTextPresent(SessionID,object.SP2_link8r, TestDatafile.SP2_link8r_data);
		cf.Linknavigation(SessionID,object.SP2_link9r, TestDatafile.SP2_link9r_data);
		cf.CheckWebImage(SessionID,object.SP2_img1a, TestDatafile.SP2_img1a_data);
		cf.isTextPresent(SessionID,object.SP2_link1a, TestDatafile.SP2_link1a_data);
		cf.isTextPresent(SessionID,object.SP2_link2a, TestDatafile.SP2_link2a_data);
		cf.isTextPresent(SessionID,object.SP2_link3a, TestDatafile.SP2_link3a_data);
		cf.isTextPresent(SessionID,object.SP2_link4a, TestDatafile.SP2_link4a_data);
		cf.isTextPresent(SessionID,object.SP2_link5a, TestDatafile.SP2_link5a_data);
		cf.isTextPresent(SessionID,object.SP2_link6a, TestDatafile.SP2_link6a_data);
		cf.Linknavigation(SessionID,object.SP2_link7a, TestDatafile.SP2_link7a_data);
		cf.isTextPresent(SessionID,object.SP3_header, TestDatafile.SP3_header_data);
		cf.isTextPresent(SessionID,object.SP3_para, TestDatafile.SP3_para_data);
		cf.isTextPresent(SessionID,object.SP3_link, TestDatafile.SP3_link_data);
		cf.CheckWebImage(SessionID,object.SP3_img, TestDatafile.SP3_img_data);
		cf.CheckWebImage(SessionID,object.SP4_img, TestDatafile.SP4_img_data);
		cf.isTextPresent(SessionID,object.SP4_header1, TestDatafile.SP4_header1_data);
		cf.isTextPresent(SessionID,object.SP4_header2, TestDatafile.SP4_header2_data);
		cf.isTextPresent(SessionID,object.SP4_para, TestDatafile.SP4_para_data);
		cf.Linknavigation(SessionID,object.SP4_link, TestDatafile.SP4_link_data);
		
		
		
		
		
		System.out.println(" Execution End");	
		
	}

}
