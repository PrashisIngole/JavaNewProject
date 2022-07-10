	package iframeHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(2000);
		WebElement course=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		course.click();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement aboutus=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		aboutus.click();
		
		
	}
}
