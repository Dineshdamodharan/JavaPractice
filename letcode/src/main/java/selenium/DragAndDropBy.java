package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/draggable");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(1);
		WebElement ele = driver.findElementById("sample-box");
		Actions builder = new Actions(driver);
		int x = ele.getLocation().getX();
		System.out.println(x);
		int y= ele.getLocation().getY();
		System.out.println(y);
		builder.dragAndDropBy(ele,x+ 60, y+70).perform();
		//driver.quit();
		
	}

}
