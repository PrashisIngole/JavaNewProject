package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practice.BrowserForPractice;

public class getText {
	
	public static void main(String[] args) {
	
		WebDriver driver=BrowserForPractice.openBrowser("https://vctcpune.com/selenium/practice.html");			//String expectedResult ="VELOCITY CORPORATE TRAINING CENTER";
		String expectedResult ="Katraj Branch";
			
		WebElement Text =driver.findElement(By.xpath("//a[@class='navbar-brand font-weight-bold text-white']"));
			
		//WebElement Text =driver.findElement(By.xpath("(//strong)[3]"));
		String actualtext=Text.getText();
		System.out.println(actualtext);			
		if(actualtext.equals(expectedResult))
		{
		System.out.println("It is right");
		}			
		else
		{
		System.out.println("It is Wrong");
		}
	}

}
