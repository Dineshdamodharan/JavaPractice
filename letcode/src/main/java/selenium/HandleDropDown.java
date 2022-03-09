package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/dropdowns");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement fruits = driver.findElementByCssSelector("#fruits");
		Select myfruit= new Select(fruits);
		
		myfruit.selectByVisibleText("Banana");
		//multi selection
		WebElement heros = driver.findElementById("superheros");
		Select myheros= new Select(heros);
		boolean ismul = myheros.isMultiple();// to know is this multi selection
		System.out.println("it is multiselection:"+ ismul);
		System.out.println("--------------------------------------------------");
		myheros.selectByIndex(1); // select by index 
		myheros.selectByValue("bt"); // select by value
		//List<WebElement> allheros  =myheros.getOptions();   // for all options
		List<WebElement> allheros  =myheros.getAllSelectedOptions();// for selected actions
		for(WebElement web: allheros) {        // for loop
			System.out.println(web.getText());
		}
		System.out.println("----------------------------------------------");
		//using value
		 WebElement country = driver.findElementById("country");
		 Select mycountry = new Select(country);
		 mycountry.selectByValue("India");
		 mycountry.selectByValue("Brazil");
		 WebElement selectedcountry = mycountry.getFirstSelectedOption();
		 System.out.println(selectedcountry.getText());
		 
		 System.out.println("-------------------------------+--------++++++++++++++++");
		 
		WebElement language = driver.findElementById("lang");
		Select mylanguage = new Select(language);
		mylanguage.selectByValue("sharp");
		List<WebElement> alllanguage =mylanguage.getOptions();
		for( WebElement web1 :  alllanguage) {
			System.out.println(web1.getText());
			
		}
		
	}

}
