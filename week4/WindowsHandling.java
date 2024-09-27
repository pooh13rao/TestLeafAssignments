package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter the username and password.
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the Contacts button.
		driver.findElement(By.linkText("Contacts")).click();

		// Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();

		// Click on the widget of the "From Contact".
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		// To get all the window address --> getWindowHandles()
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		// Convert set into list
		List<String> window = new ArrayList<String>(windowHandles);

		// Transfer the driver control to the FromContact window
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());

		// Click on the first resulting contact.
		driver.findElement(By.linkText("DemoCustomer")).click();

		// switch to windows 0
		driver.switchTo().window(window.get(0));
		System.out.println(driver.getTitle());

		// Click on the widget of the "To Contact".
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		// To get all the window address --> getWindowHandles()
		Set<String> windowHandles2 = driver.getWindowHandles();

		window.clear();// Remove all the existing address
		window.addAll(windowHandles2);
		List<String> window2 = new ArrayList<String>(windowHandles2);

		// Click on the second resulting contact.
		driver.switchTo().window(window2.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("dp1a1contact2")).click();

		// Click on the Merge button.
		// switch to windows 0
		driver.switchTo().window(window.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Merge")).click();
		
		// Accept the alert.
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println("Alert Message "+AlertText);
		alert.accept(); 
		
		// Verify the title of the page
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
