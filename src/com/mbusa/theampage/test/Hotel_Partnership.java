
package com.mbusa.theampage.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Hotel_Partnership extends Launch {
       
       commonfunctions cf = new commonfunctions();
       @Test
       public void Hotel_Partnership() throws Exception
       {
              
        objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
        String SessionID = "15";
      	driver.navigate().to("https://www.mbusa.com/mercedes/events/hotels#main");
      	Thread.sleep(500);  
              System.out.println(" Execution Started");
              Reporter.GeneralUpdate("Scenario 15", "Hotel_Partnership", "Execution Started");
             
              
              WebDriverWait wait= new WebDriverWait(driver, 120);    
    cf.isTextPresent(SessionID,object.Hotel_SubHeading, TestDatafile.Hotel_SubHeading_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1, TestDatafile.Hotel_SubHeading_1_Data);
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_1_Img, TestDatafile.Hotel_SubHeading_1_Img_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_1, TestDatafile.Hotel_SubHeading_1_1_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_1_MerceLink, TestDatafile.Hotel_SubHeading_1_MerceLink_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_1_MerceLink);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_Share, TestDatafile.Hotel_SubHeading_1_Share_Data);
       
       
       Actions action = new Actions(driver);
       
       action.moveToElement(driver.findElement(By.xpath("//div[@id='content']/div[1]/div/div[2]/div/a"))).build().perform();
       
       wait.until(ExpectedConditions.visibilityOf(object.Hotel_SubHeading_1_ShareFB));
       action.moveToElement(object.Hotel_SubHeading_1_ShareFB).build().perform();
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_ShareFB, TestDatafile.Hotel_SubHeading_1_ShareFB_Data);
       
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_1_ShareFB, TestDatafile.Hotel_SubHeading_1_ShareFB_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_1_ShareFB);
       
              
       wait.until(ExpectedConditions.visibilityOf(object.Hotel_SubHeading_1_ShareTwitter));
       action.moveToElement(object.Hotel_SubHeading_1_ShareTwitter).build().perform();
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_ShareTwitter, TestDatafile.Hotel_SubHeading_1_ShareTwitter_Data);
       
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_1_ShareTwitter, TestDatafile.Hotel_SubHeading_1_ShareTwitter_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_1_ShareTwitter);
       
       wait.until(ExpectedConditions.visibilityOf(object.Hotel_SubHeading_1_ShareEmail));
       action.moveToElement(object.Hotel_SubHeading_1_ShareEmail).build().perform();
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_ShareEmail, TestDatafile.Hotel_SubHeading_1_ShareEmail_Data);
       
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_1_ShareEmail, TestDatafile.Hotel_SubHeading_1_ShareEmail_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_1_ShareEmail);
       
       
              
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_1_3, TestDatafile.Hotel_SubHeading_1_3_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_1_EventLink, TestDatafile.Hotel_SubHeading_1_EventLink_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_1_EventLink);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Ariz, TestDatafile.Hotel_SubHeading_Ariz_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Ariz_1, TestDatafile.Hotel_SubHeading_Ariz_1_Data);
       cf.Click(object.Hotel_SubHeading_Ariz_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Cali, TestDatafile.Hotel_SubHeading_Cali_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Cali_1, TestDatafile.Hotel_SubHeading_Cali_1_Data);
       cf.Click(object.Hotel_SubHeading_Cali_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Cali_2, TestDatafile.Hotel_SubHeading_Cali_2_Data);
       cf.Click(object.Hotel_SubHeading_Cali_2);
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Cali_3, TestDatafile.Hotel_SubHeading_Cali_3_Data);
       cf.Click(object.Hotel_SubHeading_Cali_3);
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Cali_4, TestDatafile.Hotel_SubHeading_Cali_4_Data);
       cf.Click(object.Hotel_SubHeading_Cali_4);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Col, TestDatafile.Hotel_SubHeading_Col_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Col_1, TestDatafile.Hotel_SubHeading_Col_1_Data);
       cf.Click(object.Hotel_SubHeading_Col_2);
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Col_2, TestDatafile.Hotel_SubHeading_Col_2_Data);
       cf.Click(object.Hotel_SubHeading_Col_2);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMex, TestDatafile.Hotel_SubHeading_NewMex_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMex_1, TestDatafile.Hotel_SubHeading_NewMex_1_Data);
       cf.Click(object.Hotel_SubHeading_NewMex_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Rhode, TestDatafile.Hotel_SubHeading_Rhode_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Rhode_1, TestDatafile.Hotel_SubHeading_Rhode_1_Data);
       cf.Click(object.Hotel_SubHeading_Rhode_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Caro, TestDatafile.Hotel_SubHeading_Caro_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Caro_1, TestDatafile.Hotel_SubHeading_Caro_1_Data);
       cf.Click(object.Hotel_SubHeading_Caro_1);
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Caro_2, TestDatafile.Hotel_SubHeading_Caro_2_Data);
       cf.Click(object.Hotel_SubHeading_Caro_2);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Uta, TestDatafile.Hotel_SubHeading_Uta_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Uta_1, TestDatafile.Hotel_SubHeading_Uta_1_Data);
       cf.Click(object.Hotel_SubHeading_Uta_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Verm, TestDatafile.Hotel_SubHeading_Verm_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Verm_1, TestDatafile.Hotel_SubHeading_Verm_1_Data);
       cf.Click(object.Hotel_SubHeading_Verm_1);
       
       
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyom, TestDatafile.Hotel_SubHeading_Wyom_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyom_1, TestDatafile.Hotel_SubHeading_Wyom_1_Data);
       cf.Click(object.Hotel_SubHeading_Wyom_1);
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Arizona_Img, TestDatafile.Hotel_SubHeading_Arizona_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Arizona_1, TestDatafile.Hotel_SubHeading_Arizona_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Arizona_2, TestDatafile.Hotel_SubHeading_Arizona_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Arizona_3, TestDatafile.Hotel_SubHeading_Arizona_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Arizona_4, TestDatafile.Hotel_SubHeading_Arizona_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Arizona_5, TestDatafile.Hotel_SubHeading_Arizona_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_Arizona_Link, TestDatafile.Hotel_SubHeading_Arizona_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Arizona_Link);
       cf.Click(object.Hotel_SubHeading_Arizona_5);
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_California_Img, TestDatafile.Hotel_SubHeading_California_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California_1, TestDatafile.Hotel_SubHeading_California_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California_2, TestDatafile.Hotel_SubHeading_California_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California_3, TestDatafile.Hotel_SubHeading_California_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California_4, TestDatafile.Hotel_SubHeading_California_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California_5, TestDatafile.Hotel_SubHeading_California_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_California_Link, TestDatafile.Hotel_SubHeading_California_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_California_Link);
       cf.Click(object.Hotel_SubHeading_California_5);
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_California1_Img, TestDatafile.Hotel_SubHeading_California1_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California1_1, TestDatafile.Hotel_SubHeading_California1_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California1_2, TestDatafile.Hotel_SubHeading_California1_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California1_3, TestDatafile.Hotel_SubHeading_California1_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California1_4, TestDatafile.Hotel_SubHeading_California1_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California1_5, TestDatafile.Hotel_SubHeading_California1_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_California1_Link, TestDatafile.Hotel_SubHeading_California1_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_California1_Link);
       cf.Click(object.Hotel_SubHeading_California1_5);
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_California2_Img, TestDatafile.Hotel_SubHeading_California2_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California2_1, TestDatafile.Hotel_SubHeading_California2_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California2_2, TestDatafile.Hotel_SubHeading_California2_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California2_3, TestDatafile.Hotel_SubHeading_California2_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California2_4, TestDatafile.Hotel_SubHeading_California2_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California2_5, TestDatafile.Hotel_SubHeading_California2_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_California2_Link, TestDatafile.Hotel_SubHeading_California2_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_California2_Link);
       cf.Click(object.Hotel_SubHeading_California2_5);
       
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_California3_Img, TestDatafile.Hotel_SubHeading_California3_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California3_1, TestDatafile.Hotel_SubHeading_California3_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California3_2, TestDatafile.Hotel_SubHeading_California3_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California3_3, TestDatafile.Hotel_SubHeading_California3_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California3_4, TestDatafile.Hotel_SubHeading_California3_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_California3_5, TestDatafile.Hotel_SubHeading_California3_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_California3_Link, TestDatafile.Hotel_SubHeading_California3_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_California3_Link);
       cf.Click(object.Hotel_SubHeading_California3_5);
       
       
       cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Colorado_Img, TestDatafile.Hotel_SubHeading_Colorado_Img_Data); 
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado_1, TestDatafile.Hotel_SubHeading_Colorado_1_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado_2, TestDatafile.Hotel_SubHeading_Colorado_2_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado_3, TestDatafile.Hotel_SubHeading_Colorado_3_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado_4, TestDatafile.Hotel_SubHeading_Colorado_4_Data);
       cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado_5, TestDatafile.Hotel_SubHeading_Colorado_5_Data);
       cf.Linknavigation(SessionID,object.Hotel_SubHeading_Colorado_Link, TestDatafile.Hotel_SubHeading_Colorado_Link_Data);
       cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Colorado_Link);
       cf.Click(object.Hotel_SubHeading_Colorado_5);
              
              
              
              
              
              
              
              
              cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Colorado1_Img,TestDatafile.Hotel_SubHeading_Colorado1_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado1_1, TestDatafile.Hotel_SubHeading_Colorado1_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado1_2, TestDatafile.Hotel_SubHeading_Colorado1_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado1_3, TestDatafile.Hotel_SubHeading_Colorado1_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado1_4, TestDatafile.Hotel_SubHeading_Colorado1_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_Colorado1_Link, TestDatafile.Hotel_SubHeading_Colorado1_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Colorado1_Link);
              cf.isTextPresent(SessionID,object.Hotel_Colorado1_BacktoTop, TestDatafile.Hotel_Colorado1_BacktoTop_Data);
              cf.Click(object.Hotel_Colorado1_BacktoTop);
              
       
              cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Colorado2_Img,TestDatafile.Hotel_SubHeading_Colorado2_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado2_1, TestDatafile.Hotel_SubHeading_Colorado2_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado2_2, TestDatafile.Hotel_SubHeading_Colorado2_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado2_3, TestDatafile.Hotel_SubHeading_Colorado2_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Colorado2_4, TestDatafile.Hotel_SubHeading_Colorado2_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_Colorado2_Link, TestDatafile.Hotel_SubHeading_Colorado2_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Colorado2_Link);
              cf.isTextPresent(SessionID,object.Hotel_Colorado2_BacktoTop, TestDatafile.Hotel_Colorado2_BacktoTop_Data);
              cf.Click(object.Hotel_Colorado2_BacktoTop);
              
              cf.CheckWebImage(SessionID,object.Hotel_SubHeading_NewMexico_Img,TestDatafile.Hotel_SubHeading_NewMexico_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMexico_1, TestDatafile.Hotel_SubHeading_NewMexico_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMexico_2, TestDatafile.Hotel_SubHeading_NewMexico_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMexico_3, TestDatafile.Hotel_SubHeading_NewMexico_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_NewMexico_4, TestDatafile.Hotel_SubHeading_NewMexico_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_NewMexico_Link, TestDatafile.Hotel_SubHeading_NewMexico_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_NewMexico_Link);
              cf.isTextPresent(SessionID,object.Hotel_NewMexico_BacktoTop, TestDatafile.Hotel_NewMexico_BacktoTop_Data);
              cf.Click(object.Hotel_NewMexico_BacktoTop);
              
        cf.CheckWebImage(SessionID,object.Hotel_SubHeading_RhodeIsland_Img,TestDatafile.Hotel_SubHeading_RhodeIsland_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_RhodeIsland_1, TestDatafile.Hotel_SubHeading_RhodeIsland_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_RhodeIsland_2, TestDatafile.Hotel_SubHeading_RhodeIsland_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_RhodeIsland_3, TestDatafile.Hotel_SubHeading_RhodeIsland_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_RhodeIsland_4, TestDatafile.Hotel_SubHeading_RhodeIsland_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_RhodeIsland_Link, TestDatafile.Hotel_SubHeading_RhodeIsland_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_RhodeIsland_Link);
              cf.isTextPresent(SessionID,object.Hotel_RhodeIsland_BacktoTop, TestDatafile.Hotel_RhodeIsland_BacktoTop_Data);
              cf.Click(object.Hotel_RhodeIsland_BacktoTop);
              
              
        cf.CheckWebImage(SessionID,object.Hotel_SubHeading_SouthCarolina1_Img,TestDatafile.Hotel_SubHeading_SouthCarolina1_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina1_1, TestDatafile.Hotel_SubHeading_SouthCarolina1_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina1_2, TestDatafile.Hotel_SubHeading_SouthCarolina1_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina1_3, TestDatafile.Hotel_SubHeading_SouthCarolina1_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina1_4, TestDatafile.Hotel_SubHeading_SouthCarolina1_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_SouthCarolina1_Link, TestDatafile.Hotel_SubHeading_SouthCarolina1_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_SouthCarolina1_Link);
              cf.isTextPresent(SessionID,object.Hotel_SouthCarolina1_BacktoTop, TestDatafile.Hotel_SouthCarolina1_BacktoTop_Data);
              cf.Click(object.Hotel_SouthCarolina1_BacktoTop);
              
        cf.CheckWebImage(SessionID,object.Hotel_SubHeading_SouthCarolina2_Img,TestDatafile.Hotel_SubHeading_SouthCarolina2_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina2_1, TestDatafile.Hotel_SubHeading_SouthCarolina2_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina2_2, TestDatafile.Hotel_SubHeading_SouthCarolina2_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina2_3, TestDatafile.Hotel_SubHeading_SouthCarolina2_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_SouthCarolina2_4, TestDatafile.Hotel_SubHeading_SouthCarolina2_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_SouthCarolina2_Link, TestDatafile.Hotel_SubHeading_SouthCarolina2_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_SouthCarolina2_Link);
              cf.isTextPresent(SessionID,object.Hotel_SouthCarolina2_BacktoTop, TestDatafile.Hotel_SouthCarolina2_BacktoTop_Data);
              cf.Click(object.Hotel_SouthCarolina2_BacktoTop);
              
        cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Utah_Img,TestDatafile.Hotel_SubHeading_Utah_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Utah_1, TestDatafile.Hotel_SubHeading_Utah_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Utah_2, TestDatafile.Hotel_SubHeading_Utah_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Utah_3, TestDatafile.Hotel_SubHeading_Utah_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Utah_4, TestDatafile.Hotel_SubHeading_Utah_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_Utah_Link, TestDatafile.Hotel_SubHeading_Utah_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Utah_Link);
              cf.isTextPresent(SessionID,object.Hotel_Utah_BacktoTop, TestDatafile.Hotel_Utah_BacktoTop_Data);
              cf.Click(object.Hotel_Utah_BacktoTop);
              
              cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Vermont_Img,TestDatafile.Hotel_SubHeading_Vermont_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Vermont_1, TestDatafile.Hotel_SubHeading_Vermont_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Vermont_2, TestDatafile.Hotel_SubHeading_Vermont_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Vermont_3, TestDatafile.Hotel_SubHeading_Vermont_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Vermont_4, TestDatafile.Hotel_SubHeading_Vermont_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_Vermont_Link, TestDatafile.Hotel_SubHeading_Vermont_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Vermont_Link);
              cf.isTextPresent(SessionID,object.Hotel_Vermont_BacktoTop, TestDatafile.Hotel_Vermont_BacktoTop_Data);
              cf.Click(object.Hotel_Vermont_BacktoTop);
              
        cf.CheckWebImage(SessionID,object.Hotel_SubHeading_Wyoming_Img,TestDatafile.Hotel_SubHeading_Wyoming_Img_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyoming_1, TestDatafile.Hotel_SubHeading_Wyoming_1_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyoming_2, TestDatafile.Hotel_SubHeading_Wyoming_2_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyoming_3, TestDatafile.Hotel_SubHeading_Wyoming_3_Data);
              cf.isTextPresent(SessionID,object.Hotel_SubHeading_Wyoming_4, TestDatafile.Hotel_SubHeading_Wyoming_4_Data);
              cf.Linknavigation(SessionID,object.Hotel_SubHeading_Wyoming_Link, TestDatafile.Hotel_SubHeading_Wyoming_Link_Data);
              cf.Linkvalidation(SessionID,object.Hotel_SubHeading_Wyoming_Link);
              cf.isTextPresent(SessionID,object.Hotel_Wyoming_BacktoTop, TestDatafile.Hotel_Wyoming_BacktoTop_Data);
              cf.Click(object.Hotel_Wyoming_BacktoTop);

              
       }
       
}
