package locators;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshootWithDate {

 public static void takescreenshoot(WebDriver driver,String name) throws IOException {
	 
	 String d= ScreenshootWithDate.date();
	 File sourse =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File Destination=new File("C:\\Users\\Prashish Ingole\\OneDrive\\Documents\\SS\\"+name+d+".jpg");
	 FileHandler.copy(sourse, Destination); 
 }
 
 public static String date() {
	 DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
	 LocalDateTime currentTime=LocalDateTime.now();
	 String d=dtf.format(currentTime);
	 return d;
   }
}
