package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsForSalesForceStatic {

	ChromeDriver driver;
	Actions action;

	@Given("Login to SalesForce url")
	public void login() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
		driver.findElement(By.id("Login")).click();

	}

	@When("Click the App Launcher Icon next to Setup")
	public void click_the_app_launcher() {
		// Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Then("Select Accounts")
	public void select_accounts() {
		// Click View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		// Select Accounts
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement accounts = driver.findElement(By.xpath("//p[text()='Accounts']"));
		js.executeScript("arguments[0].scrollIntoView(true);", accounts);
		accounts.click();

	}

	@Then("Search for the account using your unique account name.")
	public void search_your_account_name() {
		//search for Pooja's account
		
		WebElement accName= driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		accName.clear();
		accName.sendKeys("Pooja");
		accName.sendKeys(Keys.RETURN);
		

	}

	@Then("Click the dropdown icon next to the account and select Edit.")
	public void click_and_select_edit() throws InterruptedException {
		Thread.sleep(1000);
		//click show more option		
		WebElement Edit =driver.findElement(By.xpath("//table[@aria-label='Recently Viewed']//td[6]/span"));
		Edit.click();
		//select Edit option 
		WebElement editOption = driver.findElement(By.xpath("//a[@title ='Edit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", editOption);
		editOption.click();
	}

	@Then("Set Type to Technology Partner.")
	public void set_type_to_technology_partner() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement type=driver.findElement(By.xpath("//button[@aria-label='Type']"));
		js.executeScript("arguments[0].scrollIntoView(true);", type);
		type.click();
		WebElement TP=  driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']"));
		js.executeScript("arguments[0].scrollIntoView(true);", TP);
		TP.click();
	}

	@Then("Set Industry to Healthcare.")
	public void set_industry_to_healthcare() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement industry=driver.findElement(By.xpath("//button[@aria-label='Industry']"));
		js.executeScript("arguments[0].scrollIntoView(true);", industry);
		industry.click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
	}

	@When("Enter the Billing Address {string}.")
	public void enter_the_billing_address(String billAdd) {
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys(billAdd);
	}

	@When("Enter the Shipping Address {string}.")
	public void enter_the_shipping_address(String shipAdd) {
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(shipAdd);
	}

	@Then("Set Customer Priority to Low.")
	public void set_customer_priority_to_low() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement priority=driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		js.executeScript("arguments[0].scrollIntoView(true);", priority);
		priority.click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
	}

	@Then("Set SLA to Silver.")
	public void set_sla_to_silver() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement sla=driver.findElement(By.xpath("//button[@aria-label='SLA']"));
		js.executeScript("arguments[0].scrollIntoView(true);", sla);
		sla.click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	}
	

	@Then("Set Active to NO.")
	public void set_active_to_no() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement active=driver.findElement(By.xpath("//button[@aria-label='Active']"));
		js.executeScript("arguments[0].scrollIntoView(true);", active);
		active.click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@Then("Enter Phone No {string}.")
	public void enter_a_unique_number_in_the_phone_field(String phoneNo) {
		WebElement phone =  driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.clear();
		phone.sendKeys(phoneNo);
	}

	@Then("Set Upsell Opportunity to No.")
	public void set_upsell_opportunity_to_no() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement upsell=driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
		js.executeScript("arguments[0].scrollIntoView(true);", upsell);
		upsell.click();
		 driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@When("Click Save and verify the phone number.")
	public void click_save_and_verify_the_phone_number() throws InterruptedException {
		//Save
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement save =  driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		js.executeScript("arguments[0].scrollIntoView(true);", save);
		save.click();
		//verify phone number
		Thread.sleep(1000);
		WebElement verification = driver.findElement(By.xpath("//table[@aria-label='Recently Viewed']//td[4]/span/span"));
		String PhoneNum = verification.getText();
		System.out.println(" Verifying the Phone Number--- " +PhoneNum);
	}

}
