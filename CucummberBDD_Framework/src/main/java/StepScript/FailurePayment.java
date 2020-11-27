package StepScript;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;

public class FailurePayment
{
	WebDriver driver;
	
	@Given("^User is on the webPage For buying pillows$")
	public void webpage() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\daniyalwaris\\BDD-FrameWork\\chromedriver_mac64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.midtrans.com/");
		
		
	}
	
	@When("^title of page is Sample Store$")
	public void webpage_validation()
	{
		
		
			String title = driver.getTitle();
			System.out.println(title);		
			Assert.assertEquals("Sample Store", title);
		
	}
	
	
	@Then("^User able to proceed with the payment checkout$")
	public void customer_checkout()
	{
			
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a")).click(); 	
				driver.findElement(By.className("cart-checkout")).click();

	}
	
	@Then("^User able to enter the Credit card details$")
	public void customercheckout_paymentMethod(DataTable CardDetail)
	{
		List<Map<String, String>> data =  CardDetail.asMaps(String.class,String.class);
		
		 	driver.switchTo().frame(0);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.className("button-main-content")).click(); 
			driver.findElement(By.xpath("//*[@id=\"payment-list\"]/div[1]/a")).click();
			
			
			driver.findElement(By.name("cardnumber")).sendKeys(data.get(0).get("CerditCardNumber"));
			driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")).sendKeys(data.get(0).get("Expirydate"));
			driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")).sendKeys(data.get(0).get("OPT"));
			driver.findElement(By.className("button-main-content")).click();
		
	}
	
	
	
	
	 
	
}