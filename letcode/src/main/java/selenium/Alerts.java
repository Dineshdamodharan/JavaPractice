package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/alert");
		//simple alert
		driver.findElementById("accept").click(); // finding element and click
		Alert alert =driver.switchTo().alert();    // switching to finding element 
		String str =alert.getText();              // getting text in alert
		System.out.println(str);                 // printing text
		alert.accept();                          //  accepting alert
		//confirm alert
		driver.findElementById("confirm").click();
		Alert alert2 =driver.switchTo().alert();
		String s =alert.getText();
		System.out.println(s);
		alert.dismiss();
		//prompt alert
		driver.findElementById("prompt").click();
		driver.switchTo().alert();
		alert.sendKeys("dinesh");
		String s2 =alert.getText();
		System.out.println(s2);
		
		alert.accept();
		String st =driver.findElementById("myName").getText();
		System.out.println(st);
		driver.quit();
		
		

	}

}
