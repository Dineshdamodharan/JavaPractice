package llaunvhchrome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"./drivers/msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//load url
		driver.get("https://letcode.in/edit");
		
		//driver.quit();
	}

}
