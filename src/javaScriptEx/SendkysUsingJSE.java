package javaScriptEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class SendkysUsingJSE {

	
	public static void main(String[] args) {
		
		WebDriver driver=Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		WebElement textBox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].value='prashisIngole';", textBox);
		
		
		
		
	}
	
	
}
