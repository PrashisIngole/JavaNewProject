package javaScriptEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class ScrollUsingJSE {
	
	
	public static void main(String[] args) {
		
	
	WebDriver driver=Browser.openBrower("https://vctcpune.com/selenium/practice.html");
	WebElement element=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	
	//Scroll By using cordinates
	JavascriptExecutor jse=((JavascriptExecutor)driver);
	jse.executeScript("window.scrollBy(0,800)");
	
	//Scroll to element
	JavascriptExecutor jse1=((JavascriptExecutor)driver);
	jse1.executeScript("arguments[0].scrollIntoView(true)",element);
	}
}
