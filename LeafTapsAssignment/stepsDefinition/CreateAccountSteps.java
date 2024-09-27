package stepsDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountSteps extends BaseClassForAccount{

	

	@When("Click Account tab")
	public void select_account_tab() {
		driver.findElement(By.linkText("Accounts")).click();

	}

	@Then("Click Create Account")
	public void click_create_account() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@Then("Enter Account Name as (.*)$")
	public void enter_account_name_as_name(String Name) {
		driver.findElement(By.id("accountName")).sendKeys(Name);

	}

	@Then("Add a short Description as (.*)$")
	public void add_a_short_description_as_Description(String Desc) {
		driver.findElement(By.name("description")).sendKeys(Desc);

	}

	@Then("Click on CreateAccount")
	public void click_on_create_account() throws InterruptedException {
	driver.findElement(By.className("smallSubmit")).click();
	//Thread.sleep(2000);

	}

}
