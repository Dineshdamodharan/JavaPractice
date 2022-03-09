package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Houseover {
 public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[.='✕']").click();
	WebElement ele = driver.findElementByXPath("//span[.='Electronics']");
	Actions builder= new Actions(driver); 
	builder.moveToElement(ele).perform();
	 WebElement apple = driver.findElementByLinkText("Apple");
	 wait.until(ExpectedConditions.visibilityOf(apple));
	 apple.click();
	 System.out.println(apple.getText());
	 
	
	
	
	
	
	
	
	}
	
	 
	 
	 
	 
	 
	 
	 
}


