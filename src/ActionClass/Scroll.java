package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.openBrower("https://vctcpune.com/selenium/practice.html");
	
	WebElement element=driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
	
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(800,800)");
	
	
		
	JavascriptExecutor jse = ((JavascriptExecutor)driver);        	
	WebElement email = driver.findElement(By.id("useremail"));
	jse.executeScript("arguments[0].value='---your email id---';", email);
	
	}
}
