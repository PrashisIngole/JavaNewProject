package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame1 {
public static void main(String[] args) {
	
	WebDriver driver =BrowserForPractice.openBrowser("https://demoqa.com/frames");
	
	driver.switchTo().frame("frame1");
	WebElement outerFrame =driver.findElement(By.xpath("//h1[@id='sampleHeading']")); 
	String text=outerFrame.getText();
	System.out.println(text);
}
}
