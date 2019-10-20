package com.mbusa.theampage.test;



import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.SimpleEmail;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.mbusa.theampage.main.TestDatafile;

public class Launch extends TestDatafile {
	

		
		public static String browsefirefox="firefox";
		public static String browseinternerexe="internetexplorer";

		public static WebDriver driver;
   
		TestDatafile ob=new TestDatafile();

		@Before
		public void setup() throws InterruptedException, Exception{
			
			//System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
			System.setProperty("webdriver.chrome.driver", "G:\\Jakeer\\chromedriver.exe");
			
	   driver=new ChromeDriver();
			//driver=new FirefoxDriver();
			//driver = new InternetExplorerDriver();
			
			//driver.navigate().to("https://www.mbusa.com"+page_title_Maintinance_Manual);
			//driver.navigate().to("https://www.mbusa.com"+page_title);
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		@AfterTest
			public void setclose() throws InterruptedException, Exception{
			
			driver.close();
}
		
		@After
		public  void main() throws Exception {
			
			EmailAttachment attachment = new EmailAttachment();
			 attachment.setPath("C:\\Users\\VAMSI\\Desktop\\Vamsi_IOT_Resume.pdf");
			 attachment.setDisposition(EmailAttachment.ATTACHMENT);
			 attachment.setDescription("Vamsi");
			 attachment.setName("Jakeer");
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("shaik.jakeerhussain217@gmail.com", "jakeer786#"));
			email.setSSLOnConnect(true);
			email.setFrom("shaik.jakeerhussain217@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("shaik.jakeerhussain217@outlook.com");
			email.send();
		}
}
