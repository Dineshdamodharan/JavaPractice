package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertTest {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.findElementById("alert1").click();
	Alert a1 = driver.switchTo().alert();
	 String text = a1.getText();
	 System.out.println("simple alert>>>"+text);
	a1.accept();
	//readonly
	 String s1 = driver.findElementById("rotb").getAttribute("Readonly");
	System.out.println(s1);
	//Confirm alert
	driver.findElementById("confirm").click();
	Alert a2 = driver.switchTo().alert();
	String confirmtext = a2.getText();
	System.out.println(confirmtext);
	a2.dismiss();
	//prompt alert
	driver.findElementById("prompt").click();
	Alert a3 = driver.switchTo().alert();
	a3.sendKeys("dinesh");
	a3.accept();
	
	
	
	
	
	
	
	
//driver.quit();	
}
}
