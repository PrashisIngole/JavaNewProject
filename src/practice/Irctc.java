package practice;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import locators.Browser;

public class Irctc {

	public static void main(String[] args) throws IOException {
		WebDriver driver=Browser.openBrower("https://www.irctc.co.in/nget/train-search");
		ScreenShot.TakeScreenShot(driver, "irctc");
	}
	
}
