package practiceFromStart;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	public static void takeScreenshot1(WebDriver driver,String name) throws IOException {
		String d=Screenshot.date();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Prashish Ingole\\OneDrive\\Documents\\SS\\"+name+d+".jpg");
		FileHandler.copy(source, destination);
	}
	
	public static String date() {
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		LocalDateTime current =LocalDateTime.now();
		String d=dt.format(current);
		return d;
		
	}
	
	
}
