package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnFindElements{
	public static void main(String[] args) {
		
	
	//	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElementByName("q").sendKeys("cricket",Keys.ENTER);
		List<WebElement> cricket=  driver.findElementsByXPath("//*[contains(text(),'cricket')]");
		System.out.println(cricket.size());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://letcode.in/edit");
//		List<WebElement> label= driver.findElementsByTagName("label");
//		WebElement lastelement = label.get(label.size()-1);// by using index
//		System.out.println("last element>>>>>>"+ lastelement.getText());
//		int size = label.size();
//		if(size ==6) {
//			System.out.println("teat case is passed");
//		}else System.out.println("test is fail");
//		for (WebElement webelement : label) {
//			System.out.println(webelement.getText());
//			
//		}
















	}


