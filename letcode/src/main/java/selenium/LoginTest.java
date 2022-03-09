package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	//load url
	driver.get("https://letcode.in/signin/");
	//driver.findElementByName("email").sendKeys("email@gmail.com");
	driver.findElementByName("password").sendKeys("123456");
	driver.findElementByXPath("//button[.='LOGIN']").click();
	driver.quit();
}
}
