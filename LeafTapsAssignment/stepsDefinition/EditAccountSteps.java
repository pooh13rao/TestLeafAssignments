package stepsDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountSteps extends BaseClassForAccount {
	@When("Click on Find accounts")
	public void click_on_find_accounts() {
		driver.findElement(By.linkText("Find Accounts")).click();

	}

	@Then("Enter the desired account name (.*)$")
	public void enter_the_desired_account_name_name(String Name) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(Name);
		//Thread.sleep(1000);
	}

	@And("Click on Find Accounts button")
	public void click_on_find_accounts_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		Thread.sleep(2000);
	}

	@Then("select the respective account (.*)$")
	public void select_the_respective_account_result_name(String ResName) throws InterruptedException {
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> AccountList = driver.findElements(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-groupName']/a"));
		System.out.println("Number of accounts listed--- " +AccountList.size());
		
		for (WebElement accName : AccountList) {
			AccountList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-groupName']/a")));
			String accountNme = accName.getText();		
			System.out.println("Account name displayed ==== "+accountNme);
			if(accountNme.equalsIgnoreCase(ResName)) {
				accName.click();
			}			
			Thread.sleep(1000);		
			break;
		}
		
		
		}

	@And("click Edit")
	public void click_edit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Then("Enter the Annual Revenue value as (.*)$")
	public void enter_the_annual_revenue_value_as_value(String Value) throws InterruptedException {
		WebElement revEle= driver.findElement(By.name("annualRevenue"));
		revEle.clear();
		revEle.sendKeys(Value);
		Thread.sleep(1000);
	}

	@And("click Save")
	public void click_save() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(1000);
	}

}
