package assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		ChromeDriver driver = new ChromeDriver();
		// maximize web window
		driver.manage().window().maximize();
		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// find Username element
		WebElement UserName = driver.findElement(By.id("username"));
		// enter value
		UserName.sendKeys("demosalesmanager");
		// find password element
		WebElement password = driver.findElement(By.id("password"));
		// enter value
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// get the title of the page
		String title = driver.getTitle();
		System.out.println("The Title of the page : " + title);
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		//Find the below elements and enter vvalues
		driver.findElement(By.id("accountName")).sendKeys("Pooja Training");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("7");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(300);
		driver.close();
	}

}
