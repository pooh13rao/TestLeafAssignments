package hooks;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepsDefinition.BaseClassForAccount;

public class HooksImplementation extends BaseClassForAccount {
	
	@Before
	public void preCondition() {
		// ensure to launch the browser and load the URL to set up pre-test conditions
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void postCondition() throws InterruptedException {
		//include actions to close the resources, such as closing the browser
		Thread.sleep(1000);
		driver.quit();
	}
	@Given("Login to Leaftaps site")
	public void login_to_leaftaps_site() {
		System.out.println("Login in to the website ----" +driver.getTitle());
	}

	@When("Enter Valid Username & Password")
	public void enter_valid_username_password() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
	}

	@And("Submit the login")
	public void submit_the_login() {
		driver.findElement(By.className("decorativeSubmit")).click(); 
	}
	
	
	@Then("Click on CRM_SFA link")
	public void click_on_crm_sfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

}
