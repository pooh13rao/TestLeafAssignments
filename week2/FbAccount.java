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
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(300);
	//	driver.findElement(By.name("firstname")).sendKeys("Pooja");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Pooja");
		driver.findElement(By.name("lastname")).sendKeys("Rao");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		WebElement date = driver.findElement(By.id("day"));
		Select dateVal = new Select(date);
		dateVal.selectByIndex(1);
		Thread.sleep(300);

		WebElement month = driver.findElement(By.id("month"));
		Select monthVal = new Select(month);
		monthVal.selectByVisibleText("Sep");
		Thread.sleep(300);

		WebElement year = driver.findElement(By.id("year"));
		Select yearVal = new Select(year);
		yearVal.selectByValue("1992");
		Thread.sleep(300);

		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1500);		
		
		
		driver.quit();
	}

}
