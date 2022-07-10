package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Grow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserForPractice.openBrowser("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement id = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		id.sendKeys("9960012548");
		//Thread.sleep(3000);
		
		WebElement passw = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		passw.sendKeys("Parsha@1998");
		//Thread.sleep(3000);
		
		WebElement login =driver.findElement(By.tagName("button"));// login by tagname
		login.click();
		Thread.sleep(3000);
		
		WebElement Dd =driver.findElement(By.xpath("(//img[@class='hu5pjgll bixrwtb6'])[1]"));
		Dd.click();
		
		
	}

}
