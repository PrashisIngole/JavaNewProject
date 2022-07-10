package parameterizationPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.examples.ss.LoanCalculator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	
	public static void TakeScrrenshot(WebDriver driver ,String name) throws IOException {
		String d=ScreenShot.date();
		File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File(""+name+d+".jpg");
		FileHandler.copy(sourse, destination);
	}

public static String date() {

	DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
	LocalDateTime current =LocalDateTime.now();
	String d=dt.format(current);
	return d;
}
}