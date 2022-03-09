package training;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demotest {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement car= driver.findElementById("multiselect1");
	Select mycar = new Select(car);
	mycar.selectByValue("audix");
	mycar.selectByValue("swiftx");
	List<WebElement> allcar =mycar.getOptions();
	for(WebElement web:allcar) {
		System.out.println(web.getText());
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
}

