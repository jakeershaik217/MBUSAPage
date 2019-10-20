package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;


public class Tradeinvalue extends Launch{

	
commonfunctions cf = new commonfunctions();
	
	@Test
	public void TIV() throws Exception
	{

			objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
			String SessionID = "12";
			driver.navigate().to("https://www.mbusa.com/mercedes/trade_in_value");
			Thread.sleep(500);
			System.out.println(" Execution Started");
			Reporter.GeneralUpdate("ID 12", "Tradeinvalue", "Execution Started");	
			driver.switchTo().frame("blackBookFrame");	
			cf.CheckWebImage(SessionID,object.TIV_globalhead_i, TestDatafile.TIV_globalhead_i_Data);
			
			
			cf.isTextPresent(SessionID,object.TIV_globalhead_n, TestDatafile.TIV_globalhead_n_Data);
			
			cf.isTextPresent(SessionID,object.TIV_globalhead_quote, TestDatafile.TIV_globalhead_quote_Data);
	    	cf.isTextPresent(SessionID,object.TIV_globalhead_copy, TestDatafile.TIV_globalhead_copy_Data);
	     	cf.isTextPresent(SessionID,object.TIV_globalfoot_disc, TestDatafile.TIV_globalfoot_disc_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc1, TestDatafile.TIV_globalfoot_disc1_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc2, TestDatafile.TIV_globalfoot_disc2_Data);
		    cf.isTextPresent(SessionID,object.TIV_p1_head, TestDatafile.TIV_p1_head_Data);
		//  cf.isTextPresent(SessionID,object.TIV_p1_head_copy, TestDatafile.TIV_p1_head_copy_Data);
		    cf.isTextPresent(SessionID,object.TIV_p1_vehiclename, TestDatafile.TIV_p1_vehiclename_Data);
		    cf.isTextPresent(SessionID,object.TIV_p1_yrc, TestDatafile.TIV_p1_yrc_Data);
		    
		    cf.highLightweb(object.TIV_p1_yrv);
		    Select sel=new Select(object.TIV_p1_yrv);
		    sel.selectByIndex(1);
		    WebDriverWait wait=new WebDriverWait(driver, 120);
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_yrv, "2016"));
		    
		    cf.highLightweb(object.TIV_p1_mkv);
		    Select sel1=new Select(object.TIV_p1_mkv);
		    sel1.selectByIndex(1);
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_mkv, "Acura"));
		    
		    cf.highLightweb(object.TIV_p1_mdv);
		    Select sel2=new Select(object.TIV_p1_mdv);
		    sel2.selectByIndex(2);
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_mdv, "MDX"));
		    
		    cf.highLightweb(object.TIV_p1_srv);
		    Select sel3=new Select(object.TIV_p1_srv);
		    sel3.selectByIndex(3);
		   
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_srv, "SH-AWD"));
		    
		    cf.highLightweb(object.TIV_p1_stv);
		    Select sel4=new Select(object.TIV_p1_stv);
		    sel4.selectByIndex(3);
		   
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_stv, "4D SUV w/Tech&RES"));
		    
		    cf.highLightweb(object.TIV_p1_cov);
		    Select sel5=new Select(object.TIV_p1_cov);
		    sel5.selectByIndex(2);
		    
		    wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_cov, "Black"));
		    
		    
		    cf.isTextPresent(SessionID,object.TIV_p1_mgc, TestDatafile.TIV_p1_mgc_Data);
		    
		    object.TIV_p1_mgv.click();
		    
		    cf.Inputbox(object.TIV_p1_mgv, TestDatafile.TIV_p1_mgv_Data);
		    
		    object.TIV_p1_mgc.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p1_zc, TestDatafile.TIV_p1_zc_Data);
		    
		    object.TIV_p1_zv.click();
		    
		    cf.Inputbox(object.TIV_p1_zv, TestDatafile.TIV_p1_zv_Data);
		    
		    object.TIV_p1_zc.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p1_button, TestDatafile.TIV_p1_button_Data);
		    
		    cf.Clickandwait(object.TIV_p1_button,object.TIV_p2_vehiclename);  
		      
		    cf.isTextPresent(SessionID,object.TIV_p2_vehiclename, TestDatafile.TIV_p2_vehiclename_Data);
		    cf.isTextPresent(SessionID,object.TIV_p2_head, TestDatafile.TIV_p2_head_Data);
		    
		    cf.isTextPresent(SessionID,object.TIV_globalhead_n, TestDatafile.TIV_globalhead_n_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalhead_quote, TestDatafile.TIV_globalhead_quote_Data);
	    	cf.isTextPresent(SessionID,object.TIV_globalhead_copy, TestDatafile.TIV_globalhead_copy_Data);
	     	cf.isTextPresent(SessionID,object.TIV_globalfoot_disc, TestDatafile.TIV_globalfoot_disc_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc1, TestDatafile.TIV_globalfoot_disc1_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc2, TestDatafile.TIV_globalfoot_disc2_Data);
		    
		    
		    object.TIV_p2_selection1.click();
		    object.TIV_p2_selection2.click();
		    object.TIV_p2_selection3.click();
		    object.TIV_p2_selection4.click();
		    object.TIV_p2_selection5.click();
		    object.TIV_p2_selection6.click();
		    object.TIV_p2_selection7.click();
		    object.TIV_p2_selection8.click();
		    object.TIV_p2_selection9.click();
		    object.TIV_p2_selection10.click();
		    object.TIV_p2_selection11.click();
		    object.TIV_p2_selection12.click();
		    
		    cf.Clickandwait(object.TIV_p2_button,object.TIV_p3_bodyc);
		   		    
		    cf.isTextPresent(SessionID,object.TIV_p3_vehiclename, TestDatafile.TIV_p3_vehiclename_Data);
		    cf.isTextPresent(SessionID,object.TIV_p3_vehicledesc, TestDatafile.TIV_p3_vehicledesc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p3_bodyc, TestDatafile.TIV_p3_bodyc_Data);
		    
		    cf.isTextPresent(SessionID,object.TIV_globalhead_n, TestDatafile.TIV_globalhead_n_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalhead_quote, TestDatafile.TIV_globalhead_quote_Data);
	    	cf.isTextPresent(SessionID,object.TIV_globalhead_copy, TestDatafile.TIV_globalhead_copy_Data);
	     	cf.isTextPresent(SessionID,object.TIV_globalfoot_disc, TestDatafile.TIV_globalfoot_disc_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc1, TestDatafile.TIV_globalfoot_disc1_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc2, TestDatafile.TIV_globalfoot_disc2_Data);
		    
		    object.TIV_p3_bodys2.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p3_paintc, TestDatafile.TIV_p3_paintc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p3_rustc, TestDatafile.TIV_p3_rustc_Data);
		    
		    object.TIV_p3_rusts2.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p3_hailc, TestDatafile.TIV_p3_hailc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p3_spentc, TestDatafile.TIV_p3_spentc_Data);
		    
		    object.TIV_p3_spents2.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p3_interiorc, TestDatafile.TIV_p3_interiorc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p3_mechanicalc, TestDatafile.TIV_p3_mechanicalc_Data);
		    
		    object.TIV_p3_mechanicals2.click();
		    
		    object.TIV_p3_bodys1.click();
		    object.TIV_p3_rusts1.click();
		    object.TIV_p3_spents1.click();
		    object.TIV_p3_mechanicals1.click();
		    
		    cf.isButtonfound(SessionID,object.TIV_p3_button);
		    
		    cf.Clickandwait(object.TIV_p3_button,object.TIV_p4_fnamec);
		    
		    
		    cf.isTextPresent(SessionID,object.TIV_p4_vehiclename, TestDatafile.TIV_p4_vehiclename_Data);
		    
		    
		    cf.isTextPresent(SessionID,object.TIV_globalhead_n, TestDatafile.TIV_globalhead_n_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalhead_quote, TestDatafile.TIV_globalhead_quote_Data);
	    	cf.isTextPresent(SessionID,object.TIV_globalhead_copy, TestDatafile.TIV_globalhead_copy_Data);
	     	cf.isTextPresent(SessionID,object.TIV_globalfoot_disc, TestDatafile.TIV_globalfoot_disc_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc1, TestDatafile.TIV_globalfoot_disc1_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc2, TestDatafile.TIV_globalfoot_disc2_Data);
		    
		    
		    cf.isTextPresent(SessionID,object.TIV_p4_head, TestDatafile.TIV_p4_head_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_headc, TestDatafile.TIV_p4_headc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_fnamec, TestDatafile.TIV_p4_fnamec_Data);
		    cf.Inputbox(object.TIV_p4_fnamev, TestDatafile.TIV_p4_fnamev_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_lnamec, TestDatafile.TIV_p4_lnamec_Data);
		    cf.Inputbox(object.TIV_p4_lnamev, TestDatafile.TIV_p4_lnamev_Data);
									
		
		    cf.isTextPresent(SessionID,object.TIV_p4_phonec, TestDatafile.TIV_p4_phonec_Data);
		    cf.Inputbox(object.TIV_p4_phonev, TestDatafile.TIV_p4_phonev_Data);
		    
		   
		    cf.isTextPresent(SessionID,object.TIV_p4_emailc, TestDatafile.TIV_p4_emailc_Data);
		    cf.Inputbox(object.TIV_p4_emailv, TestDatafile.TIV_p4_emailv_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_addressc, TestDatafile.TIV_p4_addressc_Data);
		    cf.Inputbox(object.TIV_p4_addressv, TestDatafile.TIV_p4_addressv_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_reason, TestDatafile.TIV_p4_reason_Data);
		    
		    cf.isTextPresent(SessionID,object.TIV_p4_cityc, TestDatafile.TIV_p4_cityc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_cityc, TestDatafile.TIV_p4_cityc_Data);
		    
		    cf.highLightweb(object.TIV_p4_modelv);
		    Select sel6=new Select(object.TIV_p4_modelv);
		    sel6.selectByIndex(15);
		    
		    //wait.until(ExpectedConditions.textToBePresentInElement(object.TIV_p1_cov, "S-Class"));
		 
		    

		    cf.isTextPresent(SessionID,object.TIV_p4_button, TestDatafile.TIV_p4_button_Data);
		    cf.isTextPresent(SessionID,object.TIV_p4_buttonc, TestDatafile.TIV_p4_buttonc_Data);
		    
		    
		    cf.Clickandwait(object.TIV_p4_button,object.TIV_p5_TIV);
		    
		    cf.isTextPresent(SessionID,object.TIV_p5_head, TestDatafile.TIV_p5_head_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_headc, TestDatafile.TIV_p5_headc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_print, TestDatafile.TIV_p5_print_Data);
		    
		    object.TIV_p5_TIV.click();
		    object.TIV_p5_TIVE.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_globalhead_n, TestDatafile.TIV_globalhead_n_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalhead_quote, TestDatafile.TIV_globalhead_quote_Data);
	    	cf.isTextPresent(SessionID,object.TIV_globalhead_copy, TestDatafile.TIV_globalhead_copy_Data);
	     	cf.isTextPresent(SessionID,object.TIV_globalfoot_disc, TestDatafile.TIV_globalfoot_disc_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc1, TestDatafile.TIV_globalfoot_disc1_Data);
		    cf.isTextPresent(SessionID,object.TIV_globalfoot_disc2, TestDatafile.TIV_globalfoot_disc2_Data);
		    
		    
		    cf.isTextPresent(SessionID,object.TIV_p5_benifitc, TestDatafile.TIV_p5_benifitc_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_vehicledetailscopy, TestDatafile.TIV_p5_vehicledetailscopy_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_vehicledetailscopy, TestDatafile.TIV_p5_vehicledetailscopy_Data);
		    
		    object.TIV_p5_vehiclespecification.click();
		    object.TIV_p5_vehicleselections.click();
		    
		    cf.isTextPresent(SessionID,object.TIV_p5_namec, TestDatafile.TIV_p5_namec_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_name, TestDatafile.TIV_p5_name_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_fcopyhead, TestDatafile.TIV_p5_fcopyhead_Data);
		    cf.isTextPresent(SessionID,object.TIV_p5_fcopy, TestDatafile.TIV_p5_fcopy_Data);
		 

			System.out.println(" Execution End");


	}

}