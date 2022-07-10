package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void TakeScreenShot(WebDriver driver,String name) throws IOException {
		String d=ScreenShot.Date();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination= new File ("C:\\Users\\Prashish Ingole\\OneDrive\\Documents\\SS\\"+name +d+".jpg");
		FileHandler.copy(source,Destination);
	}
	
	public static String  Date() {
		DateTimeFormatter dt =DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime current =LocalDateTime.now();
		String d=dt.format(current);
		return d;
	}
	
	
	
	
}
