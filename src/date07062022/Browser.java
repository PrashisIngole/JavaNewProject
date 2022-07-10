package date07062022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	
	
	public static WebDriver openBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
}
