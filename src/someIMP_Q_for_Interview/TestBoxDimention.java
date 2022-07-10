package someIMP_Q_for_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class TestBoxDimention {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		WebElement text =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	
		Dimension a=text.getSize();
		System.out.println(a.getHeight());
		System.out.println(a.getWidth());
		System.out.println(a.getClass());
		
		
	}
}
