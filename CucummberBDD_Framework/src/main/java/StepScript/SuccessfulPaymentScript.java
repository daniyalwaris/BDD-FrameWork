package StepScript;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;

public class SuccessfulPaymentScript
{
	WebDriver driver;
	
	@Given("^User is on the purchase page$")
	public void webpage() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\daniyalwaris\\BDD-FrameWork\\chromedriver_mac64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.midtrans.com/");
		
		
	}
	
	@When("^title of page is coco$")
	public void webpage_validation()
	{
		
		
			String title = driver.getTitle();
			System.out.println(title);		
			Assert.assertEquals("Sample Store", title);
		
	}
	
	
	@Then("^User able to proceed with the checkout flow for purchasing Pillow$")
	public void customer_checkout()
	{
			
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a")).click(); 	
				driver.findElement(By.className("cart-checkout")).click();

	}
	
	@Then("^User able to purchase though the Credit card payment method and Enter the \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void customercheckout_paymentMethod(String creditCardNumber, String expiryDate, String OPT)
	{
		//*[contains(text(),\"Continue\")]
		 	driver.switchTo().frame(0);
		 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.className("button-main-content")).click(); 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"payment-list\"]/div[1]/a")).click();
			driver.findElement(By.name("cardnumber")).sendKeys(creditCardNumber);
			driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")).sendKeys(expiryDate);
			driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")).sendKeys(OPT);
			driver.findElement(By.className("button-main-content")).click();
		
	}
	
	
	
	
	
	
}