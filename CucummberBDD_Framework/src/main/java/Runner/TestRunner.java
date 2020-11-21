package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\daniyalwaris\\BDD-FrameWork\\CucummberBDD_Framework\\src\\main\\java\\Feature\\Successful_Payment.feature",
		glue= {"StepScript"}
		
		)

public class TestRunner
{
	
	}