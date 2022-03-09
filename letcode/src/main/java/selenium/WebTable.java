package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.w3c.dom.Text;

import net.bytebuddy.implementation.EqualsMethod;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		 WebElement table = driver.findElementById("simpletable");
		 List<WebElement> header = table.findElements(By.tagName("th"));
		 for (WebElement heading : header) {
			String text = heading.getText();
			System.out.println(text);
		}
		List<WebElement> allrows = driver.findElementsByXPath("//table[@id='simpletable']//tbody//tr");
		int size = allrows.size();
		System.out.println("no of rows"+ size);
		if (size==3) {
			System.out.println("pass");
		}else System.out.println("fail");
		for (int i = 0; i < size; i++) {
			List<WebElement> row = allrows.get(i).findElements(By.tagName("td"));
			WebElement lastname = row.get(1);
			String column2 = lastname.getText();
			System.out.println(column2);
			
			
			
		if (column2.equals("chatterjee")) {
			WebElement input = row.get(3).findElement(By.cssSelector("#input"));
		        input.click();
		        
		}
			
		}
		driver.quit();
	}



}
