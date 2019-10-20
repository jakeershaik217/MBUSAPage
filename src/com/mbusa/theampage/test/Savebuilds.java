package com.mbusa.theampage.test;


import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;


public class Savebuilds extends Launch{

	commonfunctions cf = new commonfunctions();
	
	@Test
	public void SVB() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		String SessionID = "11";
		driver.navigate().to("https://www.mbusa.com/mercedes/vehicles/build/class-E/model-E300W#tab=tab-summary");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 11", "Savebuilds", "Execution Started");		
		cf.isTextPresent(SessionID,object.SVB_smry, TestDatafile.SVB_smry_Data);
		
		cf.Clickandwait(object.SVB_smry,object.SVB_smry_pop_login_h);
					
		cf.isTextPresent(SessionID,object.SVB_smry_pop_login_h, TestDatafile.SVB_smry_pop_login_h_Data);
		cf.isTextPresent(SessionID,object.SVB_smry_pop_login_c, TestDatafile.SVB_smry_pop_login_c_Data);
		cf.isTextPresent(SessionID,object.SVB_smry_pop_login_bv, TestDatafile.SVB_smry_pop_login_bv_Data);
		cf.isTextPresent(SessionID,object.SVB_smry_pop_reg_h, TestDatafile.SVB_smry_pop_reg_h_Data);  
		
		
	    cf.Clickandwait(object.SVB_smry_pop_login_bv,object.SVB_login_h);
	    
		cf.isTextPresent(SessionID,object.SVB_login_h, TestDatafile.SVB_login_h_Data);
		cf.isTextPresent(SessionID,object.SVB_login_c, TestDatafile.SVB_login_c_Data);
		cf.isTextPresent(SessionID,object.SVB_login_ec, TestDatafile.SVB_login_ec_Data);
		cf.Inputbox(object.SVB_login_ev, TestDatafile.SVB_login_ev_Data);
		cf.isTextPresent(SessionID,object.SVB_login_pc, TestDatafile.SVB_login_pc_Data);
		cf.Inputbox(object.SVB_login_pv, TestDatafile.SVB_login_pv_Data);
		cf.isTextPresent(SessionID,object.SVB_login_forg_pwd, TestDatafile.SVB_login_forg_pwd_Data);
		
		object.SVB_login_chk.click();
		
			
		cf.isTextPresent(SessionID,object.SVB_login_chkc, TestDatafile.SVB_login_chkc_Data);
		cf.isTextPresent(SessionID,object.SVB_login_login, TestDatafile.SVB_login_login_Data); 
		
	    cf.Clickandwait(object.SVB_login_login,object.SVB_smry);
	    cf.Clickandwait(object.SVB_smry,object.SVB_pop_h);
	    
	    cf.isTextPresent(SessionID,object.SVB_pop_h, TestDatafile.SVB_pop_h_Data);
		cf.CheckWebImage(SessionID,object.SVB_image, TestDatafile.SVB_image_Data);
		cf.isTextPresent(SessionID,object.SVB_paint, TestDatafile.SVB_paint_Data);
		cf.isTextPresent(SessionID,object.SVB_leather_n, TestDatafile.SVB_leather_n_Data);
		cf.CheckWebImage(SessionID,object.SVB_leather_i, TestDatafile.SVB_leather_i_Data);
	    cf.isTextPresent(SessionID,object.SVB_model_n, TestDatafile.SVB_model_n_Data);
	    cf.isTextPresent(SessionID,object.SVB_model_price, TestDatafile.SVB_model_price_Data);
	    cf.isTextPresent(SessionID,object.SVB_copy, TestDatafile.SVB_copy_Data);
	    cf.isTextPresent(SessionID,object.SVB_model_nickname_h, TestDatafile.SVB_model_nickname_h_Data);
	    cf.isTextPresent(SessionID,object.SVB_model_default_n, TestDatafile.SVB_model_default_n_Data);
	        
	    
	    object.SVB_name_edit_i.click();
	   // cf.isTextPresent(SessionID,object.SVB_name_edit_i, TestDatafile.SVB_name_edit_i_Data);
	    cf.Inputbox(object.SVB_model_nickname, TestDatafile.SVB_model_nickname_Data);
	    object.SVB_nickname_f.click();
	   // cf.isTextPresent(SessionID,object.SVB_nickname_f, TestDatafile.SVB_nickname_f_Data);
	    
	      
	    cf.isTextPresent(SessionID,object.SVB_note1, TestDatafile.SVB_note1_Data);
	    cf.isTextPresent(SessionID,object.SVB_note2, TestDatafile.SVB_note2_Data);
	    cf.isTextPresent(SessionID,object.SVB_button_value, TestDatafile.SVB_button_value_Data);  
	    
	    
	    cf.Clickandwait(object.SVB_savebuild_b,object.SVB_view_SVB);
	    
	    cf.isTextPresent(SessionID,object.SVB_view_SVB, TestDatafile.SVB_view_SVB_Data);
	    cf.isTextPresent(SessionID,object.SVB_b_final_value, TestDatafile.SVB_b_final_value);  
		
	   
	    cf.Clickandwait(object.SVB_view_SVB,object.SVB_P_CTA);
	    
	  
	    cf.Clickandwait(object.SVB_P_CTA,object.SVB_P_head);
	    
