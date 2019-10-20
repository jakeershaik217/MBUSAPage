package com.mbusa.theampage.test;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.junit.Test;

public class Email_attachment {
	@Test
	public  void run() throws EmailException  {
		Email_attachment email=new Email_attachment();
	    email.Email_attachment123("Report","shaik.jakeerhussain217@outlook.com","G:\\Jakeer\\MBUSATheampages\\Report\\Execution_Result\\Report 22.html");
	}
	
	public void Email_attachment123(String desc,String to,String location)throws EmailException {
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath(location);
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription(desc);
		  attachment.setName("Jakeer");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("shaik.jakeerhussain217@gmail.com", "jakeer786#"));
			email.setSSLOnConnect(true);
			email.setFrom("shaik.jakeerhussain217@gmail.com");
			email.setSubject("TestMail");
			email.setMsg("Report");
			email.addTo(to);
	        email.attach(attachment);
		    email.send();
	}
}
