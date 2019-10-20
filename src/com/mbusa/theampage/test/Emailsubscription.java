package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Emailsubscription extends Launch{
	
	commonfunctions cf = new commonfunctions();
	
	
	
	
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "9";
		driver.navigate().to("https://www.mbusa.com/mercedes/contact_us/mercedes_email_subscription");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 9", "Designo - Execution Started ", "");
	cf.isTextPresent(SessionID,object.EMSub_Header_1, TestDatafile.EMSub_Header_1_data);
		cf.isTextPresent(SessionID,object.EMSub_Header_2, TestDatafile.EMSub_Header_2_data);
		cf.Inputbox(object.EMSub_mailfield, TestDatafile.EMSub_mailfield_data);
		cf.isButtonfound(SessionID,object.EMSub_subscribe);
		cf.isTextPresent(SessionID,object.EMSub_para1, TestDatafile.EMSub_para1_data);
		cf.isTextPresent(SessionID,object.EMSub_label1, TestDatafile.EMSub_label1_data);
		cf.isTextPresent(SessionID,object.EMSub_span1, TestDatafile.EMSub_span1_data);
		cf.isTextPresent(SessionID,object.EMSub_link1, TestDatafile.EMSub_link1_data);
		cf.isTextPresent(SessionID,object.EMSub_label2, TestDatafile.EMSub_label2_data);
		cf.isTextPresent(SessionID,object.EMSub_span2, TestDatafile.EMSub_span2_data);
		cf.isTextPresent(SessionID,object.EMSub_link2, TestDatafile.EMSub_link2_data);
		cf.isTextPresent(SessionID,object.EMSub_label3, TestDatafile.EMSub_label3_data);
		cf.isTextPresent(SessionID,object.EMSub_span3, TestDatafile.EMSub_span3_data);
		cf.isTextPresent(SessionID,object.EMSub_link3, TestDatafile.EMSub_link3_data);
		cf.isTextPresent(SessionID,object.EMSub_label4, TestDatafile.EMSub_label4_data);
		cf.isTextPresent(SessionID,object.EMSub_span4, TestDatafile.EMSub_span4_data);
		cf.isTextPresent(SessionID,object.EMSub_link4, TestDatafile.EMSub_link4_data);
		cf.isTextPresent(SessionID,object.EMSub_label5, TestDatafile.EMSub_label5_data);
		cf.isTextPresent(SessionID,object.EMSub_span5, TestDatafile.EMSub_span5_data);
		cf.isTextPresent(SessionID,object.EMSub_link5, TestDatafile.EMSub_link5_data);
		cf.isTextPresent(SessionID,object.EMSub_label6, TestDatafile.EMSub_label6_data);
		cf.isTextPresent(SessionID,object.EMSub_span6, TestDatafile.EMSub_span6_data);
		cf.isTextPresent(SessionID,object.EMSub_para2, TestDatafile.EMSub_para2_data);
		cf.isTextPresent(SessionID,object.EMSub_link7, TestDatafile.EMSub_link7_data);
		cf.CheckWebImage(SessionID,object.EMSub_img, TestDatafile.EMSub_img_data );
		cf.isTextPresent(SessionID,object.EMSub_para3, TestDatafile.EMSub_para3_data);
		cf.isButtonfound(SessionID,object.EMSub_button);
		cf.isTextPresent(SessionID,object.EMSub_para4, TestDatafile.EMSub_para4_data);
		cf.isTextPresent(SessionID,object.EMSub_para5, TestDatafile.EMSub_para5_data);
  		cf.Click(object.EMSub_checkbox6);
		cf.Clickandwait(object.EMSub_subscribe,object.EMSub2_header2);
		cf.isTextPresent(SessionID,object.EMSub2_header2, TestDatafile.EMSub2_header2_data);
		cf.isTextPresent(SessionID,object.EMSub2_para1, TestDatafile.EMSub2_para1_data);
		cf.isTextPresent(SessionID,object.EMSub2_para2, TestDatafile.EMSub2_para2_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet1, TestDatafile.EMSub2_bullet1_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet2, TestDatafile.EMSub2_bullet2_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet3, TestDatafile.EMSub2_bullet3_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet4, TestDatafile.EMSub2_bullet4_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet5, TestDatafile.EMSub2_bullet5_data);
		cf.isTextPresent(SessionID,object.EMSub2_para3, TestDatafile.EMSub2_para3_data);
		Thread.sleep(2000);
		cf.Clickandwait(object.EMSub2_button,object.EMSub_checkbox6);
		cf.Click(object.EMSub_checkbox6);
		cf.Clickandwait(object.EMSub3_button,object.EMSub2_header2);
		cf.isTextPresent(SessionID,object.EMSub2_header2, TestDatafile.EMSub2_header3_data);
		cf.isTextPresent(SessionID,object.EMSub2_para1, TestDatafile.EMSub2_para3_data);
		cf.isTextPresent(SessionID,object.EMSub2_para2, TestDatafile.EMSub2_para2_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet1, TestDatafile.EMSub2_bullet1_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet2, TestDatafile.EMSub2_bullet2_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet3, TestDatafile.EMSub2_bullet3_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet4, TestDatafile.EMSub2_bullet4_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet5, TestDatafile.EMSub2_bullet5_data);
		cf.isTextPresent(SessionID,object.EMSub2_bullet6, TestDatafile.EMSub2_bullet6_data);
		cf.isTextPresent(SessionID,object.EMSub2_para1, TestDatafile.EMSub2_para3_data);
  		cf.Clickandwait(object.EMSub2_button,object.EMSub3_button2);
		
		cf.Clickandwait(object.EMSub3_button2,object.EMSub4_header1);
		
		cf.isTextPresent(SessionID,object.EMSub4_header1, TestDatafile.EMSub4_header1_data);
		cf.isTextPresent(SessionID,object.EMSub4_header2, TestDatafile.EMSub4_header2_data);
		cf.isTextPresent(SessionID,object.EMSub4_para1, TestDatafile.EMSub4_para1_data);
		cf.isTextPresent(SessionID,object.EMSub4_para2, TestDatafile.EMSub4_para2_data);
		cf.isButtonfound(SessionID,object.EMSub4_button);
		cf.Clickandwait(object.EMSub4_button,object.EMSub_Header_2);
		cf.isTextPresent(SessionID,object.EMSub_Header_2, TestDatafile.EMSub_Header_2_data);
		
		
		System.out.println(" Execution End");	
	}
}

































