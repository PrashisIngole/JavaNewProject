package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssValues_Attribute {
	
	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrower("https://kite.zerodha.com/");
		WebElement element=driver.findElement(By.xpath("//a[@href='/forgot']"));
		String attributeValue=element.getAttribute("class");
		System.out.println(attributeValue);
		String cssValue=element.getCssValue("background-color");
		System.out.println(cssValue);
	}
	
	

}
