package locators;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver =Browser.openBrower("https://groww.in/");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\Prashish Ingole\\OneDrive\\Documents\\SS\\Grow1.jpg");
        FileHandler.copy(source, destination);
		
		
	}
}
