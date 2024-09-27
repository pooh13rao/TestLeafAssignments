package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// 1. Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// 2. Search for "oneplus 9 pro".
		WebElement Search = driver.findElement(By.xpath("//input[@type='text']"));
		Search.sendKeys("oneplus 9 pro");
		Search.sendKeys(Keys.ENTER);
		
		// 3. Get the price of the first product.
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(" Price of first One+ 9 pro listed is : " + price);
		
		// 4. Print the number of customer ratings for the first displayed product.
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println(" no of ratings for first One+ 9 pro listed is : " + rating);
		
		// 5. Click the first text link of the first image.
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

		// handling new window
		Set<String> windowHandles = driver.getWindowHandles();
		// Convert set into list
		List<String> window = new ArrayList<String>(windowHandles);
		
		// Transfer the driver control to the FromContact window
		driver.switchTo().window(window.get(1));		
		
		// 6. Take a screenshot of the product displayed.
		WebElement product = driver.findElement(By.xpath("//div[@id='ppd']"));
		File src = product.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\ScreenShots\\Actions_Amazon.png");
		FileUtils.copyFile(src, target);
		
		// 7. Click the 'Add to Cart' button
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		
		// 8. Get the cart subtotal and verify if it is correct.
		Thread.sleep(2000);
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Sub total of the Cart is : " + subTotal);
		
		// 9. Close the browser
		driver.quit();
	}

}
