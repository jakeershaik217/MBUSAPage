package com.mbusa.theampage.test;

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

public class More_than_a_badge extends Launch

{

       commonfunctions cf = new commonfunctions();
       @Test
       public void FAQ() throws Exception
       {
              
   objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
   String SessionID = "13";
	driver.navigate().to("https://www.mbusa.com/mercedes/benz");
	Thread.sleep(500);

	
	Reporter.GeneralUpdate("ID 13", "More_than_a_badge", "Execution Started");
    cf.isTextPresent(SessionID,object.Main_Heading, TestDatafile.Main_Heading_Data);
    cf.isTextPresent(SessionID,object.Main_SubHeading, TestDatafile.Main_SubHeading_Data);
   cf.CheckWebImage(SessionID,object.Main_Image, TestDatafile.Main_Image_Data);
cf.CheckWebImage(SessionID,object.Main_Image2, TestDatafile.Main_Image2_Data);
  
  
  
  for(int i=0;i<3;i++)
   {
       
       cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/h2")), TestDatafile.SubHeading1_Data[i]);
       cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/h2/a")), TestDatafile.SubHeading1_Link_Data[i]);
       cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/h2/a")));
       
       
       cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/a/img")), TestDatafile.SubHeading1_IMG_Data[i]);
       cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/a")), TestDatafile.SubHeading1_Link_Data[i]);
       cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/a")));
       
       cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/p")), TestDatafile.SubHeading1_Text_Data[i]);
       cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/p/a")), TestDatafile.SubHeading1_Link_Data[i]);
       cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[1]/div["+(i+1)+"]/div/p/a")));
       
   }

  for(int i=0;i<2;i++){
              
              cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/h2")), TestDatafile.SubHeading2_Data[i]);
              cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/h2/a")), TestDatafile.SubHeading2_Link_Data[i]);
              cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/h2/a")));
              
              cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/a/img")), TestDatafile.SubHeading2_IMG_Data[i]);
              cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/a")), TestDatafile.SubHeading2_Link_Data[i]);
              cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/a")));
              
              cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/p")), TestDatafile.SubHeading2_Text_Data[i]);
              cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/p/a")), TestDatafile.SubHeading2_Link_Data[i]);
              cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div["+(i+1)+"]/div/p/a")));
       }
  
  
  
  List<WebElement> list1=driver.findElements(By.xpath("//div[@id='footer']/div[1]/ul[1]//child::a"));
  for(int i=0;i<list1.size();i++)
  {
         
       cf.isTextPresent(SessionID,list1.get(i),TestDatafile.Footer_Heading1_Data[i]);
       cf.Linknavigation(SessionID,list1.get(i),TestDatafile.Footer_Heading1_Link_Data[i]);  
       cf.Linkvalidation(SessionID,list1.get(i));
  }
  
  List<WebElement> list2=driver.findElements(By.xpath("//div[@id='footer']/div[1]/ul[2]//child::a"));
  for(int i=0;i<list2.size();i++)
  {
         
       cf.isTextPresent(SessionID,list2.get(i),TestDatafile.Footer_Heading2_Data[i]);
       cf.Linknavigation(SessionID,list2.get(i),TestDatafile.Footer_Heading2_Link_Data[i]);  
       cf.Linkvalidation(SessionID,list2.get(i));
  }

   
  cf.isTextPresent(SessionID,object.Footer_Heading3, TestDatafile.Footer_Heading3_Data);
  cf.isTextPresent(SessionID,object.Footer_Heading4, TestDatafile.Footer_Heading4_Data);

  List<WebElement> list3=driver.findElements(By.xpath("//ul[@id='mb-footer-social-media-links']//child::a"));
  for(int i=0;i<list3.size();i++)
  {
       
       cf.isTextPresent(SessionID,list3.get(i),TestDatafile.Footer_Media_Data[i]);  
       cf.Linknavigation(SessionID,list3.get(i),TestDatafile.Footer_Media_Link_Data[i]);  
       cf.Linkvalidation(SessionID,list3.get(i));
         
  }
    
  
    cf.isTextPresent(SessionID,object.Footer_Disclaime1, TestDatafile.Footer_Disclaime1_Data);
  
    List<WebElement> list4=driver.findElements(By.xpath("//div[@id='disclaimer']/div/ul//child::a"));
    for(int i=0;i<list4.size();i++)
    {
       
       cf.isTextPresent(SessionID,list4.get(i),TestDatafile.Footer_Disclaime2_Data[i]);  
       cf.Linknavigation(SessionID,list4.get(i),TestDatafile.Footer_Disclaime2_Link_Data[i]);  
       cf.Linkvalidation(SessionID,list4.get(i));
         
    }

    cf.CheckWebImage(SessionID,object.FeedBack_Link, TestDatafile.FeedBack_Image_Data);
    cf.Linknavigation(SessionID,object.FeedBack_Link, TestDatafile.FeedBack_Link_Data);
    cf.Linkvalidation(SessionID,object.FeedBack_Link);
     
   
    cf.Inputbox(object.Footer_Input, TestDatafile.Footer_Input_Data);
    //cf.Click(object.Footer_Subscribe_Button);       
    cf.isButtonfound(SessionID,object.Footer_Subscribe_Button);
    cf.isTextPresent(SessionID,object.Footer_Subscribe_Button, TestDatafile.Footer_Subscribe_Button_Data); 
    
      
    ((JavascriptExecutor)driver).executeScript("arguments[0].click()",  object.Footer_Subscribe_Button);
    WebDriverWait wait=new WebDriverWait(driver, 120);
    //cf.submit(object.Footer_Subscribe_Button,object.Subscribed);
    
    wait.until(ExpectedConditions.visibilityOf(object.Subscribed));
    
    cf.isTextPresent(SessionID,object.Subscribed, TestDatafile.Subscribed_Data);
    cf.isTextPresent(SessionID,object.Edit, TestDatafile.Edit_Link_Data);
    
    cf.Linknavigation(SessionID,object.Edit, TestDatafile.Edit_Link_Data);
    cf.Linkvalidation(SessionID,object.Edit);
    
}
       

}
