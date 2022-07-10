package javaScriptEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class ClickUsingJSE {

	
	public static void main(String[] args) {
		
		WebDriver driver=Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].click();", checkBox);
		
		boolean result=checkBox.isSelected();
		System.out.println(result);
		
		
	}
}
