package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceSteps {

	ChromeDriver driver;
	Actions action;

	@Given("Login to url")
	public void login() {

		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
		driver.findElement(By.id("Login")).click();

	}

	@When("Click on toggle menu button from the left corner")
	public void click_On_toggle_button() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Then("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

	}

	@And("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {

		action = new Actions(driver);
		WebElement accountTab = driver.findElement(By.xpath("//a[@title='Accounts']/span"));
		action.moveToElement(accountTab).click().perform();

	}

	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
	}

	@Then("Enter Pooja as account name")
	public void enter_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Pooja");
	}

	@And("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ownership);
		ownership.click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[2]//span[@title='Public']")).click();

	}

	@Then("Click save and verify Account name")
	public void save_Verfiy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		js.executeScript("arguments[0].scrollIntoView(true);", save);
		save.click();
		WebElement Account = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']")));
		System.out.println("Success Message:" + Account.getText());
	}
	// steps /methods for dynamic assigment 2

	@Given("Login to {string}")
	public void login_to(String url) {

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
		driver.findElement(By.id("Login")).click();
	}

	@Then("Enter as account name (.*)$")
	public void enter_as_account_name_name(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);

	}
}
