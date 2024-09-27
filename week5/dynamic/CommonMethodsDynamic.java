package assignments.week5.dynamic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonMethodsDynamic {
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod       
	public void preCondition(String url,String uName,String pswd) {
	
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pswd);
     driver.findElement(By.id("Login")).click();
	}
	@AfterMethod
	public void postCondtion() throws InterruptedException {
		driver.quit();
	}


}
