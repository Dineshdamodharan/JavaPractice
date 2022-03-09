package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIghtClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://play.letcode.in/contextmenu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElementByClassName("mat-list-item-content");
        Actions builder = new Actions(driver);
        builder.contextClick(ele).perform();
        driver.findElementById("mat-menu-panel-0").click();
        Alert alt =driver.switchTo().alert();
        System.out.println(alt.getText());
        alt.accept();
        
		
		
      driver.quit();
	}

}
