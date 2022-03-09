package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();
	driver.get("https://letcode.in/buttons");
	File src =driver.getScreenshotAs(OutputType.FILE);//
	File dest= new File("D:\\NEW\\snap1");
	FileHandler.copy(src, dest);
}
}
