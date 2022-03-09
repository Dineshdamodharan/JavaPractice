package training;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnWindowHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://letcode.in/windows");
	String parent = driver.getWindowHandle(); // parent tab
	System.out.println(driver.getTitle());
    driver.findElementById("home").click();
   Set<String> windowhandles = driver.getWindowHandles();
   List<String> list = new ArrayList<String>(windowhandles);
   driver.switchTo().window(list.get(1));
  String title = driver.getTitle();
   System.out.println("home title::"+ title);
    WebDriver main = driver.switchTo().window(list.get(0));    // parent tab
   driver.close();         // closing parennt tab
   Set<String> windowhandle = driver.getWindowHandles();
   list.clear();
   list.addAll(windowhandle);
   driver.switchTo().window(list.get(0));
   System.out.println(driver.getCurrentUrl());
   driver.close();
   // multiple windows
 driver.switchTo().window(parent);
 
   
   
   
   
   
   
   
   
   
	
	
	

}


}
