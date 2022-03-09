package parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	RemoteWebDriver driver;
	@Parameters({"emailid","password","browser"})
	@Test
	public  void learn(String email,String pass,String browser)  {
		//RemoteWebDriver driver;
		switch (browser) {
		case "chromebrowser":
			driver = new ChromeDriver();
			
		case "edgebrowser":
			driver= new EdgeDriver();
			
		default:
			System.err.println("the browser is not defined");
			
		}
		
		
		System.out.println(email+"&"+" "+ pass);
		//ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[contains(text(),'LOGIN')]").click();
		String title = driver.getTitle();
		System.out.println("title is :"+ title);
		driver.quit();
		
		
	}

}
