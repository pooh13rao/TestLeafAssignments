package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		
		// 1. Navigate to https://www.bigbasket.com/.
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		
		// 2. Click on "Shop by Category".
		driver.findElement(By.xpath("//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']")).click();

		// 3. Mouse hover "Foodgrains, Oil & Masala".
		WebElement grains = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")));
		System.out.println(grains.getText());
		Actions action = new Actions(driver);
		action.moveToElement(grains).perform(); 
		
		// 4. Mouse over "Rice & Rice Products".
		WebElement rice= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Rice & Rice Products"))); 
		System.out.println(rice.getText());
		action.moveToElement(rice).perform(); 
		
		 // 5. Click on "Boiled & Steam Rice".
		  driver.findElement(By.linkText("Boiled & Steam Rice")).click(); 
		 
		  
		  // 6. Filter the results by selecting the brand "bb Royal".
		  WebElement brand =  driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		  brand.sendKeys("bb Royal");
		  driver.findElement(By.xpath("//input[@id='i-BBRoyal']")).click(); 
		  
		 
		  // 7. Click on "Tamil Ponni Boiled Rice".
		  WebElement riceTypes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")));
		 riceTypes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")));
		  String NameOfRice = riceTypes.getText();
		  System.out.println("NameOfRice is : "+NameOfRice);
		  riceTypes.click();
		
		// To handle new window
		  Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(driver.getTitle());
			// Convert set into list
			List<String> window = new ArrayList<String>(windowHandles);

			// Transfer the driver control to the rice window
			driver.switchTo().window(window.get(1));
			System.out.println(driver.getTitle());
		  // 8. Select the 5 Kg bag. 
	WebElement PackSize =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='5 kg']")));
	action.moveToElement(PackSize).click().perform();
		  
		  // 9. Check and note the price of the rice. 
		  String Price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		  System.out.println("The price of 5Kg rice is " +Price);
		  
		  // 10. add the bag to your cart. 	  
		  driver.findElement(By.xpath("//div[@class='flex flex-col lg:w-60 xl:w-82']/button")).click();
		  // 11. Verify the success message	that confirms the item was added to your cart.
		  WebElement SuccessMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='mx-4 flex-1']")));	 
		  String msg = SuccessMsg.getText();
		  System.out.println("Success Msg after adding the item to the cart ---> "+msg);
		  
		  // 12. Take a snapshot of the current page
		  WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-span-12 offset']")));
			File src = product.getScreenshotAs(OutputType.FILE);
			File target = new File(".\\ScreenShots\\Actions_BB.png");
			FileUtils.copyFile(src, target);
		  
		  // 13. Close the current window.
			driver.close();
			
		  // 14. Close the main window.
		  driver.quit();		 
		 
	}

}