	    cf.isTextPresent(SessionID,object.SVB_P_head, TestDatafile.SVB_P_head_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_acc_info, TestDatafile.SVB_P_acc_info_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_acc_emailc, TestDatafile.SVB_P_acc_emailc_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_acc_emailv, TestDatafile.SVB_P_acc_emailv_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_acc_pwdc, TestDatafile.SVB_P_acc_pwdc_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_info, TestDatafile.SVB_P_cnt_info_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infoe, TestDatafile.SVB_P_cnt_infoe_Data);  
	   
	    cf.Clickandwait(object.SVB_P_cnt_infoe,object.SVB_P_cnt_infoc);
	    
	    cf.Inputbox(object.SVB_P_cnt_info_add, TestDatafile.SVB_P_cnt_info_add_Data);
	    
	    cf.Clickandwait(object.SVB_P_cnt_infos,object.SVB_P_cnt_infoe);
	    
	    cf.Clickandwait(object.SVB_P_cnt_infoe,object.SVB_P_cnt_infoc);
	    
  cf.isTextPresent(SessionID,object.SVB_P_cnt_infonameh, TestDatafile.SVB_P_cnt_infonameh_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infonamev, TestDatafile.SVB_P_cnt_infonamev_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infoaddh, TestDatafile.SVB_P_cnt_infoaddh_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infoaddv, TestDatafile.SVB_P_cnt_infoaddv_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infonumh, TestDatafile.SVB_P_cnt_infonumh_Data);
	    cf.isTextPresent(SessionID,object.SVB_P_cnt_infonumv, TestDatafile.SVB_P_cnt_infonumv_Data);  
	    
	    cf.Clickandwait(object.SVB_i_CTA,object.SVB_i_head);
	    
	  cf.isTextPresent(SessionID,object.SVB_i_head, TestDatafile.SVB_i_head_Data);
	    cf.isTextPresent(SessionID,object.SVB_i_copy, TestDatafile.SVB_i_copy_Data);
	    cf.isTextPresent(SessionID,object.SVB_i_button, TestDatafile.SVB_i_button_Data); 
	    
	    cf.Clickandwait(object.SVB_c_CTA,object.SVB_c_head);
	    
 cf.isTextPresent(SessionID,object.SVB_c_head, TestDatafile.SVB_c_head_Data);
	    cf.isTextPresent(SessionID,object.SVB_c_copy, TestDatafile.SVB_c_copy_Data);
	    cf.isTextPresent(SessionID,object.SVB_c_button, TestDatafile.SVB_c_button_Data);
	    
	    cf.isTextPresent(SessionID,object.SVB_global_image, TestDatafile.SVB_global_image_Data);
	    cf.isTextPresent(SessionID,object.SVB_global_copy, TestDatafile.SVB_global_copy_Data);
	    cf.isTextPresent(SessionID,object.SVB_global_CTA, TestDatafile.SVB_global_CTA_Data);   
	    
	  
	    cf.Clickandwait(object.SVB_FSB_CTA,object.SVB_FSB_head);
	    
	    //cf.isTextPresent(SessionID,object.SVB_FSB_CTA, TestDatafile.SVB_FSB_CTA_Data);
	   cf.isTextPresent(SessionID,object.SVB_FSB_head, TestDatafile.SVB_FSB_head_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_sort, TestDatafile.SVB_FSB_sort_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_modelname, TestDatafile.SVB_FSB_modelname_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_modelprice, TestDatafile.SVB_FSB_modelprice_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_modelnk, TestDatafile.SVB_FSB_modelnk_Data);
	    cf.CheckWebImage(SessionID,object.SVB_FSB_exterior, TestDatafile.SVB_FSB_exterior_Data);
	    cf.CheckWebImage(SessionID,object.SVB_FSB_interior, TestDatafile.SVB_FSB_interior_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_EX_colorh, TestDatafile.SVB_FSB_EX_colorh_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_EX_colorn, TestDatafile.SVB_FSB_EX_colorn_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_IN_colorh, TestDatafile.SVB_FSB_IN_colorh_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_IN_colori, TestDatafile.SVB_FSB_IN_colori_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_IN_colorn, TestDatafile.SVB_FSB_IN_colorn_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_inventryCTA, TestDatafile.SVB_FSB_inventryCTA_Data);
	  //  cf.isTextPresent(SessionID,object.SVB_FSB_separator, TestDatafile.SVB_FSB_separator_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_buildCTA, TestDatafile.SVB_FSB_buildCTA_Data);
	   // cf.isTextPresent(SessionID,object.SVB_FSB_print, TestDatafile.SVB_FSB_print_Data);
	   // cf.isTextPresent(SessionID,object.SVB_FSB_email, TestDatafile.SVB_FSB_email_Data);
	   // cf.isTextPresent(SessionID,object.SVB_FSB_delete, TestDatafile.SVB_FSB_delete_Data);
	    cf.isTextPresent(SessionID,object.SVB_FSB_account, TestDatafile.SVB_FSB_account_Data);  
	    
	    //object.SVB_FSB_account.click();
	    cf.Clickandwait(object.SVB_FSB_account,object.SVB_FSB_account_logout);
	    
	    cf.isTextPresent(SessionID,object.SVB_FSB_account_logout, TestDatafile.SVB_FSB_account_logout_Data);
	    
	    //object.SVB_FSB_account_logout.click();
	    cf.Clickandwait(object.SVB_FSB_account_logout,object.savebuild);
	    
	      
	    
	}
}
