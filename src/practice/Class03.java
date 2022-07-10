package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03 {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//driver.get("https://www.flipkart.com/");	
	
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().forward();
    driver.navigate().refresh();
    String title =driver.getTitle();
	System.out.println(title);
	System.out.println(driver.getTitle());
	String url =driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.manage().window().minimize();
	
	Dimension d =new Dimension(200,300);
	driver.manage().window().setSize(d);
	
	Point p =new Point (100,300);
	driver.manage().window().setPosition(p);
	
}

	
	
}
