package com.mbusa.theampage.commonfunctions;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbusa.theampage.commonfunctions.Reporter;
import com.mbusa.theampage.test.Launch;
//import com.thoughtworks.selenium.webdriven.commands.Highlight;

public class commonfunctions extends Launch {

	// private Sessions ses;
	String SessionID = "1";
	String[] steps;
	String ExpResult = "";
	String Actual = "";
	String image1 = "";

	// WebDriver driver = new ChromeDriver();

	public commonfunctions(String sessionID) {
		super();
		// SessionID=sessionID;

		// ses=ExecutionInstance.getSession(SessionID);
	}

	public commonfunctions() {
		// TODO Auto-generated constructor stub
	}
	
	public void CheckWebImage(String SessionID,WebElement image,String s) throws Exception {

		Thread.sleep(100);
		highLightweb(image);
		//imagefilename(image);

		try {
			String str=(image).getAttribute("src");
			if ((image).getAttribute("src") != null) {
				
				if((image).getAttribute("src").contains(s)==true){
				highLightweb(image);
				System.out.println("Result :: Pass ");
				System.out.println(" Image Exists As Expected :: "+"File Name :: " + (image).getAttribute("src")+"   ");
				Reporter.Pass(SessionID, " " + " Image Exists As Expected :: "
						+ "File Name :: " + (image).getAttribute("src"), "   ");
				
				
				
				Reporter.Pass(SessionID, " "+"Pass"+" ", "   ");
				Reporter(SessionID, driver);
				
				}
				
				else {
					highLightwebwrong(image);
					System.out.println("Result :: Fail ");
					Reporter.Fail(SessionID, " " + " Image is not matching between TEST DATA and APPLICATION  :: "+"\n"+"Expected :: "+">>>>>>"+ (image).getAttribute("src")
							+"--------------"+"Actual :: " +">>>>>>"+s, "   ");
					Reporter(SessionID, driver);
				}
			}

			else{
				highLightwebwrong(image);
				System.out.println("Result :: Fail ");
				Reporter.Fail(SessionID, " " + " Image is not Exist  :: "+"\n"+"Expected :: "+">>>>>>"+ (image).getAttribute("src")
						+"--------------"+"Actual :: " +">>>>>>"+s, "   ");
				Reporter(SessionID, driver);
				
			}
			

		} catch (Exception e) {
			System.out
					.println("Image Exisit - But Attribute 'alt' is not Present");
			e.printStackTrace();
		}
	}

	public void imagefilename(WebElement image) throws Exception {

		System.out.println(" Print ------------>  " + image);

		if (image.getAttribute("alt") != null) // this code used in optionsC300W
												// method
		{
			String filename = (image).getAttribute("alt");
			System.out.println(" Print alt ---------> " + filename);
			Reporter.Pass(SessionID, " " + " Image Exists As Expected :: "
					+ "File Name :: " + filename, "   ");
			Reporter(SessionID, driver);
		} else if (image.getAttribute("class") != null) {
			String filename = (image).getAttribute("class");
			System.out.println(" Print class ---------> " + filename);
			Reporter.Pass(SessionID, " " + " Image Exists As Expected :: "
					+ "File Name :: " + filename, "   ");
			Reporter(SessionID, driver);
		} else {
			String filename = image.getAttribute("src");
			System.out.println(" Print src ---------> " + filename);
			Reporter.Pass(SessionID, " " + " Image Exists As Expected :: "
					+ "File Name :: " + filename, "   ");
			Reporter(SessionID, driver);
		}
	}

	public void highLightweb(WebElement element) {

		WebElement webElement = null;
		webElement = element;
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript(
				"arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');",
				webElement);

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript(
				"arguments[0].setAttribute('style','border: solid 2px white');",
				webElement);

	}
	
