package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action = new Actions(driver);

		// 2. Go to "Men's Fashion".
		WebElement MenFashion = driver.findElement(By.linkText("Men's Fashion"));
		action.moveToElement(MenFashion).perform();
		// 3. Go to "Sports Shoes".
		WebElement SportsShoe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sports Shoes")));
		action.moveToElement(SportsShoe).click().perform();

		// 4. Get the count of sports shoes.
		WebElement ShoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println(" No of Shoes avaiable is --> " + ShoeCount.getText());

		// 5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text() = 'Training Shoes']")).click();

		// 6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//span[text() = 'Sort by:']")).click();
		driver.findElement(By.xpath("//ul[@class = 'sort-value']/li[2]")).click();
		// 7. Check if the displayed items are sorted correctly.

		// 8. Select any price range ex:(500-700).
		WebElement fromVal = driver.findElement(By.name("fromVal"));
		fromVal.clear();
		fromVal.sendKeys("500");
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("1000");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

		Thread.sleep(1000);

		// 9. Filter by any colour.
		WebElement colour = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//label[@for = 'Color_s-White%20%26%20Blue']")));
		action.moveToElement(colour).click().perform();

		// 10. Verify all the applied filters.
		List<WebElement> filterList = driver.findElements(By.xpath("//div[@class='filters']"));

		int count = filterList.size();
		System.out.println("size ==" + filterList.size());
		for (int i = 0; i < count; i++) {

			String FilterType = filterList.get(i).getText();
			System.out.println("Verifying Filter " + (i + 1) + " for " + FilterType);
			Thread.sleep(2000);
			filterList = driver.findElements(By.xpath("//div[@class='filters']//a"));
		}

		// 11. Mouse hover on the first resulting "Training Shoes".
		Thread.sleep(1000);
		WebElement FirstProd = driver
				.findElement(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div[1]"));

		// 12. Click the "Quick View" button.
		WebElement quickview = FirstProd.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));
		action.moveToElement(quickview).click().perform();
		System.out.println("---- mouse hover to Quick View ------" + quickview.getText());

		// 13. Print the cost and the discount percentage.

		String Cost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='payBlkBig']")))
				.getText();
		String Discount = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='percent-desc ']")))
				.getText();

		System.out.println(" Cost & Discount of the product is Rs." + Cost + "& " + Discount);

		// 14. Take a snapshot of the shoes.
		File src = driver.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\ScreenShots\\Actions_Snapdeal.png");
		FileUtils.copyFile(src, target);

		// 15. Close the current window.
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

		// 16. Close the main window.
		driver.quit();
	}

}
