package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\daniyalwaris\\BDD-FrameWork\\CucummberBDD_Framework\\src\\main\\java\\Feature\\Successful_Payment.feature", //Path of the feature File
		glue= {"StepScript"}, 						//Path of the Script File
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}, // In order to generate the output file for the system.
		strict = true,   // This attricbute will map from the Feature File
		monochrome = true 							//Display the concole output in a proper readable format
		
		)

public class TestRunner
{
	
	}