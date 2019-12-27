package com.zephyr;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"bdd-export5718803273015028755"},
glue= {"com.zephyr"},
format= {"junit:target/junit/Test-soaui_report.xml"})		

public class TestRunner {

}
