package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingButtons {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://letcode.in/buttons");
		//get x and y co ordinates
		WebElement ele =driver.findElementById("position");
		Point point =ele.getLocation();
		int x=point.getX();
		int y =point.getY();
		System.out.println("x==>"+ x+ "y==>"+y);
		//color of button
		WebElement ele1 =driver.findElementById("color");
		String colour = ele1.getCssValue("background-colour");
		System.out.println(colour);
		
		//findtheheight and width
		Rectangle rect =driver.findElementById("property").getRect();
		Dimension dime =rect.getDimension();
		System.out.println(dime);
		System.out.println(dime.getHeight());
		System.out.println(dime.getWidth());
		//confirm button is disabled
		boolean isenabled =driver.findElementById("isDisabled").isEnabled();
		System.out.println(isenabled);
		//get size
		Dimension size=driver.findElementByXPath("//h2[contains(text(),'Button Hold!')]").getSize();
		System.out.println(size);
		
		driver.quit();
	}



}
