package assignments.week4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Load the url - https://finance.yahoo.com/
		driver.get("https://finance.yahoo.com/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Click on “Crypto” tab
		driver.findElement(By.xpath("//span[text()='More']")).click();
		driver.findElement(By.xpath("(//a[@class='_yb_1j2qr6g'])[36]")).click();
		
		// Locate the table in the dom page
		WebElement cryptoTable =driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']"));

		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr"));
		System.out.println("total No of rows:== " + rows.size());
		List<WebElement> colns = driver
				.findElements(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/thead/tr/th"));
		System.out.println("total No of columns:== " + colns.size());

		// Locate the cryptocurrency names in the table using specific row and column.
		 WebElement CryName =driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr[3]/td[1]/span/div/a/div/span[2]"));
		 System.out.println(" Crypto names for 3rd row is  ===" + CryName.getText());
		 
		 System.out.println("-----------------------------------------");
		
		 // Use loop to iterate the cryptocurrency names
		for (int i = 1; i <= rows.size(); i++) {
			WebElement crypCurr = driver
					.findElement(By.xpath("//table[@class='markets-table freeze-col yf-42jv6g fixedLayout']/tbody/tr["
							+ i + "]/td[1]/span/div/a/div/span[2]"));
			// Print the cryptocurrency names
			System.out.println("Crypto name at " + i + " is --- " + crypCurr.getText());

		}
		Thread.sleep(3000);

		driver.close();
	}

}