	public void highLightwebwrong(WebElement element) {

		WebElement webElement = null;
		webElement = element;
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript(
				"arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
				webElement);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript(
				"arguments[0].setAttribute('style','border: solid 2px white');",
				webElement);

	}
/*
	public void isTextPresent(String SessionID,WebElement element, String value)
			throws Exception {

		System.out
				.println("Entering into isElement Present method----------->");

		System.out.println("Print Actual ----------->" + element.getText());
		System.out.println("Print Expected ----------->" + value);
         
		
		try {
			
			 if(element.getText().contains("\n") || element.getText().contains("\r") || element.getText().contains("\r\n") || element.getText().contains("\n\n")||element.getText().contains("\f") || element.getText().contains("\f\n"))
             {
				  String str= element.getText().replaceAll("\\r|\\n", " ").trim();
				  String str1=element.getText().replaceAll("\n", "").trim();

			if (element.getText().replaceAll("\n", "").trim().equals(value)) {
				highLightweb(element);
				System.out.println("AS Expected  " + element.getText() + ""
						+ " <-->" + " " + value + " :: Pass");
				Reporter.Pass(SessionID, "      "
						+ " As Expected -- Text is Present  :: "
						+ " 'Expected Text' --> " + element.getText(),
						"         ");
				Reporter(SessionID, driver);
			}
			// Reporter(ses.getDriver());}
			else {
				highLightwebwrong(element);
				
				System.out.println("Not As Expected " + element.getText() + ""
						+ " <-->" + " " + value + " :: Fail");
				Reporter.Fail(SessionID, "      "
						+ " Not Expected -- Text is Not Present :: "
						+ "Validation :: failed " + "Expected ::"+value+"    Actual ::"+element.getText(),
						"       ");
				Reporter(SessionID, driver);
			}
			// Reporter(ses.getDriver());}
		}
			 
			 else{
				 String str=element.getText().replaceAll("\n", "").trim();
				 String sm=element.getText().trim();
				 if (element.getText().replaceAll("\n", "").trim().equals(value)) {
						highLightweb(element);
						System.out.println("AS Expected  " + element.getText() + ""
								+ " <-->" + " " + value + " :: Pass");
						Reporter.Pass(SessionID, "      "
								+ " As Expected -- Text is Present  :: "
								+ " 'Expected Text' --> " + element.getText(),
								"         ");
						Reporter(SessionID, driver);
					}
					// Reporter(ses.getDriver());}
					else {
						highLightwebwrong(element);
						
						System.out.println("Not As Expected " + element.getText() + ""
								+ " <-->" + " " + value + " :: Fail");
						Reporter.Fail(SessionID, "      "
								+ " Not Expected -- Text is Not Present :: "
								+ "Validation :: failed " + "Expected ::"+value+"    Actual ::"+element.getText(),
								"       ");
						Reporter(SessionID, driver);
					}
				 
				 
			 }
			 
		}	 

		catch (Exception e)

		{

			System.out.println("Elemenet Not Present");
			e.printStackTrace();

		}
	}
*/
	
