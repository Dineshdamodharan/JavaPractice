package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Handlinginput {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/edit");
		//fullname
		driver.findElementById("fullName").sendKeys("dinesh");
		//append
		driver.findElementById("join").sendKeys("person",Keys.TAB);//("person",Keys.TAB);
		//gtext box
		String value =driver.findElementById("getMe").getAttribute("value");
		System.out.println(value);
		//clear text
		driver.findElementById("clearMe").clear();
		//is edit field enabled
		boolean isenabled =driver.findElementById("noEdit").isEnabled();
		System.out.println(isenabled);
		boolean isdisplayed =driver.findElementById("noEdit").isDisplayed();
		System.out.println(isdisplayed);
		//text is readonly
		String myvalue =driver.findElementById("dontwrite").getAttribute("value");
		System.out.println(myvalue);
		
		
		driver.quit();
	}

}
