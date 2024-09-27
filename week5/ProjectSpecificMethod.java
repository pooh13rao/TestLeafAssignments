package assignments.week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	ChromeDriver driver;
	@BeforeMethod       
	public void preCondition() {
	
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("gokul.sekar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$321");
     driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void postCondtion() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


}
