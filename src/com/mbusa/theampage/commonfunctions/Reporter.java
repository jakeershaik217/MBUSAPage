
package com.mbusa.theampage.commonfunctions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.WebDriver;


/*//public class Reporter {

	private Sessions ses;
	String SessionID = "";
	String[] steps;
	String ExpResult = "";
	String image1 = "";

	
	public Reporter(String sessionID) {
	super();
	SessionID=sessionID;
	ses=ExecutionInstance.getSession(SessionID);
}*/

public class Reporter {
	
	
	private static final String TheampageValidation = null;
	public static int passCount = 0;
	public static int failCount = 0;
	public static int GeneralUpdate = 0;
	String reportPath = "G:\\Jakeer\\MBUSATheampages\\Report\\Execution_Result";
	String title = "Execution Report";
	
	static List<TestCaseResult> TestCases = new ArrayList<TestCaseResult>();
	

	String Description = TheampageValidation;
	
	public static void Fail(String scenarioID, String Description, String status)
	{
		TestCaseResult testcase= new TestCaseResult(scenarioID, Description, "FAIL");
		TestCases.add(testcase);
		failCount++;
	}
	
	
	public static void Pass(String scenarioID, String Description, String status){
	
		TestCaseResult testcase= new TestCaseResult(scenarioID, Description, "PASS");
		TestCases.add(testcase);
		passCount++;
	}
	
	public static void GeneralUpdate (String scenarioID, String Description, String status){
		
				TestCaseResult testcase= new TestCaseResult(scenarioID, Description, "GeneralUpdate");
		TestCases.add(testcase);
		GeneralUpdate++;
	}
	
		
	public static void publish(String testCaseID, String reportPath, String title)
	{
		String scenarioID = testCaseID;
		//System.out.println(" Entering into Publish Method");
		String HTMLContent = "<HTML><HEAD><TITLE>"+title+"</TITLE><style type=\"text/css\">"+
		" td.datacellone {	background-color: #FE8181; color: black;}" + //#CC9990 DEB887 yellow
		" td.datacelltwo { 	background-color: #64AD64; color: black;}"+ //#9999CC   #FF7F50 orange
		" td.datacellfail { background-color: #FE8181; color: yellow;}" + // color code change red - #DC143C;
		" td.datacellpass { background-color: #64AD64; color: black;}"+ // color code change green - #228B22;
		" td.datacellGeneralUpdate { background-color: #228B22; color: black;}</style>"+ // color code change green - #228B22;
		"</HEAD><BODY><FORM NAME=\"Form1\"><div align=center vertical-align=middle ><table border=1 ><tbody><tr><td>"+
		"<TABLE border=0 cellpadding=0 cellspacing=0 width=\"100%\" style=\"background-color: #E0E0E0;\"><TBODY><tr> <td height=80 style=\"font-size:18.0pt; font-weight:700; font-style:normal;"+
		"font-family:Cambria, sans-serif; text-align:center;vertical-align:middle; background:#454545;color:white;\"" +
		" width=570>Test Execution Results</td>" +
		"<td height=60 width=\"20%\" style=\" background:#454545;color:white;\"> <img  src=\"D:\\Sample\\logo.png\"  />" +
		"</td></tr></tbody></table></td></tr><tr><td>" ;
		
		//Summary of the Execution 
		HTMLContent+= "<table border=\"1\" style=\"background-color: #E0E0E0;\" ><tbody><tr><td><B>Total Test Run</td><td><pre>"+(failCount+passCount)+"</pre></td></tr>" +
				"<tr><td><B>Pass</td><td><pre>"+passCount+"</pre></td></tr>" +
				"<tr><td><B>Fail</td><td><pre>"+failCount+"</pre></td></tr>";

		HTMLContent+= "</td></tr> ";
		
		//Begining of the Table content 
		HTMLContent+= "<tr><td><table border=\"1\" style=\"background-color: #E0E0E0;\" ><tbody><tr><td><B>Test ID</td><td><B>Test Case Name</td><td><B>Status</td></tr>";
		for(int index =0; index < TestCases.size(); index++)
		{
			/*String css = "datacellone";
			if(index%2==1)
			{
				css = "datacelltwo";
			}
			String cell = "<td class = \""+css+"\">";
			HTMLContent+= "<tr>"+cell+TestCases.get(index).testCaseID+"</td>";
			HTMLContent+= cell+TestCases.get(index).Description+"</td>"; */
			
			String css = "datacelltwo";
			if(TestCases.get(index).status.equals("FAIL"))
			{
				css = "datacellone";
			}
			String cell = "<td class = \""+css+"\">";
			HTMLContent+= "<tr>"+cell+TestCases.get(index).testCaseID+"</td>";
			HTMLContent+= cell+TestCases.get(index).Description+"</td>";
			
			if(TestCases.get(index).status.equals("FAIL"))
				
				HTMLContent+= "<td class = \"datacellfail\">"+TestCases.get(index).status+"</td></tr>";
			else if (TestCases.get(index).status.equals("PASS"))
				HTMLContent+="<td class = \"datacellpass\">"+TestCases.get(index).status+"</td></tr>";
			else
				HTMLContent+="<td class = \"datacellGeneralUpdate\">"+TestCases.get(index).status+"</td></tr>";
		}
		
		//Ending of the Table Content
		HTMLContent+="</td></tr></tbody></table></div></body></html>";
		reportWritter(scenarioID,HTMLContent, reportPath);
	//	reportWritter(HTMLContent, reportPath);
	}
	
	private static void reportWritter(String scenarioID, String HTMLContent, String reportPath)
	//private static void reportWritter(String HTMLContent, String reportPath)
	{
		File log = new File(reportPath+"\\Report " +scenarioID + ".html");
	    try{
	    if(log.exists()==false){
	            System.out.println("We had to make a new file.");
	            log.createNewFile();
	    }
	    PrintWriter out = new PrintWriter(log);
	  
	    out.append(HTMLContent);
	    out.close();
	    }catch(IOException e){
	        System.out.println("COULD NOT LOG!!");
	    }
	}
	
	
	public static String getTimeStamp(){
		Date dateNow = new Date();
        SimpleDateFormat dateformatYYYYMMDD = new SimpleDateFormat("hhmmss");
        StringBuilder timeStamp = new StringBuilder( dateformatYYYYMMDD.format( dateNow ) );
	  //  String scrStr="Screenshot"+timeStamp.toString(); 
		return timeStamp.toString();
		}
	
	public static String getDate(){
	//	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(date.toString());
		return date.toString();
	}
	
	}



