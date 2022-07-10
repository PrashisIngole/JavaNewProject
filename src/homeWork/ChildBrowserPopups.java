package homeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class ChildBrowserPopups {

	public static void main(String[] args) {
		WebDriver driver=Browser.openBrower("");
		WebElement practicepage =driver.findElement(By.xpath(null));
		practicepage.click();
		practicepage.click();
		
		
		
		
	}
}