	public void isTextPresent(String SessionID,WebElement element, String value)
            throws Exception {

     System.out
                  .println("Entering into isElement Present method----------->");

    
    

     
     try {
            if(element.getText().contains("\n") || element.getText().contains("\r") || element.getText().contains("\r\n") || element.getText().contains("\n\n")||element.getText().contains("\f") || element.getText().contains("\f\n"))
   {
                   String str= element.getText().replaceAll("\\r|\\n", "").trim();
                   System.out.println("Print Actual ----------->" + str);
                   System.out.println("Print Expected ----------->" + value);
                   if (str.equals(value)) {
                                highLightweb(element);
                                System.out.println("Print Actual ----------->" + str);
                                System.out.println("AS Expected  " + str + ""
                                              + " <-->" + " " + value + " :: Pass");
                                Reporter.Pass(SessionID, "      "
                                              + " As Expected -- Text is Present  :: "
                                              + " 'Expected Text' --> " + str,
                                              "         ");
                                Reporter(SessionID, driver);
                         }
                         // Reporter(ses.getDriver());}
                         else {
                                highLightwebwrong(element);
                                
                                System.out.println("Not As Expected " + str + ""
                                              + " <-->" + " " + value + " :: Fail");
                                Reporter.Fail(SessionID, "      "
                                              + " Not Expected -- Text is Not Present :: "
                                              + "Validation :: failed " + "Expected ::"+value+"    Actual ::"+str,
                                              "       ");
                                Reporter(SessionID, driver);
                         }
                   
   }

            else{
            	String str= element.getText().replaceAll("\n", "").trim();
            if (element.getText().replaceAll("\n", "").trim().equals(value)) {
            	
            	System.out.println("Print Actual ----------->" + element.getText().replaceAll("\n", "").trim());
                System.out.println("Print Expected ----------->" + value);
                  highLightweb(element);
                  System.out.println("Print Actual ----------->" + element.getText());
                  System.out.println("AS Expected  " + element.getText() + ""
                                + " <-->" + " " + value + " :: Pass");
                  Reporter.Pass(SessionID, "      "
                                + " As Expected -- Text is Present  :: "
                                + " 'Expected Text' --> " + element.getText(),
                                "         ");
                  Reporter(SessionID, driver);
            }
            // Reporter(ses.getDriver());}
            else {
            	String str1=element.getText().trim();
            	System.out.println("Print Actual ----------->" + element.getText().trim());
                System.out.println("Print Expected ----------->" + value);
                  highLightwebwrong(element);
                  
                  System.out.println("Not As Expected " + element.getText() + ""
                                + " <-->" + " " + value + " :: Fail");
                  Reporter.Fail(SessionID, "      "
                                + " Not Expected -- Text is Not Present :: "
                                + "Validation :: failed " + "Expected ::"+value+"    Actual ::"+element.getText(),
                                "       ");
                  Reporter(SessionID, driver);
            }
            // Reporter(ses.getDriver());}
     }
     }
     catch (Exception e)

     {

            System.out.println("Elemenet Not Present");
            e.printStackTrace();

     }
}
	public void isTextPresentfrominputbox(String SessionID,WebElement element, String value){
		


	     System.out
	                  .println("Entering into isElement Present method----------->");

	    
	    

	     
	     try {
	            if(element.getAttribute("value").contains("\n") || element.getAttribute("value").contains("\r") || element.getAttribute("value").contains("\r\n") || element.getAttribute("value").contains("\n\n")||element.getAttribute("value").contains("\f") || element.getAttribute("value").contains("\f\n"))
	   {
	                   String str= element.getAttribute("value").replaceAll("\\r|\\n", "").trim();
	                   System.out.println("Print Actual ----------->" + str);
	                   System.out.println("Print Expected ----------->" + value);
	                   if (str.equals(value)) {
	                                highLightweb(element);
	                                System.out.println("Print Actual ----------->" + str);
	                                System.out.println("AS Expected  " + str + ""
	                                              + " <-->" + " " + value + " :: Pass");
	                                Reporter.Pass(SessionID, "      "
	                                              + " As Expected -- Text is Present  :: "
	                                              + " 'Expected Text' --> " + str,
	                                              "         ");
	                                Reporter(SessionID, driver);
	                         }
	                         // Reporter(ses.getDriver());}
	                         else {
	                                highLightwebwrong(element);
	                                
	                                System.out.println("Not As Expected " + str + ""
	                                              + " <-->" + " " + value + " :: Fail");
	                                Reporter.Fail(SessionID, "      "
	                                              + " Not Expected -- Text is Not Present :: "
	                                              + "Validation :: failed " + "Expected ::"+value+"    Actual ::"+str,
	                                              "       ");
	                                Reporter(SessionID, driver);
	                         }
	                   
	   }

	            else{
	            	String str= element.getAttribute("value").replaceAll("\n", "").trim();
	            if (element.getAttribute("value").replaceAll("\n", "").trim().equals(value)) {
	            	
	            	System.out.println("Print Actual ----------->" + element.getAttribute("value").replaceAll("\n", "").trim());
	                System.out.println("Print Expected ----------->" + value);
	                  highLightweb(element);
	                  System.out.println("Print Actual ----------->" + element.getAttribute("value"));
	                  System.out.println("AS Expected  " + element.getAttribute("value") + ""
	                                + " <-->" + " " + value + " :: Pass");
	                  Reporter.Pass(SessionID, "      "
	                                + " As Expected -- Text is Present  :: "
	                                + " 'Expected Text' --> " + element.getAttribute("value"),
	                                "         ");
	                  Reporter(SessionID, driver);
	            }
	            // Reporter(ses.getDriver());}
	            else {
	            	String str1=element.getAttribute("value").trim();
	            	System.out.println("Print Actual ----------->" + element.getAttribute("value").trim());
	                System.out.println("Print Expected ----------->" + value);
	                  highLightwebwrong(element);
	                  
	                  System.out.println("Not As Expected " + element.getAttribute("value") + ""
	                                + " <-->" + " " + value + " :: Fail");
	                  Reporter.Fail(SessionID, "      "
	                                + " Not Expected -- Text is Not Present :: "
	                                + "Validation :: failed " + "Expected ::"+value+"    Actual ::"+element.getAttribute("value"),
	                                "       ");
	                  Reporter(SessionID, driver);
	            }
	            // Reporter(ses.getDriver());}
	     }
	     }
	     catch (Exception e)

	     {

	            System.out.println("Elemenet Not Present");
	            e.printStackTrace();

	     }

		
		
	}
	public boolean isButtonfound(String SessionID,WebElement string) throws Exception {

		boolean isDisplay = string.isDisplayed();
		boolean isEnabled = string.isEnabled();
		if (isDisplay && isEnabled )

		{
			System.out.println("Button is Present :: Pass");
			Reporter.Pass(SessionID, string.getText()
					+ " <-- Button is Present :: :: "
					+ "Validation Success :: ", "         ");
			Reporter(SessionID, driver);
		}

		else

		{
			System.out.println("Button is Display :: Fail");
			Reporter.Fail(SessionID, string.getText()
					+ " <-- Button is not Present :: :: "
					+ "Validation Failed :: ", "       ");
			Reporter(SessionID, driver);
		}

		return isDisplay;

	}

