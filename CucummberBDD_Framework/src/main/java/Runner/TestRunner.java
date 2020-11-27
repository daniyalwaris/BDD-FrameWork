package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\daniyalwaris\\BDD-FrameWork\\CucummberBDD_Framework\\src\\main\\java\\Feature\\Fail_Payment.feature", //Path of the feature File
		glue= {"StepScript"}, 						//Path of the Script File
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, // In order to generate the output file for the system.
		strict = true,   // This attricbute will map from the Feature File
		//dryRun = true ,
		//tags = {"@RegressionTest","@SmokeTest"},   // This will run only those scenario which have tag of Regression. 
				//1. {"@RegressionTest","@SmokeTest"} = AND Include both   whereas  {"@RegressionTest,@SmokeTest"} = OR which include either one of the them. In order to igone the test script execute ~ use this special character
		monochrome = true 							//Display the concole output in a proper readable format
		
		)



public class TestRunner
{
	
	}