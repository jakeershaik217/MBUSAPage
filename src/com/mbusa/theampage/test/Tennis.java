package com.mbusa.theampage.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Tennis extends Launch{
	commonfunctions cf = new commonfunctions();
	@Test
	public void TennisEvent() throws Exception{ 
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "18";
		driver.navigate().to("https://www.mbusa.com/mercedes/events/tennis");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 18", "Tennis - Execution Started ", "");
		cf.CheckWebImage(SessionID,object.TE_Hero_Bg_img, TestDatafile.TE_Hero_Bg_img);
		cf.imagevalidation(SessionID,object.TE_Hero_Bg_img);
		cf.isTextPresent(SessionID,object.TE_Hero_hdr, TestDatafile.TE_Hero_hdr);
		cf.isTextPresent(SessionID,object.TE_Hero_sub_hdr, TestDatafile.TE_Hero_sub_hdr);
		cf.isTextPresent(SessionID,object.TE_Hero_para, TestDatafile.TE_Hero_para);
		
		cf.isTextPresent(SessionID,object.TE_Hero_CTA1, TestDatafile.TE_Hero_CTA1);
		cf.isTextPresent(SessionID,object.TE_Hero_CTA2, TestDatafile.TE_Hero_CTA2);
		cf.Linknavigation(SessionID,object.TE_Hero_CTA2Link, TestDatafile.TE_Hero_CTA2Link);
		cf.Linkvalidation(SessionID,object.TE_Hero_CTA2Link);
		
		cf.mouseover(object.TE_Hero_share, object.TE_Hero_Share_fb);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(object.TE_Hero_Share_fb));
		cf.isTextPresent(SessionID,object.TE_Hero_Share_fb, TestDatafile.TE_Hero_Share_fb);
		cf.isTextPresent(SessionID,object.TE_Hero_Share_twr, TestDatafile.TE_Hero_Share_twr);
		cf.isTextPresent(SessionID,object.TE_Hero_Share_eml, TestDatafile.TE_Hero_Share_eml);
		cf.Linknavigation(SessionID,object.TE_Hero_Share_fb_link, TestDatafile.TE_Hero_Share_fb_link);
		cf.Linkvalidation(SessionID,object.TE_Hero_Share_fb_link);
		cf.Linknavigation(SessionID,object.TE_Hero_Share_twr_link, TestDatafile.TE_Hero_Share_twr_link);
		cf.Linkvalidation(SessionID,object.TE_Hero_Share_twr_link);
		cf.Linknavigation(SessionID,object.TE_Hero_Share_eml_link, TestDatafile.TE_Hero_Share_eml_link);
		cf.Linkvalidation(SessionID,object.TE_Hero_Share_eml_link);
		
		cf.CheckWebImage(SessionID,object.TE_Bg_img1, TestDatafile.TE_Bg_img1);
		cf.imagevalidation(SessionID,object.TE_Bg_img1);
		cf.isTextPresent(SessionID,object.TE_hdr1, TestDatafile.TE_hdr1);
		cf.isTextPresent(SessionID,object.TE_sub_hdr1_1, TestDatafile.TE_sub_hdr1_1);
		cf.isTextPresent(SessionID,object.TE_sub_hdr1_2, TestDatafile.TE_sub_hdr1_2);
		cf.isTextPresent(SessionID,object.TE_para1_1, TestDatafile.TE_para1_1);
		cf.isTextPresent(SessionID,object.TE_para1_2, TestDatafile.TE_para1_2);
		cf.isTextPresent(SessionID,object.TE_extraInfo1, TestDatafile.TE_extraInfo1);
		cf.Linknavigation(SessionID,object.TE_extraInfo1Link, TestDatafile.TE_extraInfo1Link);
		cf.Linkvalidation(SessionID,object.TE_extraInfo1Link);
		
		cf.CheckWebImage(SessionID,object.TE_Bg_img2, TestDatafile.TE_Bg_img2);
		cf.imagevalidation(SessionID,object.TE_Bg_img2);
		cf.isTextPresent(SessionID,object.TE_hdr2, TestDatafile.TE_hdr2);
		cf.isTextPresent(SessionID,object.TE_sub_hdr2, TestDatafile.TE_sub_hdr2);
		cf.isTextPresent(SessionID,object.TE_para2, TestDatafile.TE_para2);
		cf.Linknavigation(SessionID,object.TE_extraInfo2VideoLink, TestDatafile.TE_extraInfo2VideoLink);
		cf.Linkvalidation(SessionID,object.TE_extraInfo2VideoLink);
		
		cf.CheckWebImage(SessionID,object.TE_Bg_img3, TestDatafile.TE_Bg_img3);
		cf.imagevalidation(SessionID,object.TE_Bg_img3);
		cf.isTextPresent(SessionID,object.TE_hdr3, TestDatafile.TE_hdr3);
		cf.isTextPresent(SessionID,object.TE_sub_hdr3, TestDatafile.TE_sub_hdr3);
		cf.isTextPresent(SessionID,object.TE_para3_1, TestDatafile.TE_para3_1);
		cf.isTextPresent(SessionID,object.TE_para3_2, TestDatafile.TE_para3_2);
		cf.isTextPresent(SessionID,object.TE_para3_3, TestDatafile.TE_para3_3);
		
		cf.isTextPresent(SessionID,object.TE_Events_Hero_hdr1, TestDatafile.TE_Events_Hero_hdr1);
		cf.isTextPresent(SessionID,object.TE_Events_Hero_hdr2, TestDatafile.TE_Events_Hero_hdr2);
		cf.Linknavigation(SessionID,object.TE_Events_Hero_hdr2Link, TestDatafile.TE_Events_Hero_hdr2Link);
		cf.Linkvalidation(SessionID,object.TE_Events_Hero_hdr2Link);
		
		cf.CheckWebImage(SessionID,object.TE_Events_bg_img1, TestDatafile.TE_Events_bg_img1);
		cf.imagevalidation(SessionID,object.TE_Events_bg_img1);
		cf.Linknavigation(SessionID,object.TE_Events_bg_img1Link, TestDatafile.TE_Events_bg_img1Link);
		cf.Linkvalidation(SessionID,object.TE_Events_bg_img1Link);
		cf.isTextPresent(SessionID,object.TE_Events_ttl1, TestDatafile.TE_Events_ttl1);
		cf.Linknavigation(SessionID,object.TE_Events_ttl1Link, TestDatafile.TE_Events_ttl1Link);
		cf.Linkvalidation(SessionID,object.TE_Events_ttl1Link);
		cf.isTextPresent(SessionID,object.TE_Events_para1, TestDatafile.TE_Events_para1);
		cf.Linknavigation(SessionID,object.TE_Events_para1Link, TestDatafile.TE_Events_para1Link);
		cf.Linkvalidation(SessionID,object.TE_Events_para1Link);
		cf.Javascriptmouseover(object.TE_Events_btn1);
		cf.isTextPresent(SessionID,object.TE_Events_btn1, TestDatafile.TE_Events_btn1);
		cf.Linknavigation(SessionID,object.TE_Events_btn1Link, TestDatafile.TE_Events_btn1Link);
		cf.Linkvalidation(SessionID,object.TE_Events_btn1Link);
		
		cf.CheckWebImage(SessionID,object.TE_Events_bg_img2, TestDatafile.TE_Events_bg_img2);
		cf.imagevalidation(SessionID,object.TE_Events_bg_img2);
		cf.Linknavigation(SessionID,object.TE_Events_bg_img2Link, TestDatafile.TE_Events_bg_img2Link);
		cf.Linkvalidation(SessionID,object.TE_Events_bg_img2Link);
		cf.isTextPresent(SessionID,object.TE_Events_ttl2, TestDatafile.TE_Events_ttl2);
		cf.Linknavigation(SessionID,object.TE_Events_ttl2Link, TestDatafile.TE_Events_ttl2Link);
		cf.Linkvalidation(SessionID,object.TE_Events_ttl2Link);
		cf.isTextPresent(SessionID,object.TE_Events_para2, TestDatafile.TE_Events_para2);
		cf.Linknavigation(SessionID,object.TE_Events_para2Link, TestDatafile.TE_Events_para2Link);
		cf.Linkvalidation(SessionID,object.TE_Events_para2Link);
		cf.Javascriptmouseover(object.TE_Events_btn2);
		cf.isTextPresent(SessionID,object.TE_Events_btn2, TestDatafile.TE_Events_btn2);
		cf.Linknavigation(SessionID,object.TE_Events_btn2Link, TestDatafile.TE_Events_btn2Link);
		cf.Linkvalidation(SessionID,object.TE_Events_btn2Link);
		
		cf.CheckWebImage(SessionID,object.TE_Events_bg_img3, TestDatafile.TE_Events_bg_img3);
		cf.imagevalidation(SessionID,object.TE_Events_bg_img3);
		cf.Linknavigation(SessionID,object.TE_Events_bg_img3Link, TestDatafile.TE_Events_bg_img3Link);
		cf.Linkvalidation(SessionID,object.TE_Events_bg_img3Link);
		cf.isTextPresent(SessionID,object.TE_Events_ttl3, TestDatafile.TE_Events_ttl3);
		cf.Linknavigation(SessionID,object.TE_Events_ttl3Link, TestDatafile.TE_Events_ttl3Link);
		cf.Linkvalidation(SessionID,object.TE_Events_ttl3Link);
		cf.isTextPresent(SessionID,object.TE_Events_para3, TestDatafile.TE_Events_para3);
		cf.Linknavigation(SessionID,object.TE_Events_para3Link, TestDatafile.TE_Events_para3Link);
		cf.Linkvalidation(SessionID,object.TE_Events_para3Link);
		cf.Javascriptmouseover(object.TE_Events_btn3);
		cf.isTextPresent(SessionID,object.TE_Events_btn3, TestDatafile.TE_Events_btn3);
		cf.Linknavigation(SessionID,object.TE_Events_btn3Link, TestDatafile.TE_Events_btn3Link);
		cf.Linkvalidation(SessionID,object.TE_Events_btn3Link);
		
		cf.CheckWebImage(SessionID,object.TE_Events_bg_img4, TestDatafile.TE_Events_bg_img4);
		cf.imagevalidation(SessionID,object.TE_Events_bg_img4);
		cf.Linknavigation(SessionID,object.TE_Events_bg_img4Link, TestDatafile.TE_Events_bg_img4Link);
		cf.Linkvalidation(SessionID,object.TE_Events_bg_img4Link);
		cf.isTextPresent(SessionID,object.TE_Events_ttl4, TestDatafile.TE_Events_ttl4);
		cf.Linknavigation(SessionID,object.TE_Events_ttl4Link, TestDatafile.TE_Events_ttl4Link);
		cf.Linkvalidation(SessionID,object.TE_Events_ttl4Link);
		cf.Javascriptmouseover(object.TE_Events_para4);
		cf.isTextPresent(SessionID,object.TE_Events_para4, TestDatafile.TE_Events_para4);
		cf.Linknavigation(SessionID,object.TE_Events_para4Link, TestDatafile.TE_Events_para4Link);
		cf.Linkvalidation(SessionID,object.TE_Events_para4Link);
		cf.Javascriptmouseover(object.TE_Events_btn4);
		cf.isTextPresent(SessionID,object.TE_Events_btn4, TestDatafile.TE_Events_btn4);
		cf.Linknavigation(SessionID,object.TE_Events_btn4Link, TestDatafile.TE_Events_btn4Link);
		cf.Linkvalidation(SessionID,object.TE_Events_btn4Link);
		
	}
}
