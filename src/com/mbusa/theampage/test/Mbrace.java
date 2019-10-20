
package com.mbusa.theampage.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Mbrace extends Launch 

{

       commonfunctions cf = new commonfunctions();
       String SessionID="20";
       @Test
       public void Mbrace() throws Exception
       {
              
     objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
     driver.navigate().to("https://www.mbusa.com/mercedes/mbrace#waypoint=way_faq");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 20", "Mbrace - Execution Started ", "");
     cf.scrolldown(driver, object.Hero_Carousel_Img);    
     cf.isTextPresent(SessionID,object.Hero_Carousel_Heading, TestDatafile.Hero_Carousel_Heading_Data);
     cf.isTextPresent(SessionID,object.Hero_Carousel_Heading2, TestDatafile.Hero_Carousel_Heading2_Data);
     cf.CheckWebImage(SessionID,object.Hero_Carousel_Img, TestDatafile.Hero_Carousel_Img_Data);
     
     cf.isTextPresent(SessionID,object.Body_Heading1, TestDatafile.Body_Heading1_Data);
     cf.isTextPresent(SessionID,object.Body_Heading2, TestDatafile.Body_Heading2_Data);
     cf.isTextPresent(SessionID,object.Body_Heading3, TestDatafile.Body_Heading3_Data);
     cf.CheckWebImage(SessionID,object.Body_Img, TestDatafile.Body_Img_Data);
     
     cf.Linknavigation(SessionID,object.Body_Heading1_Link, TestDatafile.Body_Heading1_Link_Data);
     cf.Linkvalidation(SessionID,object.Body_Heading1_Link);
          
     List<WebElement> list1=driver.findElements(By.xpath("//nav[@id='sub-nav-v2']/div/ul[2]//child::a"));
     for(int i=0;i<list1.size();i++)
     {
           
        cf.isTextPresent(SessionID,list1.get(i),TestDatafile.Sub_Nav_List1_Data[i]);
           cf.Linknavigation(SessionID,list1.get(i),TestDatafile.Sub_NavLink_List1_Data[i]);
           cf.Linkvalidation(SessionID,list1.get(i));
           cf.Click(list1.get(i));
           if(i==0)
           {
            cf.Javascriptmouseover(object.MB_SideNav1);
            cf.isTextPresent(SessionID,object.MB_SideNav1, TestDatafile.MB_SideNav1_Data);
            cf.Click(object.MB_SideNav1_1);  

              cf.CheckWebImage(SessionID,object.Remote_Access_Img, TestDatafile.Remote_Access_Img_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_Heading1, TestDatafile.Remote_Access_Heading1_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_Heading2, TestDatafile.Remote_Access_Heading2_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_Heading3, TestDatafile.Remote_Access_Heading3_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_Heading4, TestDatafile.Remote_Access_Heading4_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1, TestDatafile.Remote_Access_DropDown1_Data);
              cf.Click(object.Remote_Access_DropDown1);
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_1, TestDatafile.Remote_Access_DropDown1_1_Data);
              
              for(int j=0;j<13;j++)
              {
                     
                     cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_connect']/div/div[2]/div[1]/ul/li["+(j+1)+"]/p[1]")), TestDatafile.Remote_Access_DropDown1_2_Data[j]);
                                       
              }
              
              for(int k=0;k<13;k++)
              {
              
                     cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_connect']/div/div[2]/div[1]/ul/li["+(k+1)+"]/p[2]")), TestDatafile.Remote_Access_DropDown1_3_Data[k]);
                            
              }
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_4, TestDatafile.Remote_Access_DropDown1_4_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_5, TestDatafile.Remote_Access_DropDown1_5_Data);

              for(int l=0;l<9;l++)
              {
                     
                     cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_connect']/div/div[2]/div[2]/ul/li["+(l+1)+"]/p[1]")), TestDatafile.Remote_Access_DropDown1_6_Data[l]);
                     
              }
              
              for(int m=0;m<9;m++)
              {
                     
                      cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_connect']/div/div[2]/div[2]/ul/li["+(m+1)+"]/p[2]")), TestDatafile.Remote_Access_DropDown1_7_Data[m]);
                            
              }
                     
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_8, TestDatafile.Remote_Access_DropDown1_8_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_9, TestDatafile.Remote_Access_DropDown1_9_Data);
              cf.isTextPresent(SessionID,object.Remote_Access_DropDown1_10, TestDatafile.Remote_Access_DropDown1_10_Data);
              
           }  
           
          if(i==1)
          {
                 
                 cf.Javascriptmouseover(object.MB_SideNav2);
    cf.isTextPresent(SessionID,object.MB_SideNav2, TestDatafile.MB_SideNav2_Data);
    cf.Click(object.MB_SideNav1_2);
                 
                  cf.CheckWebImage(SessionID,object.Safety_Security_Img, TestDatafile.Safety_Security_Img_Data);
              cf.isTextPresent(SessionID,object.Safety_Security_Heading1, TestDatafile.Safety_Security_Heading1_Data);
              cf.isTextPresent(SessionID,object.Safety_Security_Heading2, TestDatafile.Safety_Security_Heading2_Data);
              cf.isTextPresent(SessionID,object.Safety_Security_Heading3, TestDatafile.Safety_Security_Heading3_Data);
              cf.isTextPresent(SessionID,object.Safety_Security_Heading4, TestDatafile.Safety_Security_Heading4_Data);
              cf.isTextPresent(SessionID,object.Safety_Security_DropDown2, TestDatafile.Safety_Security_DropDown2_Data);
              cf.Click(object.Safety_Security_DropDown2);
             cf.isTextPresent(SessionID,object.Safety_Security_DropDown2_1, TestDatafile.Safety_Security_DropDown2_1_Data); 
                 
                for(int j=0;j<9;j++)
                {
                         cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_secure']/div/div[2]/div/ul/li["+(j+1)+"]/p[1]")), TestDatafile.Safety_Security_DropDown2_2_Data[j]);
                }

                for(int k=0;k<9;k++)
                {
                      cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_secure']/div/div[2]/div/ul/li["+(k+1)+"]/p[2]")), TestDatafile.Safety_Security_DropDown2_3_Data[k]);
                }
           
          }
         
         if(i==2)
         {
         
               cf.Javascriptmouseover(object.MB_SideNav3);
    cf.isTextPresent(SessionID,object.MB_SideNav3, TestDatafile.MB_SideNav3_Data);
    cf.Click(object.MB_SideNav1_3);
  
         
              cf.CheckWebImage(SessionID,object.Travel_Assistance_Img, TestDatafile.Travel_Assistance_Img_Data);
       cf.isTextPresent(SessionID,object.Travel_Assistance_Heading1, TestDatafile.Travel_Assistance_Heading1_Data);
       cf.isTextPresent(SessionID,object.Travel_Assistance_Heading2, TestDatafile.Travel_Assistance_Heading2_Data);
       cf.isTextPresent(SessionID,object.Travel_Assistance_Heading3, TestDatafile.Travel_Assistance_Heading3_Data);
       cf.isTextPresent(SessionID,object.Travel_Assistance_Heading4, TestDatafile.Travel_Assistance_Heading4_Data);
       cf.isTextPresent(SessionID,object.Travel_Assistance_DropDown3, TestDatafile.Travel_Assistance_DropDown3_Data);
       cf.Click(object.Travel_Assistance_DropDown3);
       cf.isTextPresent(SessionID,object.Travel_Assistance_DropDown3_1, TestDatafile.Travel_Assistance_DropDown3_1_Data); 
       
       for(int j=0;j<5;j++)
           {
                      cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_concierge']/div/div[2]/div/ul/li["+(j+1)+"]/p[1]")), TestDatafile.Travel_Assistance_DropDown3_2_Data[j]);
           }

           for(int k=0;k<5;k++)
           {
                  cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_concierge']/div/div[2]/div/ul/li["+(k+1)+"]/p[2]")), TestDatafile.Travel_Assistance_DropDown3_3_Data[k]);
           }
          
         }
         
        if(i==3)
        {
        
        cf.Javascriptmouseover(object.MB_SideNav4);
    cf.isTextPresent(SessionID,object.MB_SideNav4, TestDatafile.MB_SideNav4_Data);
    cf.Click(object.MB_SideNav1_4);
    
              cf.CheckWebImage(SessionID,object.Entertainment_Img, TestDatafile.Entertainment_Img_Data);
       cf.isTextPresent(SessionID,object.Entertainment_Heading1, TestDatafile.Entertainment_Heading1_Data);
       cf.isTextPresent(SessionID,object.Entertainment_Heading2, TestDatafile.Entertainment_Heading2_Data);
       cf.isTextPresent(SessionID,object.Entertainment_Heading3, TestDatafile.Entertainment_Heading3_Data);
       cf.isTextPresent(SessionID,object.Entertainment_Heading4, TestDatafile.Entertainment_Heading4_Data);
       cf.isTextPresent(SessionID,object.Entertainment_DropDown4, TestDatafile.Entertainment_DropDown4_Data);
       cf.Click(object.Entertainment_DropDown4);
       cf.isTextPresent(SessionID,object.Entertainment_DropDown4_1, TestDatafile.Entertainment_DropDown4_1_Data); 
       
       for(int j=0;j<3;j++)
           {
                      cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_entertain']/div/div[2]/div/ul/li["+(j+1)+"]/p[1]")), TestDatafile.Entertainment_DropDown4_2_Data[j]);
                  
           }

           for(int k=0;k<3;k++)
           {
                  cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='mbrace_entertain']/div/div[2]/div/ul/li["+(k+1)+"]/p[2]")), TestDatafile.Entertainment_DropDown4_3_Data[k]);
           }
                      
        }
     
        if(i==4)
        {
  
   cf.Javascriptmouseover(object.MB_SideNav5);
    cf.isTextPresent(SessionID,object.MB_SideNav5, TestDatafile.MB_SideNav5_Data);
    cf.Click(object.MB_SideNav1_5);
        
              cf.CheckWebImage(SessionID,object.Mercedes_me_Img, TestDatafile.Mercedes_me_Img_Data);
       cf.isTextPresent(SessionID,object.Mercedes_me_Heading1, TestDatafile.Mercedes_me_Heading1_Data);
              cf.isTextPresent(SessionID,object.Mercedes_me_Heading2, TestDatafile.Mercedes_me_Heading2_Data); 
              
              cf.isTextPresent(SessionID,object.Mercedes_me_Link, TestDatafile.Mercedes_me_Link_Data);
              cf.Linknavigation(SessionID,object.Mercedes_me_Link, TestDatafile.Mercedes_me_Link1_Data);
              cf.Linkvalidation(SessionID,object.Mercedes_me_Link);

              cf.isTextPresent(SessionID,object.Mercedes_me_IOS_Link, TestDatafile.Mercedes_me_IOS_Link_Data);
              cf.Linknavigation(SessionID,object.Mercedes_me_IOS_Link, TestDatafile.Mercedes_me_IOS_Link1_Data);
              cf.Linkvalidation(SessionID,object.Mercedes_me_IOS_Link);
              
              cf.isTextPresent(SessionID,object.Mercedes_me_Andriod_Link, TestDatafile.Mercedes_me_Andriod_Link_Data);
              cf.Linknavigation(SessionID,object.Mercedes_me_Andriod_Link, TestDatafile.Mercedes_me_Andriod_Link1_Data);
              cf.Linkvalidation(SessionID,object.Mercedes_me_Andriod_Link);
              
     } 
        
        if(i==5)
        
        {
        
          cf.Javascriptmouseover(object.MB_SideNav6);
    cf.isTextPresent(SessionID,object.MB_SideNav6, TestDatafile.MB_SideNav6_Data);
    cf.Click(object.MB_SideNav1_6);
        
          cf.isTextPresent(SessionID,object.MB_FAQ_Heading1, TestDatafile.MB_FAQ_Heading1_Data);   
          
          for(int j=0;j<10;j++)
          {
                cf.isTextPresent(SessionID,driver.findElement(By.xpath("//Section[@id='way_faq']/div/div/div["+(j+1)+"]/div/div[1]")), TestDatafile.MB_FAQ_Heading1_1_Data[j]);
        cf.Click(driver.findElement(By.xpath("//Section[@id='way_faq']/div/div/div["+(j+1)+"]/div/div[1]"))); 
          }
          for(int k=0;k<10;k++)
          {
              cf.isTextPresent(SessionID,driver.findElement(By.xpath("//section[@id='way_faq']/div/div/div["+(k+1)+"]/div/div[2]")), TestDatafile.MB_FAQ_Heading1_2_Data[k]);
          }
         }
    }
     
     cf.isTextPresent(SessionID,object.Download_Brochure, TestDatafile.Download_Brochure_Data);
     cf.Linknavigation(SessionID,object.Download_Brochure, TestDatafile.Download_Brochure_Link_Data);
     cf.Linkvalidation(SessionID,object.Download_Brochure);
    
     cf.isTextPresent(SessionID,object.Sec8_Heading1, TestDatafile.Sec8_Heading1_Data);
     cf.isTextPresent(SessionID,object.Sec8_Heading2, TestDatafile.Sec8_Heading2_Data);
     cf.isTextPresent(SessionID,object.Sec8_Heading3, TestDatafile.Sec8_Heading3_Data);
     cf.isTextPresent(SessionID,object.Sec8_Heading4, TestDatafile.Sec8_Heading4_Data);
     
     cf.isTextPresent(SessionID,object.Sec8_Heading5, TestDatafile.Sec8_Heading5_Data);
     cf.Linknavigation(SessionID,object.Sec8_Heading5, TestDatafile.Sec8_Heading5_Link_Data);
     cf.Linkvalidation(SessionID,object.Sec8_Heading5);
     
     cf.isTextPresent(SessionID,object.Sec8_Heading6, TestDatafile.Sec8_Heading6_Data);
     cf.Linknavigation(SessionID,object.Sec8_Heading6, TestDatafile.Sec8_Heading6_Link_Data);
     cf.Linkvalidation(SessionID,object.Sec8_Heading6);
     
     cf.isTextPresent(SessionID,object.Sec8_Heading7, TestDatafile.Sec8_Heading7_Data);
     cf.Linknavigation(SessionID,object.Sec8_Heading7, TestDatafile.Sec8_Heading7_Link_Data);
     cf.Linkvalidation(SessionID,object.Sec8_Heading7);
     
     cf.isTextPresent(SessionID,object.Sec8_Heading8, TestDatafile.Sec8_Heading8_Data);
     
     
     cf.Linknavigation(SessionID,object.Sec8_Heading9, TestDatafile.Sec8_Heading9_Data);
     cf.Linkvalidation(SessionID,object.Sec8_Heading9);
     
     
     cf.Linknavigation(SessionID,object.Sec8_Heading10, TestDatafile.Sec8_Heading10_Data);
     cf.Linkvalidation(SessionID,object.Sec8_Heading10);
     
     cf.Linknavigation(SessionID,object.MB_FAQ_Link1, TestDatafile.MB_FAQ_Link1_Data);
     cf.Linkvalidation(SessionID,object.MB_FAQ_Link1);
     cf.Linknavigation(SessionID,object.MB_FAQ_Link2, TestDatafile.MB_FAQ_Link2_Data);
     cf.Linkvalidation(SessionID,object.MB_FAQ_Link2);
     
     cf.Click(object.MB_BackToTop);
    
     cf.isTextPresent(SessionID,object.MB_Login, TestDatafile.MB_Login_Data);
     cf.Linknavigation(SessionID,object.MB_Login, TestDatafile.MB_Login_Link_Data);
     cf.Linkvalidation(SessionID,object.MB_Login);
    
    
    
   
     
 //    cf.CheckWebImage(SessionID,object.MB_FeedBack_Link, TestDatafile.MB_FeedBack_Image_Data);
//    cf.Linknavigation(SessionID,object.MB_FeedBack_Link, TestDatafile.MB_FeedBack_Link_Data);
//    cf.Linkvalidation(SessionID,object.MB_FeedBack_Link);
     
     
       }
       
   		
   		

   
}
