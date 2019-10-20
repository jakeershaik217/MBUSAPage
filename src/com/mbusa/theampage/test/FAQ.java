
package com.mbusa.theampage.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class FAQ extends Launch {
       
       commonfunctions cf = new commonfunctions();
       @Test
       public void FAQ() throws Exception
       {
              
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
              
             
              String SessionID = "14";
          	driver.navigate().to("https://www.mbusa.com/mercedes/contact_us/faqs#miscellaneous_info-1");
          	Thread.sleep(500);  
          	 System.out.println(" Execution Started");
          	Reporter.GeneralUpdate("Scenario 1", "FAQ", "Execution Started");
              cf.isTextPresent(SessionID,object.FAQ_Heading_1, TestDatafile.FAQ_Heading_1_Data);
       cf.isTextPresent(SessionID,object.FAQ_Heading_2, TestDatafile.FAQ_Heading_2_Data);
              cf.isTextPresent(SessionID,object.FAQ_Contact_US_Link, TestDatafile.FAQ_Contact_US_Link_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_1, TestDatafile.FAQ_SubHeading_1_Data);
              
                           
              cf.Click(object.FAQ_SubHeading_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_1_1, TestDatafile.FAQ_SubHeading_1_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_1_2, TestDatafile.FAQ_SubHeading_1_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_2, TestDatafile.FAQ_SubHeading_2_Data);
              
              
              cf.Click(object.FAQ_SubHeading_2);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_2_Dropdown_1_1, TestDatafile.FAQ_SubHeading_2_Dropdown_1_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_2_Dropdown_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_2_Dropdown_1_2, TestDatafile.FAQ_SubHeading_2_Dropdown_1_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_2_Dropdown_2_1, TestDatafile.FAQ_SubHeading_2_Dropdown_2_1_Data);
                           
              cf.Click(object.FAQ_SubHeading_2_Dropdown_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_2_Dropdown_2_2, TestDatafile.FAQ_SubHeading_2_Dropdown_2_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_3, TestDatafile.FAQ_SubHeading_3_Data);
              
              
              cf.Click(object.FAQ_SubHeading_3);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_3_1_1, TestDatafile.FAQ_SubHeading_3_1_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_3_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_3_1_2, TestDatafile.FAQ_SubHeading_3_1_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4, TestDatafile.FAQ_SubHeading_4_Data);
              
              
              cf.Click(object.FAQ_SubHeading_4);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_1_1, TestDatafile.FAQ_SubHeading_4_1_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_4_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_1_2, TestDatafile.FAQ_SubHeading_4_1_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_2_1, TestDatafile.FAQ_SubHeading_4_2_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_4_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_2_2, TestDatafile.FAQ_SubHeading_4_2_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_3_1, TestDatafile.FAQ_SubHeading_4_3_1_Data);
              
              cf.Click(object.FAQ_SubHeading_4_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_3_2, TestDatafile.FAQ_SubHeading_4_3_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_4_1, TestDatafile.FAQ_SubHeading_4_4_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_4_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_4_2, TestDatafile.FAQ_SubHeading_4_4_2_Data);
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_5_1, TestDatafile.FAQ_SubHeading_4_5_1_Data);
              
              
              cf.Click(object.FAQ_SubHeading_4_5_1);
              
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_5_2, TestDatafile.FAQ_SubHeading_4_5_2_Data);
          
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_6_1, TestDatafile.FAQ_SubHeading_4_6_1_Data);
           
           
           cf.Click(object.FAQ_SubHeading_4_6_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_6_2, TestDatafile.FAQ_SubHeading_4_6_2_Data);
          
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_7_1, TestDatafile.FAQ_SubHeading_4_7_1_Data);
           
           cf.Click(object.FAQ_SubHeading_4_7_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_7_2, TestDatafile.FAQ_SubHeading_4_7_2_Data);
           
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_4_7_3, TestDatafile.FAQ_SubHeading_4_7_3_Data);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_5, TestDatafile.FAQ_SubHeading_5_Data);
           
           cf.Click(object.FAQ_SubHeading_5);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_5_1_1, TestDatafile.FAQ_SubHeading_5_1_1_Data);
           
           cf.Click(object.FAQ_SubHeading_5_1_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_5_1_2, TestDatafile.FAQ_SubHeading_5_1_2_Data);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_5_2_1, TestDatafile.FAQ_SubHeading_5_2_1_Data);
           
           cf.Click(object.FAQ_SubHeading_5_2_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_5_2_2, TestDatafile.FAQ_SubHeading_5_2_2_Data);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_6, TestDatafile.FAQ_SubHeading_6_Data);
           
           cf.Click(object.FAQ_SubHeading_6);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_6_1_1, TestDatafile.FAQ_SubHeading_6_1_1_Data);
           
           cf.Click(object.FAQ_SubHeading_6_1_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_6_1_2, TestDatafile.FAQ_SubHeading_6_1_2_Data);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_7, TestDatafile.FAQ_SubHeading_7_Data);
           cf.Click(object.FAQ_SubHeading_7);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_1_1, TestDatafile.FAQ_SubHeading_7_1_1_Data);
           cf.Click(object.FAQ_SubHeading_7_1_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_1_2, TestDatafile.FAQ_SubHeading_7_1_2_Data);
          
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_2_1, TestDatafile.FAQ_SubHeading_7_2_1_Data);
           cf.Click(object.FAQ_SubHeading_7_2_1);
           
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_2_2, TestDatafile.FAQ_SubHeading_7_2_2_Data);
           
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_3_1, TestDatafile.FAQ_SubHeading_7_3_1_Data);
              cf.Click(object.FAQ_SubHeading_7_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_3_2, TestDatafile.FAQ_SubHeading_7_3_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_4_1, TestDatafile.FAQ_SubHeading_7_4_1_Data);
              cf.Click(object.FAQ_SubHeading_7_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_4_2, TestDatafile.FAQ_SubHeading_7_4_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_5_1, TestDatafile.FAQ_SubHeading_7_5_1_Data);
              cf.Click(object.FAQ_SubHeading_7_5_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_5_2, TestDatafile.FAQ_SubHeading_7_5_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_6_1, TestDatafile.FAQ_SubHeading_7_6_1_Data);
              cf.Click(object.FAQ_SubHeading_7_6_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_7_6_2, TestDatafile.FAQ_SubHeading_7_6_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8, TestDatafile.FAQ_SubHeading_8_Data);
              cf.Click(object.FAQ_SubHeading_8);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_1_1, TestDatafile.FAQ_SubHeading_8_1_1_Data);
              cf.Click(object.FAQ_SubHeading_8_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_1_2, TestDatafile.FAQ_SubHeading_8_1_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_2_1, TestDatafile.FAQ_SubHeading_8_2_1_Data);
              cf.Click(object.FAQ_SubHeading_8_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_2_2, TestDatafile.FAQ_SubHeading_8_2_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_3_1, TestDatafile.FAQ_SubHeading_8_3_1_Data);
              cf.Click(object.FAQ_SubHeading_8_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_3_2, TestDatafile.FAQ_SubHeading_8_3_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_4_1, TestDatafile.FAQ_SubHeading_8_4_1_Data);
              cf.Click(object.FAQ_SubHeading_8_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_4_2, TestDatafile.FAQ_SubHeading_8_4_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_5_1, TestDatafile.FAQ_SubHeading_8_5_1_Data);
              cf.Click(object.FAQ_SubHeading_8_5_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_5_2, TestDatafile.FAQ_SubHeading_8_5_2_Data);   
              
              
              
              
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_6_1, TestDatafile.FAQ_SubHeading_8_6_1_Data);  
              cf.Click(object.FAQ_SubHeading_8_6_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_6_2, TestDatafile.FAQ_SubHeading_8_6_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_7_1, TestDatafile.FAQ_SubHeading_8_7_1_Data);
              cf.Click(object.FAQ_SubHeading_8_7_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_8_7_2, TestDatafile.FAQ_SubHeading_8_7_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9, TestDatafile.FAQ_SubHeading_9_Data);
              cf.Click(object.FAQ_SubHeading_9);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_1_1, TestDatafile.FAQ_SubHeading_9_1_1_Data);
              cf.Click(object.FAQ_SubHeading_9_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_1_2, TestDatafile.FAQ_SubHeading_9_1_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_2_1, TestDatafile.FAQ_SubHeading_9_2_1_Data);
              cf.Click(object.FAQ_SubHeading_9_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_2_2, TestDatafile.FAQ_SubHeading_9_2_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_3_1, TestDatafile.FAQ_SubHeading_9_3_1_Data);
              cf.Click(object.FAQ_SubHeading_9_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_3_2, TestDatafile.FAQ_SubHeading_9_3_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_4_1, TestDatafile.FAQ_SubHeading_9_4_1_Data);
              cf.Click(object.FAQ_SubHeading_9_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_9_4_2, TestDatafile.FAQ_SubHeading_9_4_2_Data);
              
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_10, TestDatafile.FAQ_SubHeading_10_Data);
              cf.Click(object.FAQ_SubHeading_10);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_10_1_1, TestDatafile.FAQ_SubHeading_10_1_1_Data);
              cf.Click(object.FAQ_SubHeading_10_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_10_1_2, TestDatafile.FAQ_SubHeading_10_1_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_10_2_1, TestDatafile.FAQ_SubHeading_10_2_1_Data);
              cf.Click(object.FAQ_SubHeading_10_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_10_2_2, TestDatafile.FAQ_SubHeading_10_2_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11, TestDatafile.FAQ_SubHeading_11_Data);
              cf.Click(object.FAQ_SubHeading_11);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_1_1, TestDatafile.FAQ_SubHeading_11_1_1_Data);
              cf.Click(object.FAQ_SubHeading_11_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_1_2, TestDatafile.FAQ_SubHeading_11_1_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_2_1, TestDatafile.FAQ_SubHeading_11_2_1_Data);
              cf.Click(object.FAQ_SubHeading_11_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_2_2, TestDatafile.FAQ_SubHeading_11_2_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_3_1, TestDatafile.FAQ_SubHeading_11_3_1_Data);
              cf.Click(object.FAQ_SubHeading_11_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_3_2, TestDatafile.FAQ_SubHeading_11_3_2_Data);

              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_4_1, TestDatafile.FAQ_SubHeading_11_4_1_Data);
              cf.Click(object.FAQ_SubHeading_11_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_4_2, TestDatafile.FAQ_SubHeading_11_4_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_5_1, TestDatafile.FAQ_SubHeading_11_5_1_Data);
              cf.Click(object.FAQ_SubHeading_11_5_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_5_2, TestDatafile.FAQ_SubHeading_11_5_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_6_1, TestDatafile.FAQ_SubHeading_11_6_1_Data);
              cf.Click(object.FAQ_SubHeading_11_6_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_11_6_2, TestDatafile.FAQ_SubHeading_11_6_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_12, TestDatafile.FAQ_SubHeading_12_Data);
              cf.Click(object.FAQ_SubHeading_12);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_12_1_1, TestDatafile.FAQ_SubHeading_12_1_1_Data);
              cf.Click(object.FAQ_SubHeading_12_1_1);
              
           cf.isTextPresent(SessionID,object.FAQ_SubHeading_12_1_2, TestDatafile.FAQ_SubHeading_12_1_2_Data);
              
       cf.isTextPresent(SessionID,object.FAQ_SubHeading_12_2_1, TestDatafile.FAQ_SubHeading_12_2_1_Data);
              cf.Click(object.FAQ_SubHeading_12_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_12_2_2, TestDatafile.FAQ_SubHeading_12_2_2_Data); 
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13, TestDatafile.FAQ_SubHeading_13_Data);
              cf.Click(object.FAQ_SubHeading_13);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_1_1, TestDatafile.FAQ_SubHeading_13_1_1_Data);
              cf.Click(object.FAQ_SubHeading_13_1_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_1_2, TestDatafile.FAQ_SubHeading_13_1_2_Data); 
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_2_1, TestDatafile.FAQ_SubHeading_13_2_1_Data);
              cf.Click(object.FAQ_SubHeading_13_2_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_2_2, TestDatafile.FAQ_SubHeading_13_2_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_3_1, TestDatafile.FAQ_SubHeading_13_3_1_Data);
              cf.Click(object.FAQ_SubHeading_13_3_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_3_2, TestDatafile.FAQ_SubHeading_13_3_2_Data);
       
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_4_1, TestDatafile.FAQ_SubHeading_13_4_1_Data);
              cf.Click(object.FAQ_SubHeading_13_4_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_4_2, TestDatafile.FAQ_SubHeading_13_4_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_5_1, TestDatafile.FAQ_SubHeading_13_5_1_Data);
              cf.Click(object.FAQ_SubHeading_13_5_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_5_2, TestDatafile.FAQ_SubHeading_13_5_2_Data);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_6_1, TestDatafile.FAQ_SubHeading_13_6_1_Data);
              cf.Click(object.FAQ_SubHeading_13_6_1);
              
              cf.isTextPresent(SessionID,object.FAQ_SubHeading_13_6_2, TestDatafile.FAQ_SubHeading_13_6_2_Data); 
       
       
           cf.Linknavigation(SessionID,object.FAQ_Contact_US_Link, TestDatafile.FAQ_Contact_US_Link_Data);
              cf.Linkvalidation(SessionID,object.FAQ_Contact_US_Link);
       
              cf.Linknavigation(SessionID,object.FAQ_LinK_1_3, TestDatafile.FAQ_LinK_1_3_Data);
              System.out.println(object.FAQ_LinK_1_3.getText());
              System.out.println(TestDatafile.FAQ_LinK_1_3_Data);
              //cf.Linkvalidation(object.FAQ_LinK_1_3);
              
              cf.Linknavigation(SessionID,object.FAQ_LinK_1_4, TestDatafile.FAQ_LinK_1_4_Data);
              //cf.Linkvalidation(object.FAQ_LinK_1_4);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_3_1_3, TestDatafile.FAQ_Link_3_1_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_3_1_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_4_2_3, TestDatafile.FAQ_Link_4_2_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_4_2_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_4_5_3, TestDatafile.FAQ_Link_4_5_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_4_5_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_4_6_3, TestDatafile.FAQ_Link_4_6_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_4_6_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_4_6_4, TestDatafile.FAQ_Link_4_6_4_Data);
              //cf.Linkvalidation(object.FAQ_Link_4_6_4);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_4_7_4, TestDatafile.FAQ_Link_4_7_4_Data);
             // cf.Linkvalidation(object.FAQ_Link_4_7_4);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_6_1_3, TestDatafile.FAQ_Link_6_1_3_Data);
             // cf.Linkvalidation(object.FAQ_Link_6_1_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_8_3_3, TestDatafile.FAQ_Link_8_3_3_Data);
             // cf.Linkvalidation(object.FAQ_Link_8_3_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_8_5_3, TestDatafile.FAQ_Link_8_5_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_8_5_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_9_1_3, TestDatafile.FAQ_Link_9_1_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_9_1_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_10_1_3, TestDatafile.FAQ_Link_10_1_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_10_1_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_10_2_3, TestDatafile.FAQ_Link_10_2_3_Data);
              //cf.Linkvalidation(object.FAQ_Link_10_2_3);
              
              cf.Linknavigation(SessionID,object.FAQ_Link_10_2_4, TestDatafile.FAQ_Link_10_2_4_Data);
             // cf.Linkvalidation(object.FAQ_Link_10_2_4); 
                           

                           
       }

}
