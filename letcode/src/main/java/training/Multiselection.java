package training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselection {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement acc = driver.findElementByXPath("//h2[contains(text(),'Select multiple options')]");
		Select s1 = new Select(acc);
		s1.selectByValue("Pen");
		
		
		
	}
	
	

}
