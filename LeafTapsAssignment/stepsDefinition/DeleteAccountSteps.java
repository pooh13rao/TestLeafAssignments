
package stepsDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteAccountSteps extends BaseClassForAccount {
	@Given("Click Deactive button")
	public void click_deactive_button() {
		driver.findElement(By.linkText("Deactivate Account")).click();
	}

	@Then("Accept the popUp")
	public void accept_the_pop_up() throws InterruptedException {
		Thread.sleep(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Then("Verify the Deactived Message")
	public void verify_the_deactived_message() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String Message = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='subSectionWarning']")))
				.getText();
		System.out.println("Account Deactivated Message is -----> " + Message);
	}

}
