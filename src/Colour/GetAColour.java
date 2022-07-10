package Colour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import locators.Browser;

public class GetAColour {
	@Test
	public static void main() {
		
		WebDriver driver=Browser.openBrower("https://kite.zerodha.com/");
		WebElement text=driver.findElement(By.xpath("//button[@type='submit']"));
		String colourOfTab=text.getCssValue("background-color");
		
		String hex=Color.fromString(colourOfTab).asHex();//output is = #ff5722
		//String hex=Color.fromString(colourOfTab).asRgb(); //OutPut is rgb(255, 87, 34)
		System.out.println(hex);
		
		Assert.assertEquals(hex, "#ff5722");
		
		
		
		
	}
}
