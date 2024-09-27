package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// - Switch to the frame
			driver.switchTo().frame("iframeResult");
			// Click the "Try It" button inside the frame
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			// Click OK/Cancel in the alert that appears
			driver.switchTo().alert().dismiss();
			// verifying the text displayed
			String result = driver.findElement(By.id("demo")).getText();
			System.out.println("result ==" + result);

			}
	}

