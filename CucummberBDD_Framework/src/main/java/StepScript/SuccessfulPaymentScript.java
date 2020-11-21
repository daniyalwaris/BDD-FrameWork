package StepScript;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import org.junit.*;

public class SuccessfulPaymentScript
{
	WebDriver driver;
	
	@Given("^User is on the purchase page$")
	public void webpage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\daniyalwaris\\BDD-FrameWork\\chromedriver_mac64");
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
	
	
	@Then("^Then  User able to proceed with the checkout flow for purchasing Pillow$")
	public void customer_checkout()
	{
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a")).click(); 	
		driver.findElement(By.className("cart-checkout")).click();

	}
	
	@Then("^User able to purchase though the Credit card payment method$")
	public void customercheckout_paymentMethod()
	{
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a/div[1]/span")).click(); 	
		driver.findElement(By.xpath("//*[@id=\"payment-list\"]/div[1]/a")).click();
		driver.findElement(By.name("cardnumber")).sendKeys("4811111111111114");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input")).sendKeys("0221");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"application\"]/div[1]/a/div[1]/span")).click();
	}
	
	
	
	
	
	
}