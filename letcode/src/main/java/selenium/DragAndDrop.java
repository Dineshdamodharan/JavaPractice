package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	driver.get("https://letcode.in/dropable");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.switchTo().frame(0);
	WebElement source =driver.findElementById("draggable");
	
	WebElement target =driver.findElementById("droppable");
	Actions builder= new Actions(driver);           //  web element has no power so we create action object
	builder.dragAndDrop(source, target).perform();   // action will work only if u give perform
		
	
	
	
	
}
}
