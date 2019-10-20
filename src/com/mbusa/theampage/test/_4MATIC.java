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



public class _4MATIC extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "22";
	
	
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		
		Reporter.GeneralUpdate("ID 22", "4MATIC", "Execution Started");
		driver.navigate().to("https://www.mbusa.com/mercedes/benz/performance/4matic");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		
		
		
		
		
		cf.isTextPresent(SessionID,object.MATIC_main_header,TestDatafile.MATIC_main_header);
		cf.isTextPresent(SessionID,object.MATIC_main_title,TestDatafile.MATIC_main_title);
		cf.isTextPresent(SessionID,object.MATIC_main_para,TestDatafile.MATIC_main_para);
		cf.CheckWebImage(SessionID,object.MATIC_main_image,TestDatafile.MATIC_main_image);
		cf.imagevalidation(SessionID, object.MATIC_main_image);
		
		cf.isTextPresent(SessionID,object.MATIC_sub_title,TestDatafile.MATIC_sub_title);
		cf.isTextPresent(SessionID,object.MATIC_avaialbe_text,TestDatafile.MATIC_avaialbe_text);
		cf.isTextPresent(SessionID,object.MATIC_Greater_control_title,TestDatafile.MATIC_Greater_control_title);
		cf.isTextPresent(SessionID,object.MATIC_sub_Greater_control_title,TestDatafile.MATIC_sub_Greater_control_title);
		cf.isTextPresent(SessionID,object.MATIC_sub_Greater_control_copy,TestDatafile.MATIC_sub_Greater_control_copy);
		cf.CheckWebImage(SessionID,object.MATIC_sub_Greater_control_image,TestDatafile.MATIC_sub_Greater_control_image);
		cf.imagevalidation(SessionID, object.MATIC_sub_Greater_control_image);
		
		cf.isTextPresent(SessionID,object.MATIC_Social_links, TestDatafile.MATIC_Social_links);
		
		
		for(int i=0;i<=2;i++){
			cf.mouseover(object.MATIC_Social_links, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[3]/div/div/div/div/ul/li["+(i+1)+"]/a")));
			Thread.sleep(2000);
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[3]/div/div/div/div/ul/li["+(i+1)+"]/a")), social_text[i]);
			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[3]/div/div/div/div/ul/li["+(i+1)+"]/a")),MATIC_social_text_link[i]);
			cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[3]/div/div/div/div/ul/li["+(i+1)+"]/a")));
			
		}
		
		for(int i=0;i<=3;i++){
			
			if(i==0||i==1){
			
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[2]/ul[1]/li["+(i+1)+"]/a")),TestDatafile.MATIC_links_title[i]);
			}
			
			else if(i==2){
				
				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[2]/ul[2]/li[1]/a")),TestDatafile.MATIC_links_title[i]);	
				
			}
		
		}
		
         for(int i=0;i<9;i++){
        	 
        	 cf.Javascriptmouseover(driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/a")));
 			
 			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/a")),TestDatafile.MATIC_car_classpage_link[i]);
 			cf.Linkvalidation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/a")));
 			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/a")),TestDatafile.MATIC_car_classpage_link_title[i]);
 			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/h5/a")),TestDatafile.MATIC_car_modelpage_link[i]);
 			cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/h5/a")));
 			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/h5/a")),TestDatafile.MATIC_car_modelpage_link_Text[i]);
 			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[1]/a")),TestDatafile.MATIC_car_modelpage_link_price[i]);
 			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/a/img")),TestDatafile.MATIC_car_classmodelpage_link_image[i]);
  		    cf.imagevalidation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/a/img")));
 			if(i==1||i==2||i==3){
 				//cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[2]/text()[1]")), TestDatafile.MATIC_Also_title);
 				cf.Linknavigation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[2]/a[1]")), TestDatafile.MATIC_car_Also_link_1[i]);
 				cf.Linknavigation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[2]/a[2]")), TestDatafile.MATIC_car_Also_link_2[i]);
 				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[2]/a[1]")), TestDatafile.MATIC_car_Also_link_1_text);
 				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li["+(i+1)+"]/div/div/p[2]/a[2]")), TestDatafile.MATIC_car_Also_link_2_text[i]);
 			}
 			if(i==6){
 				
 				//cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li[7]/div/div/p[2]/text()[1]")), TestDatafile.MATIC_Also_title);
 				cf.Linknavigation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li[7]/div/div/p[2]/a")), TestDatafile.MATIC_car_Also_link_3);
 				cf.imagevalidation(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li[7]/div/div/p[2]/a")));
 				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div/div[4]/ul/li[7]/div/div/p[2]/a")), TestDatafile.MATIC_car_Also_link_1_text);
 				
 			}
 			
         
         }
		
		
		
		
		
		
		cf.isTextPresent(SessionID,object.MATIC_4_ETS_turns_title,TestDatafile.MATIC_4_ETS_turns_title);
        cf.isTextPresent(SessionID,object.MATIC_4_ETS_turns_para,TestDatafile.MATIC_4_ETS_turns_para);
	    cf.CheckWebImage(SessionID,object.MATIC_4_ETS_turns_image,TestDatafile.MATIC_4_ETS_turns_image);
	    cf.imagevalidation(SessionID, object.MATIC_4_ETS_turns_image);
	    cf.isTextPresent(SessionID,object.MATIC_4_ETS_turns_image_play_button,TestDatafile.MATIC_4_ETS_turns_image_play_button);
		
		cf.isTextPresent(SessionID,object.MATIC_Elegantly_simple_title,TestDatafile.MATIC_Elegantly_simple_title);
		cf.isTextPresent(SessionID,object.MATIC_Elegantly_simple_para,TestDatafile.MATIC_Elegantly_simple_para);
		cf.CheckWebImage(SessionID,object.MATIC_Elegantly_simple_image,TestDatafile.MATIC_Elegantly_simple_image);
		cf.imagevalidation(SessionID, object.MATIC_Elegantly_simple_image);
		
	    cf.isTextPresent(SessionID,object.MATIC_At_home_in_title,TestDatafile.MATIC_At_home_in_title);
		cf.isTextPresent(SessionID,object.MATIC_At_home_in_para,TestDatafile.MATIC_At_home_in_para);
		cf.CheckWebImage(SessionID,object.MATIC_At_home_in_image,TestDatafile.MATIC_At_home_in_image);
		cf.imagevalidation(SessionID, object.MATIC_At_home_in_image);
		cf.isTextPresent(SessionID,object.MATIC_At_home_in_image_play_button,TestDatafile.MATIC_At_home_in_image_play_button);
		
		cf.isTextPresent(SessionID,object.MATIC_Changing_seasons_title,TestDatafile.MATIC_Changing_seasons_title);
		cf.isTextPresent(SessionID,object.MATIC_Changing_seasons_sub_title,TestDatafile.MATIC_Changing_seasons_sub_title);
		cf.isTextPresent(SessionID,object.MATIC_Changing_seasons_para,TestDatafile.MATIC_Changing_seasons_para);
	
		String[] str=driver.findElement(By.xpath("//div[@id='module-3']/div/div/div[1]/div[2]/table/tbody/tr/td[3]")).getText().split(" of ");
		System.out.println(str[1]);
		int rm=Integer.parseInt(str[1]);
		for(int i=0;i<rm;i++){
			
          
		   cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-3']/div/div/div[1]/div[2]/table/tbody/tr/td[2]/p")),TestDatafile.MATIC_Changing_seasons_image_text[i]);
			
		   cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//ul[@id='slideshow-1']/li["+(i+1)+"]/img")),TestDatafile.MATIC_Changing_seasons_image[i]);
		   cf.imagevalidation(SessionID, driver.findElement(By.xpath("//ul[@id='slideshow-1']/li["+(i+1)+"]/img")));
		   if(i!=rm-1){	//5 of 5 click is not requried
		   cf.Click(driver.findElement(By.xpath("//div[@id='module-3']/div/div/div[1]/div[2]/table/tbody/tr/td[1]/ul/li[3]/a")));
			}
		}
		//checking for "Prev" Button
		cf.Click(driver.findElement(By.xpath("//div[@id='module-3']/div/div/div[1]/div[2]/table/tbody/tr/td[1]/ul/li[2]/a")));
		
		cf.isTextPresent(SessionID,object.MATIC_Fact__and_Friction_title,TestDatafile.MATIC_Fact__and_Friction_title);
		cf.isTextPresent(SessionID,object.MATIC_Fact__and_Friction_sub_title,TestDatafile.MATIC_Fact__and_Friction_sub_title);
           for(int i=0;i<4;i++){
			
					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-4']/div/div/div/div[2]/div/div["+(i+1)+"]/h4")),TestDatafile.MATIC_Fact_and_Friction_text[i]);
				
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-4']/div/div/div/div[2]/div/div["+(i+1)+"]/p")),TestDatafile.MATIC_Fact_and_Friction_copy[i]);
 				
 			}
           
          
        cf.isTextPresent(SessionID,object.MATIC_An_all_wheel_title,TestDatafile.MATIC_An_all_wheel_title);
   		cf.isTextPresent(SessionID,object.MATIC_An_all_wheel_sub_title,TestDatafile.MATIC_An_all_wheel_sub_title);
   		cf.isTextPresent(SessionID,object.MATIC_An_all_wheel_para,TestDatafile.MATIC_An_all_wheel_para); 
          
        cf.Linknavigation(SessionID,object.MATIC_An_all_wheel_link,TestDatafile.MATIC_An_all_wheel_link);  
        cf.isTextPresent(SessionID,object.MATIC_An_all_wheel_link,TestDatafile.MATIC_An_all_wheel_link_title);
        cf.CheckWebImage(SessionID,object.MATIC_An_all_wheel_image,TestDatafile.MATIC_An_all_wheel_image);
        cf.imagevalidation(SessionID, object.MATIC_An_all_wheel_image);
        cf.isTextPresent(SessionID,object.MATIC_A_TIMELINE_OF_TRACTION,TestDatafile.MATIC_A_TIMELINE_OF_TRACTION);
        
        for(int i=1;i<13;i++){
   			
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-5']/div/div/div[1]/table/tbody/tr["+(i+1)+"]/td[1]")),TestDatafile.MATIC_year[i]);
 		            cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-5']/div/div/div[1]/table/tbody/tr["+(i+1)+"]/td[2]")),TestDatafile.MATIC_year_copy[i]);
  				
  			}
           
          cf.isTextPresent(SessionID,object.MATIC_last_title,TestDatafile.MATIC_last_title);
          cf.isTextPresent(SessionID,object.MATIC_last_sub_title,TestDatafile.MATIC_last_sub_title);
           
           for(int i=0;i<6;i++){
     			
   					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='module-6']/div/div/ul/li["+(i+1)+"]/a")),TestDatafile.MATIC_last_link_title[i]);
   				
    			     cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='module-6']/div/div/ul/li["+(i+1)+"]/a")),TestDatafile.MATIC_last_link[i]);
    				cf.Linkvalidation(SessionID, driver.findElement(By.xpath("//div[@id='module-6']/div/div/ul/li["+(i+1)+"]/a")));
    			}
            
           cf.CheckWebImage(SessionID,object.MATIC_last_image,TestDatafile.MATIC_last_image);
           cf.imagevalidation(SessionID, object.MATIC_last_image);
           for(int i=1;i<=5;i++){
        	   
        	 cf.isButtonfound(SessionID, driver.findElement(By.xpath("//div[@id='module-"+i+"']/p/a")));  
        	   
           }
		System.out.println(" Execution End");
		
		
	}
}
