package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/frame");
		WebElement parent =driver.findElementByXPath("//iframe[@src='frameUI']");
		driver.switchTo().frame(parent);
		// name 
		driver.findElementByName("fname").sendKeys("dinesh");
		System.out.println(driver.getTitle());
	 	
  		driver.findElementByName("lname").sendKeys("damu");
		//inner frame

		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@placeholder='Enter email']").sendKeys("dineshgmail");
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("d");
		driver.quit();

	}

}
