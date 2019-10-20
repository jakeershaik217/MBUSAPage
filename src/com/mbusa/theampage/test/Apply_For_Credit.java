package com.mbusa.theampage.test;


import java.util.List;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Apply_For_Credit extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "23";
	
	
	@Test
	public void EDP() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		
		
		Reporter.GeneralUpdate("ID 23", "4MATIC", "Execution Started");
		driver.navigate().to("https://www.mbusa.com/mercedes/apply_for_credit");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		
		
		cf.webdriverwait(object.Credit_Customer_Agreements_para_read_and_accept_1);
		cf.Click(object.Credit_Customer_Agreements_para_read_and_accept_1);
		Thread.sleep(1000);
		cf.isTextPresent(SessionID, object.Credit_Customer_Agreements_popup_1_heading, TestDatafile.Credit_Customer_Agreements_popup_1_heading);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", object.Credit_Customer_Agreements_popup_1_last_copy_4);
		cf.isButtonfound(SessionID, object.Credit_Customer_Agreements_popup_1_bottom_decline);
		cf.Click(object.Credit_Customer_Agreements_popup_1_bottom_accept_button);
		cf.webdriverwait(object.Credit_Customer_Agreements_popup_1_bottom_accept);
		cf.Click(object.Credit_Customer_Agreements_popup_1_bottom_view_terms_1);
		cf.Click(object.Credit_Customer_Agreements_popup_1_bottom_accept_button);
		cf.webdriverwait(object.Credit_Customer_Agreements_popup_1_bottom_accept);
		
		
		
		
		
		cf.Click(object.Credit_Customer_Agreements_para_read_and_accept_2);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", object.Credit_Customer_Agreements_popup_2_bottom_text);
		cf.isButtonfound(SessionID, object.Credit_Customer_Agreements_popup_1_bottom_decline);
		cf.Click(object.Credit_Customer_Agreements_popup_1_bottom_accept_button);
		cf.webdriverwait(object.Credit_Customer_Agreements_popup_2_bottom_accept);
		cf.Click(object.Credit_Customer_Agreements_popup_2_bottom_view_terms_2);
		cf.Click(object.Credit_Customer_Agreements_popup_1_bottom_accept_button);
		cf.webdriverwait(object.Credit_Customer_Agreements_popup_2_bottom_accept);
		
		
		cf.Click(object.Credit_Customer_Agreements_continue_button);
		for(int i=0;i<3;i++){
			
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div["+(i+1)+"]/div")));
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div["+(i+1)+"]/div[2]/div[4]")));
			System.out.println(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div["+(i+1)+"]/div")).getText());
			
		}
		/*cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div")));
		List<WebElement> year=driver.findElements(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div[2]/div"));
		cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div")));
		
		
		
		for(int i=0;i<year.size();i++){
			
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div")));
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div[2]/div["+(i+1)+"]")));
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[2]/div")));
			List<WebElement> classvalue=driver.findElements(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[2]/div[2]/div"));
			cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[2]/div")));
			for(int j=0;j<classvalue.size();j++){
				
				cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[2]/div")));
				cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[2]/div[2]/div["+(j+1)+"]")));
				cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div")));
				List<WebElement> model=driver.findElements(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div[2]/div"));
				cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div")));
                    for(int k=0;k<model.size();k++){
				
				
                cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div")));
				cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div[2]/div["+(k+1)+"]")));
				
				
				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[1]/div")), driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[1]/div/div[2]/div[1]/p/span[1]")).getText());
				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/div[3]/div")), driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[1]/div/div[2]/div[1]/h3")).getText());
				cf.isTextPresent(SessionID, driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[1]/div/div[2]/div[1]/div[1]")),"MSRP*");
				cf.isTextPresentfrominputbox(SessionID, driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[2]/div[2]/div/form/span[1]/fieldset/span/input")),driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/span")).getText());
			     }
			
			
			
		}
		
		
		}
		*/
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        for (int second = 0;; second++) {
                if(second >=4){
                    break;
                }
                    jse.executeScript("window.scrollBy(0,200)", ""); //y value '800' can be altered
                  Thread.sleep(3000);
        }
       cf.Inputbox(object.Credit_dealer, TestDatafile.Credit_dealer);
        cf.Clickandwait(object.Credit_dealer_click,object.Credit_dealer_name);
        cf.Clickandwait(object.Credit_dealer_name,object.Credit_dealer_name_main);
		cf.Click(object.Credit_Customer_Agreements_continue_button_2);
		/*for (int second = 0;; second++) {
            if(second >=4){
                break;
            }
                jse.executeScript("window.scrollBy(0,200)", ""); //y value '800' can be altered
              Thread.sleep(3000);
    }*/
		
		cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[3]/div[2]/div/form/fieldset[3]/div[1]/div[2]/div/div")));
		cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[3]/div[2]/div/form/fieldset[3]/div[1]/div[2]/div/div[2]/div[1]")));
		cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[3]/div[2]/div/form/fieldset[3]/div[2]/div")));
		cf.Click(driver.findElement(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[3]/div[2]/div/form/fieldset[3]/div[2]/div[2]/div[3]")));
        List<WebElement> dropdownboxes=driver.findElements(By.xpath("//div[@id='react-app']/div/div/div/div/span/div/div/div/form/fieldset/div//child::div[@class='mb-react-select']"));
         for(int i=0;i<dropdownboxes.size();i++){
			
			cf.Click(dropdownboxes.get(i));
			cf.Click(object.Credit_dealer_dropdown);
			
		}
        
         List<WebElement> inputboxes=driver.findElements(By.xpath("//div[@id='react-app']/div/div/div[2]/div[2]/span/div[3]/div[2]/div/form//child::input"));
 		
         for(int i=0;i<inputboxes.size();i++){
 			
 			cf.Inputboxbyjavascript(inputboxes.get(i), inputbox[i]);
 			
 		}
 		
        
        System.out.println(" Execution End");
		
		
	}
}
