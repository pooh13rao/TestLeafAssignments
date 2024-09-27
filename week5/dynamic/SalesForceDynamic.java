package assignments.week5.dynamic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamic extends CommonMethodsDynamic {
	
	@Test(dataProvider="Input")
	public void salesForce(String name,String CName,String addr) {
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
	//Enter Name as 'Salesforce Automation by *Your Name*'(Parameterized value 
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(CName);
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(addr);
	

	//Select Status as 'Active' 
	//scroll to the status field
	WebElement status=driver.findElement(By.xpath("//button[@role='combobox']"));
	js.executeScript("arguments[0].scrollIntoView(true);", status);
	status.click();
    //Find Active value from custom drop down
	driver.findElement(By.xpath("//lightning-base-combobox-item[2]//span[@title='Active']")).click();
    
	//Click save and verify Legal Entity Name
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement legalEntity=	driver.findElement(By.xpath("//span[@class='test-id__field-value slds-form-element__static slds-grow word-break-ie11']"));
		System.out.println("Legal Entity Name:"+legalEntity.getText());
}
	  @DataProvider(name="Input",indices= {0})
	    public String[][] inputData() {
	    	String[][] data=new String[1][3];
	    	data[0][0]="Salesforce Automation by Pooja";
	    	data[0][1]="TestLeaf";
	    	data[0][2]="Practice";
	    	return data;
	    	
	    }
}