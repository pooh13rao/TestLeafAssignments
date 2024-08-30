package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// Wait method to wait for 10sec untill the web element is located
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(300);
	//	driver.findElement(By.name("firstname")).sendKeys("Pooja");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");

		// Wait for 10sec until the element is located 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Pooja");
		driver.findElement(By.name("lastname")).sendKeys("Rao");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		// Select dropdown date 
		WebElement date = driver.findElement(By.id("day"));
		Select dateVal = new Select(date);
		// slecting value by index
		dateVal.selectByIndex(1);
		Thread.sleep(300);
		
		// Select dropdown month
		WebElement month = driver.findElement(By.id("month"));
		Select monthVal = new Select(month);
		// slecting value by visible text
		monthVal.selectByVisibleText("Sep");
		Thread.sleep(300);
		
		// Select dropdown year
		WebElement year = driver.findElement(By.id("year"));
		Select yearVal = new Select(year);
		
		// slecting value by value
		yearVal.selectByValue("1992");
		Thread.sleep(300);

		//choosing radio button
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1500);		
			
		driver.quit();
	}

}
