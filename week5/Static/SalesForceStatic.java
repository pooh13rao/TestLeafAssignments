package assignments.week5.Static;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SalesForceStatic extends CommonMethodsStatic {
	
	@Test
	public void salesForce() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on the toggle menu button from the left corner
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	//Click View All and click Legal Entities from App Launcher 
	driver.findElement(By.xpath("//button[text()='View All']")).click();

	//Click on the Dropdown icon in the legal Entities tab 
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement legal= driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	js.executeScript("arguments[0].scrollIntoView(true);", legal);
	legal.click();
	//Click on New Legal Entity
	driver.findElement(By.xpath("//a[@title='New']")).click();
	//Enter the Company name as 'TestLeaf'. 
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	//Enter Description as 'Salesforces'. 
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");

	//Select Status as 'Active' 
	//scroll to the status field
	WebElement status=driver.findElement(By.xpath("//button[@role='combobox']"));
	js.executeScript("arguments[0].scrollIntoView(true);", status);
	status.click();
    //Find Active value from custom drop down
	driver.findElement(By.xpath("//lightning-base-combobox-item[2]//span[@title='Active']")).click();
    
	//Click on Save 
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	//Verify the Alert message (Complete this field) displayed for Name
		driver.findElement(By.xpath("//a[text()='Legal Entity Name']")).click();
        //Find and printing Entity Name
		WebElement text=driver.findElement(By.xpath("(//div[@role='status'])[5]"));
		System.out.println("Entity Name:" + text.getText());
}
}