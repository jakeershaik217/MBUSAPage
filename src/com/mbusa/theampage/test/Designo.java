package com.mbusa.theampage.test;



import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.commonfunctions.commonfunctions;
import com.mbusa.theampage.main.TestDatafile;
import com.mbusa.theampage.main.objectpropertyfile;



public class Designo extends Launch{
	
	commonfunctions cf = new commonfunctions();
	String SessionID = "8";
	
	@Test
	public void Design() throws Exception
	{
		
		objectpropertyfile object=PageFactory.initElements(driver, objectpropertyfile.class);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		
		Reporter.GeneralUpdate("ID 8", "Designo - Execution Started ", "");
		System.out.println(" Execution Started");
		
		driver.navigate().to("https://www.mbusa.com/mercedes/benz/design/designo");
		Thread.sleep(500);
		cf.isTextPresent(SessionID,object.EDP_Heading1_EDP, TestDatafile.DeS_designo_Data);
		cf.highLightweb(object.EDP_Highlight1);
		cf.isTextPresent(SessionID,object.EDP_SubHeading, TestDatafile.DeS_SubHeading_Data);
		cf.isTextPresent(SessionID,object.EDP_Content, TestDatafile.DeS_Content_Data);
		
		cf.CheckWebImage(SessionID,object.EDP_herojpg,TestDatafile.DeS_designo_heoimage );
		cf.isTextPresent(SessionID,object.DeS_subtout,TestDatafile.DeS_subtout_Data);
		for (int i = 0 ; i <=1; i++) {
			System.out.println(" Print i:: I " + i);
			WebElement DeS_subtoutlist1st = driver.findElement(By.xpath("//div[@class='module-copy']/div[2]/ul[1]/li["+(i+1)+"]"));
			cf.isTextPresent(SessionID,DeS_subtoutlist1st, TestDatafile.DeS_subtoutlist1st1_Data[i]);
		}
		for (int i = 0 ; i <=1; i++) {
			System.out.println(" Print i:: II " + i);
			WebElement DeS_classmodelcontainerlist = driver.findElement(By.xpath("//div[@class='des-vehicle-menu-wrapper clearer']/ul[2]/li["+(i+1)+"]/a"));
			cf.isTextPresent(SessionID,DeS_classmodelcontainerlist, TestDatafile.DeS_classmodelcontainerlist1_Data[i]);
			}
		cf.scrolldown(driver,object.DeS_Highlight1);
		Thread.sleep(500);
		cf.highLightweb(object.DeS_Highlight1);
		cf.isTextPresent(SessionID,object.DeS_designomodule, TestDatafile.DeS_designomodule_Data);
		cf.isTextPresent(SessionID,object.DeS_EClassSedanandWagon, TestDatafile.DeS_EClassSedanandWagon_Data);
		cf.isTextPresent(SessionID,object.DeS_EclassSeadenExpo, TestDatafile.DeS_EclassSeadenExpo_Data);
		cf.isTextPresent(SessionID,object.DeS_classmodelcontainer, TestDatafile.DeS_classmodelcontainer_Data);
		for (int i = 0 ; i <=1; i++) {
			System.out.println(" Print i:: III :: Also Available " + i);
			WebElement DeS_Alsoavailableonlist = driver.findElement(By.xpath("//div[@class='des-vehicle-menu-wrapper clearer']/div[1]/ul/li["+(i+1)+"]"));
			cf.isTextPresent(SessionID,DeS_Alsoavailableonlist, TestDatafile.DeS_Alsoavailableonlist1_Data[i]);
			}
		cf.scrolldown(driver,object.DeS_E63paintMagnoAlaniteGreythumbjpg);
		//cf.CheckWebImage(SessionID,object.DeS_E63paintMagnoAlaniteGreythumbjpg);
		cf.isTextPresent(SessionID,object.DeS_Exteriorpaints, TestDatafile.DeS_Exteriorpaints_Data);
		Thread.sleep(500);
		WebElement exterior = driver.findElement(By.xpath("//div[@class='designo-view-container']/div[1]/a"));
		exterior.click();
		Thread.sleep(1000);
		Reporter.GeneralUpdate("Scenario 2", "Exterior Paints Validations - Execution Started ", "");
		//Exterior Paints Validations
		for (int i = 0 ; i <=4; i++) {
			System.out.println(" Print i:: IV :: exteriorpaints :: " + i);
			WebElement exteriorpaints = driver.findElement(By.xpath("//div[@class='des-options paint']/ul/li["+(i+1)+"]")); 
			//executor.executeScript("arguments[0].click();", exteriorpaints);
			exteriorpaints.click(); //expand the exterrior image
			Thread.sleep(5000);
			WebElement DeS_Exteriorpaintscolorsnames = driver.findElement(By.xpath("//div[@class='des-options paint']/div/h4"));
			action.moveToElement(DeS_Exteriorpaintscolorsnames).build().perform();
			Thread.sleep(500);
			cf.isTextPresent(SessionID,DeS_Exteriorpaintscolorsnames, TestDatafile.DeS_Exteriorpaintscolorsnames_Data[i]);
			}
		WebElement exteriorclose = driver.findElement(By.xpath("//div[@class='large-view-container hide']/a"));
		exteriorclose.click(); // close the exterior image
		//cf.CheckWebImage(SessionID,object.DeS_EsedantrimNaturalBamboopng);
		WebElement AuburnBrown = driver.findElement(By.xpath("//div[@id='designo-module']/div[4]/ul/li[1]"));
		executor.executeScript("arguments[0].click();", AuburnBrown);
		Thread.sleep(500);
		//cf.getscreenshot(SessionID);
		cf.isTextPresent(SessionID,object.DeS_Interiorleather, TestDatafile.DeS_Interiorleather_Data);
		cf.isTextPresent(SessionID,object.DeS_InteriorTrim, TestDatafile.DeS_InteriorTrim_Data);
		Thread.sleep(500);
		WebElement Interior = driver.findElement(By.xpath("//div[@class='designo-view-container']/div[2]/a")); 
		Interior.click(); // Expand Interior image
		cf.scrolldown(driver, object.DeS_Highlight4);
		Thread.sleep(1000);
		Reporter.GeneralUpdate("Scenario 2", "Interior Leathers Validations - Execution Started ", "");
		//Interior Leathers Validations
		for (int i = 0 ; i <=6; i++) {
			System.out.println(" Print i:: V :: Interior :: " + i);
			WebElement Interiorcolors = driver.findElement(By.xpath("//div[@class='des-options leather']/ul/li["+(i+1)+"]")); 
			//Interiorcolors.click();
			executor.executeScript("arguments[0].click();", Interiorcolors);
			Thread.sleep(500);
			action.moveToElement(Interiorcolors).build().perform();
			Thread.sleep(3000);
			WebElement DeS_Optionleathernames = driver.findElement(By.xpath("//div[@class='des-options leather']/div/h4"));
			Thread.sleep(500);
			//cf.isTextPresent(DeS_Optionleathernames, TestDatafile.DeS_Optionleathernames_Data[i]);
			//if
					}
		Reporter.GeneralUpdate("Scenario 2", "Interior Trim Validations - Execution Started ", "");
		//Interior Trim Validations
			for (int j = 0 ; j <=2; j++) {
				System.out.println(" Print j:: InteriorTrim :: V :: " + j);
				WebElement InteriorTrim = driver.findElement(By.xpath("//div[@class='des-options trim']/ul/li["+(j+1)+"]")); 
				//InteriorTrim.click();
				executor.executeScript("arguments[0].click();", InteriorTrim);
				action.moveToElement(InteriorTrim).build().perform();
				Thread.sleep(3000);
				WebElement DeS_InteriorTrimnames = driver.findElement(By.xpath("//div[@class='des-options trim']/div/h4"));
				Thread.sleep(500);
				cf.isTextPresent(SessionID,DeS_InteriorTrimnames, TestDatafile.DeS_InteriorTrimnames_Data[j]);
					}
		
		WebElement Interiorclose = driver.findElement(By.xpath("//div[@class='large-view-container hide']/a")); 
		executor.executeScript("arguments[0].click();", Interiorclose);
		
		cf.scrolldown(driver, object.DeS_Highlight4);
		//cf.getscreenshot(SessionID);
		for (int i = 0 ; i <=6; i++) {
			
			WebElement Interiorcolors = driver.findElement(By.xpath("//div[@class='des-options leather']/ul/li["+(i+1)+"]")); 
			executor.executeScript("arguments[0].click();", Interiorcolors);
			Thread.sleep(200);
			action.moveToElement(Interiorcolors).build().perform();
			Thread.sleep(200);
			WebElement DeS_Optionleathernames = driver.findElement(By.xpath("//div[@class='des-options leather']/div/h4"));
			Thread.sleep(200);
			cf.isTextPresent(SessionID,DeS_Optionleathernames, TestDatafile.DeS_Optionleathernames_Data[i]);}
		
		for (int j = 0 ; j <=2; j++) {
			
			WebElement InteriorTrim = driver.findElement(By.xpath("//div[@class='des-options trim']/ul/li["+(j+1)+"]")); 
			executor.executeScript("arguments[0].click();", InteriorTrim);
			Thread.sleep(200);
			action.moveToElement(InteriorTrim).build().perform();
			Thread.sleep(200);
			WebElement DeS_InteriorTrimnames = driver.findElement(By.xpath("//div[@class='des-options trim']/div/h4"));
			Thread.sleep(200);
			cf.isTextPresent(SessionID,DeS_InteriorTrimnames, TestDatafile.DeS_InteriorTrimnames_Data[j]);
				}
		
		for (int i = 0 ; i <=2; i++) {
				System.out.println(" Print i:: disclaimer :: VI ::" + i);
			WebElement DeS_disclaimerlist = driver.findElement(By.xpath("//div[@id='des-disclaimer']/p["+(i+1)+"]"));
			cf.isTextPresent(SessionID,DeS_disclaimerlist, TestDatafile.DeS_disclaimerlist_Data[i]);
		}
		
			cf.isTextPresent(SessionID,object.DeS_BacktoTop, TestDatafile.DeS_BacktoTop_Data);

			//cf.scrolldownpage();
			cf.highLightweb(object.DeS_Highlight3);
			//cf.scrolldown(driver, driver.findElement(By.xpath("//div[@id='designo-module']/div[4]")));
			cf.scrolldown(driver, object.DeS_Highlight3);
			Thread.sleep(500);
			Reporter.GeneralUpdate("Scenario 2", "Individuality Module Validations - Execution Started ", "");
		//Individuality Module Validations
			cf.isTextPresent(SessionID,object.DeS_Individuality, TestDatafile.DeS_Individuality_Data);
			for (int i = 0 ; i <=3; i++) {
			
				System.out.println(" Print i:: Individuality :: VII ::" + i);
				WebElement DeS_Individualitysubheadlist = driver.findElement(By.xpath("//div[@id='module-4']/div/div/h3["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Individualitysubheadlist, TestDatafile.DeS_Individualitysubheadlist_Data[i]);
				
				WebElement DeS_Individualitycontentlist = driver.findElement(By.xpath("//div[@id='module-4']/div/div/p["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Individualitycontentlist, TestDatafile.DeS_Individualitycontentlist_Data[i]);
				
			}
			
			for (int i = 0 ; i <=9; i++) {
				
				System.out.println(" Print i:: Individuality - Color :: VIII ::" + i);
				
				WebElement DeS_colorswatches = driver.findElement(By.xpath("//div[@class='color-select clearer']/ul/li["+(i+1)+"]/div[2]/img"));
				//DeS_colorswatches.click();
				//executor.executeScript("arguments[0].click();", DeS_colorswatches);
				action.moveToElement(DeS_colorswatches).build().perform();
				Thread.sleep(2000);
				String DeS_colorstitlename = driver.findElement(By.xpath("//div[@class='color-select clearer']/ul/li["+(i+1)+"]/div[1]/div[1]/h5")).getText();
				Thread.sleep(2000);
				String DeS_colorswatchesname = driver.findElement(By.xpath("//div[@class='color-select clearer']/ul/li["+(i+1)+"]/div[1]/div[1]/p")).getText();
				cf.isTextPresent(SessionID,object.DeS_colorstitlename,TestDatafile.DeS_colorstitlename_Data[i]);
				cf.isTextPresent(SessionID,object.DeS_colorswatchesname,TestDatafile.DeS_colorswatchesname_Data[i]);
				WebElement image = driver.findElement(By.xpath("//div[@id='module-4']/div/div/div/ul/li["+(i+1)+"]/div[2]/img"));
				cf.CheckWebImage(SessionID,image, TestDatafile.DeS_colortitlelist[i]);
			}
			//cf.getscreenshot(SessionID);
			Reporter.GeneralUpdate("Scenario 2", "Quality Module Validations - Execution Started ", "");
			//Quality Module Validations
			cf.scrolldown(driver, object.DeS_Qualityswatches10lists);
			Thread.sleep(500);
			cf.isTextPresent(SessionID,object.DeS_Quality, TestDatafile.DeS_Quality_Data);
			for (int i = 0 ; i <=3; i++) {
				System.out.println(" Print i:: Quality - Module :: VIII ::" + i);
				WebElement DeS_Qualitysubheadlist = driver.findElement(By.xpath("//div[@id='module-5']/div/div/h3["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Qualitysubheadlist, TestDatafile.DeS_Qualitysubheadlist_Data[i]);
				
				WebElement DeS_Qualitycontentlist = driver.findElement(By.xpath("//div[@id='module-5']/div/div/p["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Qualitycontentlist, TestDatafile.DeS_Qualitycontentlist_Data[i]);
				
			}
			//cf.getscreenshot(SessionID);
			for (int i = 0 ; i <=7; i++) {
				
				System.out.println(" Print i:: Quality - Color :: IX ::" + i);
				WebElement Qcolorswatches = driver.findElement(By.xpath("//div[@id='module-5']/div/div/div/ul/li["+(i+1)+"]/div[2]/img"));
				action.moveToElement(Qcolorswatches).build().perform();
			//	colorswatches.click();
				Thread.sleep(2500);
				WebElement DeS_Qualitycolorsname = driver.findElement(By.xpath("//div[@id='module-5']/div/div/div/ul/li["+(i+1)+"]/div[1]/div[1]/h5"));
				WebElement DeS_Qualitycolors =     driver.findElement(By.xpath("//div[@id='module-5']/div/div/div/ul/li["+(i+1)+"]/div[1]/div[1]/p"));
				Thread.sleep(1000);
				cf.isTextPresent(SessionID,DeS_Qualitycolorsname, TestDatafile.DeS_Qualitycolorsname_Data[i]);
				cf.isTextPresent(SessionID,DeS_Qualitycolors, TestDatafile.DeS_Qualitycolors_Data[i]);
				WebElement image = driver.findElement(By.xpath("//div[@id='module-5']/div/div/div/ul/li["+(i+1)+"]/div[1]/img"));
				cf.CheckWebImage(SessionID,image,TestDatafile.DeS_Qualitycolortitlelist[i]);
			}
			//cf.getscreenshot(SessionID);
			Reporter.GeneralUpdate("Scenario 2", "Craftsmanship Module Validations - Execution Started ", "");
			//Craftsmanship Module Validations
			cf.scrolldown(driver, driver.findElement(By.xpath("//div[@id='module-6']/div/div/div/ul/li[1]/div/img")));
			Thread.sleep(500);
			cf.isTextPresent(SessionID,object.DeS_Craftsmanship, TestDatafile.DeS_Craftsmanship_Data);
			for (int i = 0 ; i <=3; i++) {
			
				System.out.println(" Print i:: Craftsmanship - Module :: IX ::" + i);
				WebElement DeS_Craftsmanshipsubheadlist = driver.findElement(By.xpath("//div[@id='module-6']/div/div/h3["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Craftsmanshipsubheadlist, TestDatafile.DeS_Craftsmanshipsubheadlist_Data[i]);
				
				WebElement DeS_Craftsmanshipcontentlist = driver.findElement(By.xpath("//div[@id='module-6']/div/div/p["+(i+1)+"]"));
				cf.isTextPresent(SessionID,DeS_Craftsmanshipcontentlist, TestDatafile.DeS_Craftsmanshipcontentlist_Data[i]);
				
			}
			
				cf.isTextPresent(SessionID,object.DeS_Craftsmanshipcolortitle, TestDatafile.DeS_Craftsmanshipcolor);
				cf.CheckWebImage(SessionID,object.DeS_Craftsmanshipimage,TestDatafile.DeS_designo_sclassimage);
				//cf.getscreenshot(SessionID);	
		cf.scrolldown(driver,object.DeS_Highlight2);
		Thread.sleep(500);
		Reporter.GeneralUpdate("Scenario 2", "YorLocalDealer Module Validations - Execution Started ", "");
		//YorLocalDealer Module Validations
		cf.isTextPresent(SessionID,object.DeS_InterestedinDO, TestDatafile.DeS_InterestedinDO_Data);
		cf.isTextPresent(SessionID,object.DeS_InterestedinDOcontent, TestDatafile.DeS_InterestedinDOcontent_Data);
		cf.isTextPresent(SessionID,object.DeS_YorLocalDealer, TestDatafile.EDP_YorLocalDealer_Data);
		cf.isTextPresent(SessionID,object.DeS_YorLocalDealerinfo, TestDatafile.EDP_YorLocalDealerinfo_Data);
		cf.isTextPresent(SessionID,object.DeS_YorLocalDealerZip, TestDatafile.EDP_YorLocalDealerZip_Data);
		cf.isButtonfound(SessionID,object.DeS_YorLocalDealerZipbtn);
		//cf.getscreenshot(SessionID);
		System.out.println(" Execution End");
		Reporter.GeneralUpdate("Scenario 8", "Designo Execution End ", "");
		
	}
}
