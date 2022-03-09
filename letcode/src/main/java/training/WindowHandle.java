package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		String parent = driver.getWindowHandle(); 
		driver.findElementById("home").click();
		Set<String> home = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(home);
		driver.switchTo().window(list.get(1));
		System.out.println("home page"+driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
				driver.close();
				driver.switchTo().window(list.get(1));
				driver.close();
				
				
				
				
				
	}
}