	public void isDisplay(String SessionID,WebElement string) throws Exception {

		/*
		 * System.out.println("Entering into isDisplay Method");
		 * System.out.println("Print String :: " + string);
		 */

		boolean isDisplay = string.isDisplayed();
		if (isDisplay == true)

		{
			System.out.println("Element is Display :: Pass");
			Reporter.Pass(SessionID, "      "
					+ " As Expected Filed is Present / Display  :: "
					+ "Validation :: Success " + string, "         ");
			Reporter(SessionID, driver);
		}
		else
		{
			System.out.println("Element is Display :: Fail");
			Reporter.Fail(SessionID, "      "
					+ " Not as Expected Filed is not Present / Display  :: "
					+ "Validation :: Failed " + string, "       ");
			Reporter(SessionID, driver);
		}

		return;
	}
	
	public void isenabled(String SessionID,WebElement string) throws Exception {

		/*
		 * System.out.println("Entering into isDisplay Method");
		 * System.out.println("Print String :: " + string);
		 */

		boolean isDisplay = string.isEnabled();
		if (isDisplay == true)

		{
			System.out.println("Element is Display :: Pass");
			Reporter.Pass(SessionID, "      "
					+ " As Expected Filed is Present / Display  :: "
					+ "Validation :: Success " + string, "         ");
			Reporter(SessionID, driver);
		}
		else
		{
			System.out.println("Element is Display :: Fail");
			Reporter.Fail(SessionID, "      "
					+ " Not as Expected Filed is not Present / Display  :: "
					+ "Validation :: Failed " + string, "       ");
			Reporter(SessionID, driver);
		}

		return;
	}

	public void scrolldown(WebDriver driver, WebElement element) {

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", element);

	}

