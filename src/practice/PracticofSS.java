package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class PracticofSS {

	public static void main(String[] args) throws IOException {
		WebDriver driver=BrowserForPractice.openBrowser("");
		File sourse =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination =new File(" ");
		FileHandler.copy(sourse, Destination);
		
	}
}
