package com.mbusa.theampage.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Warrenty extends Launch {
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void FAQ() throws Exception
	{
		
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		System.out.println(" Execution Started");
		String SessionID = "5";
		driver.navigate().to("https://www.mbusa.com/mercedes/service_and_parts/service_and_repairs#warranty");
		Thread.sleep(500);
		Reporter.GeneralUpdate("ID 5", "Warrenty", "Execution Started");	
		cf.isTextPresent(SessionID,object.Warrenty_Hero_Carousal_heading_1, TestDatafile.Warrenty_Hero_Carousal_heading_1);
		cf.isTextPresent(SessionID,object.Warrenty_Hero_Carousal_heading_2, TestDatafile.Warrenty_Hero_Carousal_heading_2);
		cf.isTextPresent(SessionID,object.Warrenty_Hero_Carousal_para,TestDatafile.Warrenty_Hero_Carousal_para);
		cf.CheckWebImage(SessionID,object.Warrenty_Hero_Carousal_Img, TestDatafile.Warrenty_Hero_Carousal_Img);
		cf.imagevalidation(SessionID,object.Warrenty_Hero_Carousal_Img);
		cf.Linknavigation(SessionID,object.Warrenty_Hero_Carousal_back_button, TestDatafile.Warrenty_Hero_Carousal_back_button);
		cf.Linkvalidation(SessionID,object.Warrenty_Hero_Carousal_back_button);
		
		
		
		
		
		for(int i=0;i<=5;i++){
			
			cf.Click(driver.findElement(By.xpath("//nav[@id='sub-nav-v2']/div/ul/li["+(i+1)+"]/a")));
			
			
		if(i==0){
			
			cf.isTextPresent(SessionID,object.Warrenty_ROADSIDE_Assistance_heading_1, TestDatafile.Warrenty_ROADSIDE_Assistance_heading_1);
			cf.isTextPresent(SessionID,object.Warrenty_ROADSIDE_Assistance_heading_2, TestDatafile.Warrenty_ROADSIDE_Assistance_heading_2);
			cf.isTextPresent(SessionID,object.Warrenty_ROADSIDE_Assistance_para, TestDatafile.Warrenty_ROADSIDE_Assistance_para);
			cf.CheckWebImage(SessionID,object.Warrenty_ROADSIDE_Assistance_image, TestDatafile.Warrenty_ROADSIDE_Assistance_image);
			cf.imagevalidation(SessionID,object.Warrenty_ROADSIDE_Assistance_image);
			cf.Linknavigation(SessionID,object.Warrenty_ROADSIDE_Assistance_learnmore_link, TestDatafile.Warrenty_ROADSIDE_Assistance_learnmore_link);
			//cf.Linkvalidation(SessionID,object.Warrenty_ROADSIDE_Assistance_learnmore_link);
			    }
		
       if(i==1){
			

            cf.isTextPresent(SessionID,object.Warrenty_Certified_collision_heading_1, TestDatafile.Warrenty_Certified_collision_heading_1);
			cf.isTextPresent(SessionID,object.Warrenty_Certified_collision_heading_2, TestDatafile.Warrenty_Certified_collision_heading_2);
			cf.isTextPresent(SessionID,object.Warrenty_Certified_collision_para, TestDatafile.Warrenty_Certified_collision_para);
			cf.CheckWebImage(SessionID,object.Warrenty_Certified_collision_image, TestDatafile.Warrenty_Certified_collision_image);
			cf.imagevalidation(SessionID,object.Warrenty_Certified_collision_image);
			cf.Linknavigation(SessionID,object.Warrenty_Certified_collision_Find_a_collsion_link, TestDatafile.Warrenty_Certified_collision_Find_a_collsion_link);
			cf.Linkvalidation(SessionID,object.Warrenty_Certified_collision_Find_a_collsion_link);
			    
			
			    }
		
		
       if(i==2){
			


    	            cf.isTextPresent(SessionID,object.Warrenty_First_Class_Insurance_heading_1, TestDatafile.Warrenty_First_Class_Insurance_heading_1);
    	  			cf.isTextPresent(SessionID,object.Warrenty_First_Class_Insurance_heading_2, TestDatafile.Warrenty_First_Class_Insurance_heading_2);
    	  			cf.isTextPresent(SessionID,object.Warrenty_First_Class_Insurance_para, TestDatafile.Warrenty_First_Class_Insurance_para);
    	  			
    	  			cf.CheckWebImage(SessionID,object.Warrenty_First_Class_Insurance_image, TestDatafile.Warrenty_First_Class_Insurance_image);
    				cf.imagevalidation(SessionID,object.Warrenty_First_Class_Insurance_image);
    				cf.Linknavigation(SessionID,object.Warrenty_First_Class_Insurance_learnmore_link, TestDatafile.Warrenty_First_Class_Insurance_learnmore_link);
    				cf.Linkvalidation(SessionID,object.Warrenty_First_Class_Insurance_learnmore_link);
    				    
			
			    }
		
       if(i==3){
			


          cf.isTextPresent(SessionID,object.Warrenty_warrenty_heading_1, TestDatafile.Warrenty_warrenty_heading_1);
 			cf.isTextPresent(SessionID,object.Warrenty_warrenty_heading_2, TestDatafile.Warrenty_warrenty_heading_2);
 			cf.isTextPresent(SessionID,object.Warrenty_warrenty_para, TestDatafile.Warrenty_warrenty_para);
 			cf.isTextPresent(SessionID,object.Warrenty_warrenty_subheading_1, TestDatafile.Warrenty_warrenty_subheading_1);
 			cf.isTextPresent(SessionID,object.Warrenty_warrenty_subheading_2, TestDatafile.Warrenty_warrenty_subheading_2);
 	        
 			int count=0;
 			for(int j=0;j<2;j++){
 				
 				for(int k=0;k<2;k++){
 					
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[1]/div["+(j+1)+"]/div/div["+(k+1)+"]/h3")), TestDatafile.Warrenty_New_Vehicle_Heading_1[count]);
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[1]/div["+(j+1)+"]/div/div["+(k+1)+"]/table/tbody")), TestDatafile.Warrenty_New_Vehicle_milage[count]);
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[1]/div["+(j+1)+"]/div/div["+(k+1)+"]/div[1]")), TestDatafile.Warrenty_New_Vehicle_copy[count]);
 					cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[1]/div["+(j+1)+"]/div/div["+(k+1)+"]/div[2]/a")),TestDatafile.Warrenty_New_Vehicle_learnmore_link[count]);
 					
 					++count;
 				
 				}
 				
 				
 				
 				
 				
 			}
	
 			for(int j=0;j<=2;j++){
 				
 				
 				
 				if(j!=2){
 					
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/h3/a")), TestDatafile.Warrenty_vehicles_heading[j]);
 	 				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/p")), TestDatafile.Warrenty_vehicles_copy[j]);
 					
 					cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/h3/a")), TestDatafile.Warrenty_vehicles_heading_link[j]);
 				    cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/h3/a")));
 				
 				   cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/div/a")), TestDatafile.Warrenty_vehicles_link[j]);
 				   cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div["+(j+1)+"]/div/div[2]/div/a")));
 					

 				      }
 				
 				else if(j==2){
 					
 					cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div[3]/div/div[2]/h3/span")), TestDatafile.Warrenty_vehicles_heading[j]);
 	 				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='warranty']/div[2]/div[3]/div/div[2]/p")), TestDatafile.Warrenty_vehicles_copy[j]);
 					
 				}
 				
 				
 				 				
 			}
 			
 			
 			
 			
 			
 			
	    }
		
		if(i==4){
			
		
            cf.isTextPresent(SessionID,object.Warrenty_Genune_MBUSA_Parts_heading_1, TestDatafile.Warrenty_Genune_MBUSA_Parts_heading_1);
  			cf.isTextPresent(SessionID,object.Warrenty_Genune_MBUSA_Parts_heading_2, TestDatafile.Warrenty_Genune_MBUSA_Parts_heading_2);
  			cf.isTextPresent(SessionID,object.Warrenty_Genune_MBUSA_Parts_para, TestDatafile.Warrenty_Genune_MBUSA_Parts_para);
  			
		
  			cf.CheckWebImage(SessionID,object.Warrenty_Genune_MBUSA_Parts_image, TestDatafile.Warrenty_Genune_MBUSA_Parts_image);
			cf.imagevalidation(SessionID,object.Warrenty_Genune_MBUSA_Parts_image);
			cf.Linknavigation(SessionID,object.Warrenty_Genune_MBUSA_Parts_learnmore_link, TestDatafile.Warrenty_Genune_MBUSA_Parts_learnmore_link);
			cf.Linkvalidation(SessionID,object.Warrenty_Genune_MBUSA_Parts_learnmore_link);
			  
			
	
		}
		
		if(i==5){
			

            cf.isTextPresent(SessionID,object.Warrenty_Small_Repairs_heading_1, TestDatafile.Warrenty_Small_Repairs_heading_1);
  			cf.isTextPresent(SessionID,object.Warrenty_Small_Repairs_heading_2, TestDatafile.Warrenty_Small_Repairs_heading_2);
  			cf.isTextPresent(SessionID,object.Warrenty_Small_Repairs_para, TestDatafile.Warrenty_Small_Repairs_para);
  		    cf.CheckWebImage(SessionID,object.Warrenty_Small_Repairs_image, TestDatafile.Warrenty_Small_Repairs_image);
			cf.imagevalidation(SessionID,object.Warrenty_Small_Repairs_image);
			cf.Linknavigation(SessionID,object.Warrenty_Small_Repairs_learnmore_link, TestDatafile.Warrenty_Small_Repairs_learnmore_link);
			cf.Linkvalidation(SessionID,object.Warrenty_Small_Repairs_learnmore_link);
			  
			
	
		}
		
		
       
		
   		
		
			
	
		
		
		
		}
		
		
 	   cf.isTextPresent(SessionID,object.PPM_Featured, TestDatafile.Warrenty_Featured);
 	   for(int j=0;j<3;j++){
			
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(j+1)+"]/div[2]/h2")),TestDatafile.Warrentytitle[j]);
			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(j+1)+"]/div[1]/a/img")),TestDatafile.Warrentyimg[j]);
			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='explore-mbService']/div[2]/div["+(j+1)+"]/div[2]/h3/a")),TestDatafile.Warrentylink[j]);
		}
		
		
			
		System.out.println(" Execution Ended");
	}

}
