package com.mbusa.theampage.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;

public class Shooping_Accessroies extends Launch {
	
	commonfunctions cf = new commonfunctions();
	@Test
	public void FAQ() throws Exception
	{
		
objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
	
		
		String SessionID = "4";
		driver.navigate().to("https://www.mbusa.com/mercedes/accessories");
		Thread.sleep(500);
		System.out.println(" Execution Started");
		Reporter.GeneralUpdate("ID 4", "Shooping_Accessroies", "Execution Started");	
		/******************Herocarousal Validations***********************************/
		List<WebElement> Carousal_Image=driver.findElements(By.xpath("//div[@id='hero-carousel-wrapper']/div/div/img"));
		for(int i=0;i<Carousal_Image.size();i++){
			
			cf.Click(driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[3]/div/div[2]/div["+(i+1)+"]/img")));
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/div/div/h1/span")), Herocarousal_Text[i]);
			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/img")), Herocarousal_image[i]);
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/div/p/span")),Herocarousal_paragarph[i]);
			if(i!=0){//since in 1st hero Carousal link is not present
				
				cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/div/a")), Herocarousal_link_Text[i]);
				cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/div/a")), Herocarousal_link[i]);
				cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='hero-carousel-wrapper']/div[1]/div["+(i+1)+"]/div/a")));
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		/******************Accessories***********************************/
		
		
		
		
		
		Actions act = new Actions(driver);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[1]/li"));
        

	
		
	
		   for(int i=0;i<ele.size();i++){//C,CLA,E,S,CLS and GT
			
			WebElement Nonamgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[1]/li["+(i+1)+"]/div[1]/ul[1]"));
			//act.moveToElement(ele.get(i)).build().perform();
			cf.Javascriptmouseover(ele.get(i));
			cf.webdriverwait(Nonamgmodellocation);
			List<WebElement> Nonamgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[1]/li["+(i+1)+"]/div[1]/ul[1]/li/a"));
			for(int j=0;j<Nonamgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_link_1[i][j]);	
			//cf.Linkvalidation(SessionID,Nonamgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_1[i][j]);
				
				
			}
			
			
			WebElement amgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[1]/li["+(i+1)+"]/div[1]/ul[2]"));
			
			List<WebElement> amgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[1]/li["+(i+1)+"]/div[1]/ul[2]/li/a"));
			List<WebElement> amgmodellocation_img=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[1]/li["+(i+1)+"]/div[1]/ul[2]/li/a/img"));
			for(int j=0;j<amgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_link_1[i][j]);	
			//cf.Linkvalidation(SessionID,amgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_1[i][j]);
			cf.CheckWebImage(SessionID,amgmodellocation_img.get(j),TestDatafile.Acce_AMG_Img);
				
				
			}
			
			cf.Javascriptmouseover(driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/span")));	//Moving to Accessroies location
		}
		
		
		
		
		
		
		
		
		
		List<WebElement> ele_1=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[2]/li"));
       
		for(int i=0;i<ele_1.size();i++){//GLA,GLC,GLE,GLS and G
			
			WebElement Nonamgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[2]/li["+(i+1)+"]/div[1]/ul[1]"));
			//act.moveToElement(ele_1.get(i)).build().perform();
			cf.Javascriptmouseover(ele_1.get(i));
			cf.webdriverwait(Nonamgmodellocation);
			List<WebElement> Nonamgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[2]/li["+(i+1)+"]/div[1]/ul[1]/li/a"));
			List<WebElement> amgmodellocation_img=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[2]/li["+(i+1)+"]/div[1]/ul[2]/li/a/img"));
			for(int j=0;j<Nonamgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_link_2[i][j]);	
			//cf.Linkvalidation(SessionID,Nonamgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_2[i][j]);
				
				
			}
			
			WebElement amgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[2]/li["+(i+1)+"]/div[1]/ul[2]"));
			
			List<WebElement> amgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[2]/li["+(i+1)+"]/div[1]/ul[2]/li/a"));
			for(int j=0;j<amgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_link_2[i][j]);	
			//cf.Linkvalidation(SessionID,amgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_2[i][j]);
			cf.CheckWebImage(SessionID,amgmodellocation_img.get(j),TestDatafile.Acce_AMG_Img);	
				
			}
			
			cf.Javascriptmouseover(driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/span")));	//Moving to Accessroies location
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        List<WebElement> ele_2=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[3]/li"));
  
		for(int i=0;i<ele_2.size();i++){//SLC and SL
			
			WebElement Nonamgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[3]/li["+(i+1)+"]/div[1]/ul[1]"));
			//act.moveToElement(ele_2.get(i)).build().perform();
			cf.Javascriptmouseover(ele_2.get(i));
			cf.webdriverwait(Nonamgmodellocation);
			List<WebElement> Nonamgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[3]/li["+(i+1)+"]/div[1]/ul[1]/li/a"));
			List<WebElement> amgmodellocation_img=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[3]/li["+(i+1)+"]/div[1]/ul[2]/li/a/img"));
			for(int j=0;j<Nonamgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_link_3[i][j]);	
			//cf.Linkvalidation(SessionID,Nonamgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_3[i][j]);
			cf.CheckWebImage(SessionID,amgmodellocation_img.get(j),TestDatafile.Acce_AMG_Img);		
				
			}
			
			WebElement amgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[3]/li["+(i+1)+"]/div[1]/ul[2]"));
			
			List<WebElement> amgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[3]/li["+(i+1)+"]/div[1]/ul[2]/li/a"));
			for(int j=0;j<amgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_link_3[i][j]);	
			//cf.Linkvalidation(SessionID,amgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,amgmodellocation_link.get(j), TestDatafile.AMG_Model_3[i][j]);
				
				
			}
			
			cf.Javascriptmouseover(driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/span")));	//Moving to Accessroies location
		}
		
		
		
		
		
        List<WebElement> ele_3=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[4]/li"));
  
		for(int i=0;i<ele_3.size();i++){//B
			
			WebElement Nonamgmodellocation=driver.findElement(By.xpath("//div[@id='content-inner']/div[1]/div[1]/ul[4]/li["+(i+1)+"]/div[1]/ul[1]"));
			//act.moveToElement(ele_3.get(i)).build().perform();
			cf.Javascriptmouseover(ele_3.get(i));
			cf.webdriverwait(Nonamgmodellocation);
			List<WebElement> Nonamgmodellocation_link=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[4]/li["+(i+1)+"]/div[1]/ul[1]/li/a"));
			List<WebElement> amgmodellocation_img=driver.findElements(By.xpath("//div[@id='content-inner']/div[1]/div/ul[4]/li["+(i+1)+"]/div[1]/ul[2]/li/a/img"));
			for(int j=0;j<Nonamgmodellocation_link.size();j++){
				
			cf.Linknavigation(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_link_4[i][j]);	
			//cf.Linkvalidation(SessionID,Nonamgmodellocation_link.get(j));	
			cf.isTextPresent(SessionID,Nonamgmodellocation_link.get(j), TestDatafile.Non_AMG_Model_4[i][j]);
				
				
			}
			
			
			
		}
		
		/*******************Other validation************************************/
		cf.isTextPresent(SessionID,object.Genuine_Mercedes_Benz_Accessories, TestDatafile.Genuine_Mercedes_Benz_Accessories);
		for(int i=0;i<=1;i++){
			
			
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/p[2]/a["+(i+1)+"]")), lifestyle_collection_and_preorder_accesory[i]);
			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/p[2]/a["+(i+1)+"]")), lifestyle_collection_and_preorder_accesory_link[i]);
			//cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/p[2]/a["+(i+1)+"]")));
			
			
		}
		
		/*******************Bottom Tabs validation************************************/
		List<WebElement> bottontabs_img=driver.findElements(By.xpath("//div[@id='content-inner']/div[2]/div/div/a/img"));
		
		for(int i=0;i<bottontabs_img.size();i++){
			//image
			cf.CheckWebImage(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/a/img")), bottom_image[i]);
		    cf.imagevalidation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/a/img")));
		    cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/a")), bottom_text_heading_link[i]);
		   // cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/a")));
		    
		    
		    
		    //heading
		    cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/h2/a")), bottom_text_heading[i]);
		    cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/h2/a")), bottom_text_heading_link[i]);
		    //cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/h2/a")));
		    
		    //copy
		    cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/p/a")), bottom_copy[i]);
		    cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/p/a")), bottom_text_heading_link[i]);
		    //cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='content-inner']/div[2]/div/div["+(i+1)+"]/div/p/a")));
			
		}

		
		/******************Social site links***********************************/
		
		cf.isTextPresent(SessionID,object.Mercedes_Benz_Accessories, TestDatafile.Mercedes_Benz_Accessories);
		
		cf.isTextPresent(SessionID,object.Social_links, TestDatafile.Social_links);
		
		
		for(int i=0;i<=2;i++){
			cf.mouseover(object.Social_links, driver.findElement(By.xpath("//div[@id='siteshare-wrapper']/div/div/div/div/ul/li["+(i+1)+"]/a")));
			Thread.sleep(2000);
			cf.isTextPresent(SessionID,driver.findElement(By.xpath("//div[@id='siteshare-wrapper']/div/div/div/div/ul/li["+(i+1)+"]/a")), social_text[i]);
			cf.Linknavigation(SessionID,driver.findElement(By.xpath("//div[@id='siteshare-wrapper']/div/div/div/div/ul/li["+(i+1)+"]/a")),social_text_link[i]);
			//cf.Linkvalidation(SessionID,driver.findElement(By.xpath("//div[@id='siteshare-wrapper']/div/div/div/div/ul/li["+(i+1)+"]/a")));
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

	}

