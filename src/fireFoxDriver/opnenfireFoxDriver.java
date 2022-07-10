package fireFoxDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opnenfireFoxDriver {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/search?q=kalavati+aai&rlz=1C1GCEB_enIN953IN953&oq=kalavati+aai&aqs=chrome.0.69i59j0i512l9.7121j0j7&sourceid=chrome&ie=UTF-8");
		
	}
	
}
