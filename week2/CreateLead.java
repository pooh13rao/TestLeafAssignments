package assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pooja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rao");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium_training");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium_training");

		driver.findElement(By.className("smallSubmit")).click();

		String title = driver.getTitle();
		System.out.println("The Title of the page : " + title);

		Thread.sleep(300);

		driver.close();
	}
}
