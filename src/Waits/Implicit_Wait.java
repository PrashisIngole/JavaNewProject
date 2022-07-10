package Waits;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Implicit_Wait {

	
	public static void implicit(WebDriver driver) {
		
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

	}
	
	
	
	
}