	public void scrolldownpage() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250);");

	}

	public void scrolluppage() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, -250);");

	}

	public static void Reporter(String testCaseID, WebDriver webDriver) {

		// System.out.println(" Entering into Reporter Method");
		Reporter.publish(testCaseID,
				"G:\\Jakeer\\MBUSATheampages\\Report\\Execution_Result",
				"Execution Report");
	}
	
	
	
	public  void Linknavigation(String SessionID,WebElement element,String value) {

		System.out
				.println("Entering into isElement Present method----------->");

		System.out.println("Print Actual Link ----------->" + element.getAttribute("href"));
		System.out.println("Print Expected Link ----------->" + value);
         
		
		try {

			if (element.getAttribute("href").replaceAll("\n", "").equals(value)) {
				highLightweb(element);
				System.out.println("AS Expected  " + element.getAttribute("href") + ""
						+ " <-->" + " " + value + " :: Pass");
				Reporter.Pass(SessionID, "      "
						+ " As Expected -- Link Text is Present  :: "
						+ " 'Expected Link Text' --> " + element.getAttribute("href"),
						"         ");
				Reporter(SessionID, driver);
			}
			// Reporter(ses.getDriver());}
			else {
				highLightwebwrong(element);
				
				System.out.println("Not As Expected " + element.getAttribute("href") + ""
						+ " <-->" + " " + value + " :: Fail");
				Reporter.Fail(SessionID, "      "
						+ " Not Expected -- Link Text is Not Present :: "
						+ "Validation :: failed " + "Expected ::"+value+"    Actual ::"+element.getAttribute("href"),
						"       ");
				Reporter(SessionID, driver);
			}
			// Reporter(ses.getDriver());}
		}

		catch (Exception e)

		{

			System.out.println("Elemenet Not Present");
			e.printStackTrace();

		}
	}
	
	
	public  void Linkvalidation(String SessionID,WebElement element) {

		if(verifyAllLinks(element.getAttribute("href"))!=null){
			
			if(verifyAllLinks(element.getAttribute("href")).equals("OK")){
			
			System.out.println("Link---"+" "+element.getAttribute("href")+" "+":: is Working");
			Reporter.Pass(SessionID, "      "+"Link ::  Pass"+"   ", " ");
			Reporter(SessionID, driver);
			
			}
			
			else{
				
				
				System.out.println("Link---"+" "+element.getAttribute("href")+" "+":: is Not Working");
				Reporter.Fail(SessionID, "      "+"Link ::  Fail"+"   "+"Expected ::   OK        Actual  ::   "+element.getAttribute("href")+"   ", " ");
				Reporter(SessionID, driver);
			}
			
		}
		
		else{
			
			System.out.println(">>>>>>>>>>>>>>>Internet Server Issue>>>>>>>>>>>>>>>>>>>>>>>>>");
			Reporter.Fail(SessionID, "      "+"Link ::  Fail"+"   "+"Expected ::   OK        Actual  ::   "+"NULL"+"   ", " ");
			Reporter(SessionID, driver);
			
			
			
		}
		
		
		
		
	}

	
	public  void imagevalidation(String SessionID,WebElement element) {

		if(verifyAllLinks(element.getAttribute("src"))!=null){
			
			if(verifyAllLinks(element.getAttribute("src")).equals("OK")){
				
				
			
			System.out.println("Link---"+" "+element.getAttribute("src")+" "+":: is Working");
			Reporter.Pass(SessionID, "      "+"Link ::  Pass"+"   ", " ");
			Reporter(SessionID, driver);
			
			}
			
			else{
				
				
				System.out.println("Link---"+" "+element.getAttribute("src")+" "+":: is Not Working");
				Reporter.Fail(SessionID, "      "+"Link ::  Fail"+"   "+"Expected ::   OK        Actual  ::   "+element.getAttribute("href")+"   ", " ");
				Reporter(SessionID, driver);
			}
			
		}
		
		else{
			
			System.out.println(">>>>>>>>>>>>>>>Internet Server Issue>>>>>>>>>>>>>>>>>>>>>>>>>");
			Reporter.Fail(SessionID, "      "+"Link ::  Fail"+"   "+"Expected ::   OK        Actual  ::   "+"NULL"+"   ", " ");
			Reporter(SessionID, driver);
			
			
			
		}
		
		
		
		
	}
	
	public void Inputbox(WebElement element,String Str) {
		  
		element.sendKeys(Str);

	}
	public void Inputboxbyjavascript(WebElement element,String Str) {
		  
		((JavascriptExecutor)driver).executeScript("arguments[0].value="+"'"+Str+"'"+";",element);

	}
	public void Click(WebElement element) throws Exception {
		  
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		Thread.sleep(1000);

	}
	public void Clickandwait(WebElement element1,WebElement element2) throws Exception {
		  
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element1);
		WebDriverWait wait=new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.visibilityOf(element2));

	}

	
