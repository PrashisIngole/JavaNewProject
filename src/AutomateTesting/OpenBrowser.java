package AutomateTesting;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.navigate().to("https://vctcpune.com/about-us/");
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
        Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Dimension d =new Dimension (500,600);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		Point P=new Point(500,600);
		driver.manage().window().setPosition(P);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
	}	
}
