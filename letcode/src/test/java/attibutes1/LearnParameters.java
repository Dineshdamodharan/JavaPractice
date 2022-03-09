package attibutes1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	@DataProvider(name="learn")
	public String[][] LearnDataprovider() {
		String[][]array = new String[2][2];
		        array[0][0]= "dineshdamodharan@gmail.com";
				array[0][1]="pass123$";
				array[1][0]= "dineshdamodharan0@gmail.com";
				array[1][1]="pass123$";
				return array;
	}
	//@Parameters({"emailid","password"})
	@Test(dataProvider ="LearnDataprovider")
	public  void learn(String email,String pass)  {
		//System.out.println(email+"&"+" "+ pass);
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[contains(text(),'LOGIN')]").click();
		String title = driver.getTitle();
		System.out.println("title is :"+ title);
		driver.quit();


	}

}
