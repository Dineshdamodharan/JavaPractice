package dataprovider;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataprovider {
	@DataProvider(name="learn")
	public String[][] getdata() {
		String[][]array = new String[3][2];
		array[0][0]= "dineshdamodharan@gmail.com";
		array[0][1]="pass123$";
		array[1][0]= "dineshdamodharan0@gmail.com";
		array[1][1]="pass123$";
		array[2][0]="dineshdamodharan00@gmail.com";
		array[2][1]= "pass123$";
		return array;
	}
	@Test(dataProvider = "learn")
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






