package com.zephyr;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

import cucumber.api.java.en.Given;

public class myFirstSoapUITest {
	
	@Given("^Sending test report from SoapUI to JIRA\\.$")
	public void sending_test_report_from_SoapUI_to_JIRA() throws Throwable {
		
		  SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
		  runner.setProjectFile( "C:\\Users\\suree\\eclipse-workspace\\SoapUI2Jira_TM4J\\SoapUI_File\\CountryInfo-soapui-project.xml" );
		  runner.run(); 
	}

}
