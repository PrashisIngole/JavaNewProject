package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.veenaworld.com/");
	System.out.println(driver.getTitle());
	driver.quit();
	
}
}