public  String  verifyAllLinks(String linkUrl)
{
    try 
    {
       URL url = new URL(linkUrl);
       HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
       httpURLConnect.setConnectTimeout(3000);
       httpURLConnect.connect();
       
       if(httpURLConnect.getResponseCode()==200)
       {
         // System.out.println(linkUrl+" ------> "+httpURLConnect.getResponseMessage());
    	   return httpURLConnect.getResponseMessage();
        }
       else if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
       {
           //System.out.println(linkUrl+" ------> "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
    	   return httpURLConnect.getResponseMessage();
        }
       else if(httpURLConnect.getResponseCode()!=HttpURLConnection.HTTP_NOT_FOUND &&httpURLConnect.getResponseCode()>200)  
       {
    	   //System.out.println(linkUrl+" ------> "+httpURLConnect.getResponseMessage());
    	   return httpURLConnect.getResponseMessage();
        }
    } catch (Exception e) {
       System.out.println("Exception");
    }
	return null;
} 



public void dropdown(WebDriver driver,String s[],WebElement element) throws Exception {
	
	
	

	int count=0;
	WebElement eme = element;
	highLightweb(element);
	Select sel1 = new Select(eme);
	List<WebElement> top = sel1.getOptions();
	for(int i=0;i<top.size();i++){
		
		
		if(top.get(i).getText().equals(s[i])){
			
			++count;
			
		}
		
	}
	
	if(top.size()==count){
		
		System.out.println("Dropdown ---"+" "+" "+":: is Working");
		Reporter.Pass(SessionID, "      "+"Dropdown ::  Pass"+"   ", " ");
		Reporter(SessionID, driver);
		
	}
	else{
		
		System.out.println("Dropdown ---"+" "+" "+":: is Working");
		Reporter.Fail(SessionID, "      "+"Dropdown ::  Fail"+"   ", " ");
		Reporter(SessionID, driver);
		
		
	}
		
		
	
		
		}

public void webdriverwait(WebElement element){
	
	WebDriverWait wait= new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}
public void Javascriptmouseover(WebElement element){
	
	 String javaScript = "var evObj = document.createEvent('MouseEvents');" +
             "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
             "arguments[0].dispatchEvent(evObj);";
	 ((JavascriptExecutor)driver).executeScript(javaScript, element);
	
}

public void mouseover(WebElement element1,WebElement element2){
	
	
	Actions act = new Actions(driver);
	act.moveToElement(element1).build().perform();
	WebDriverWait wait= new WebDriverWait(driver, 180);
	wait.until(ExpectedConditions.visibilityOf(element2));
	
}
/*public void getscreenshot(String testCaseID) throws Exception 
{
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("D:\\Workspace\\MBUSATheampages\\Report\\Screenshots\\ScenarioID_"+testCaseID+getTimeStamp()+".png"));
}*/
/*public void Selectwebelement_Maintainance_Manual(WebElement eme,WebElement ene) throws Exception {
	
	
	
	ArrayList a1 = new ArrayList();
	highLightweb(eme);
	Select sel1 = new Select(eme);
	List<WebElement> top = sel1.getOptions();
	for(WebElement el:top){
		String top_str = el.getText();
		a1.add(top_str);
		
		}
	try{
	for(int i=1;i<a1.size();i++){
		
		
		sel1.selectByIndex(i);
		Thread.sleep(1000);
		highLightweb(ene);
		Select sel2 = new Select(ene);
		List<WebElement> down = sel2.getOptions();
		for(int k=1;k<down.size();k++){
			
			sel1.selectByIndex(i);
			sel2.selectByIndex(k);
			Thread.sleep(3000);
			
			
			
			
		}
		
		
	}

	
	}catch(Exception e){
		
		
	}		
		

		*/
		
		
		
	
	
	



}