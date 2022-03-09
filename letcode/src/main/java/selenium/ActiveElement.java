package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ActiveElement {
   public static void main(String[] args) {
	   System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	WebElement activeelement = driver.switchTo().activeElement();   // switching to active element
	activeelement .sendKeys("email",Keys.TAB,"password" , Keys.ENTER,"login");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
