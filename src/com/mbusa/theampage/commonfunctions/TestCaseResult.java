package com.mbusa.theampage.commonfunctions;

public class TestCaseResult {

	public String testCaseID;
	public String Description; 
	public String status;
	
	public TestCaseResult(String testCaseID, String Description, String status) {
		super();
		this.testCaseID = testCaseID;
		this.Description = Description;
		this.status = status;
	}
}