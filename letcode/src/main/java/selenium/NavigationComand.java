package selenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationComand {

	public static void main(String[] args)  {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/buttons");
		//get current url
		String url =driver.getCurrentUrl();
		System.out.println("buttonurl"+url);
		//home url
		/*driver.findElementById("home").click();
		String homeurl =driver.getCurrentUrl();
		System.out.println("homeurl"+homeurl);
		//back to button page
		driver.navigate().back();
		System.out.println("returnurl"+driver.getCurrentUrl());
		//refresh page
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");*/
		Navigation nav=driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		nav.to("https://letcode.in/signin");
		driver.quit();
	}

}
