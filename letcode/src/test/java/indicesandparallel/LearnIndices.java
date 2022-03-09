package indicesandparallel;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LearnIndices /* extends Dataprovider */ {
	@Test(dataProvider = "learn", dataProviderClass = Dataprovider.class)
	public void login(String email, String pass) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/signin");
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[contains(text(),'LOGIN')]").click();
		String title = driver.getTitle();
		System.out.println("title is :"+ title);
		driver.quit();

	}

}
