package testngBasics;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LearnWindowHandling {
	@Test
	public  void WindowHandling(){
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		String windowhandle =driver.getWindowHandle();;
		System.out.println("first window :"+ windowhandle);//parent tab
		driver.findElementById("home").click();// select home
		Set<String> windowhandles = driver.getWindowHandles();  //local variable
		System.out.println("home page: "+windowhandles);   // child tab
		List<String> list= new ArrayList<String>(windowhandles);// create list with parameter
		driver.switchTo().window(list.get(1));// switching to child tab
		System.out.println(" home url :"+driver.getCurrentUrl()); // home url

		driver.switchTo().window(list.get(0));   // parent tab
		driver.close();                      // closing the parent tab
		Set<String> child = driver.getWindowHandles(); // get window handles
		list.clear();                           // clearing the old list
		list.addAll(child);                     // adding the all child classes
		driver.switchTo().window(list.get(0));   // (swtiching to child tab with index of 0 ,
		              //because parent is closed,so there is only one window that is child window )
		String url=driver.getCurrentUrl();
		System.out.println(url);
driver.quit();












	}






}
