package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/waits");
		driver.findElementById("accept").click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		   Alert until = wait.until(ExpectedConditions.alertIsPresent());
		   System.out.println(until.getText());
		   until.accept();
//		
//		driver.get("https://letcode.in/signin");
//		driver.findElementByName("email").sendKeys("koushik350@gmail.com");
//		driver.findElementByName("password").sendKeys("pass123$");
//		driver.findElementByXPath("//button[contains(text(),'LOGIN')]").click();
//		
//		
		
		
		
		
	}

}
