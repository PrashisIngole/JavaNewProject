package practice;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import locators.Browser;

public class AmazonPracticOFSelect {

	public static void main(String[] args) {
		WebDriver driver=Browser.openBrower("https://www.amazon.in/");
	
		WebElement searchDropdown =driver.findElement(By.id("searchDropdownBox"));
		searchDropdown.click();
		
		Select fild =new Select(searchDropdown);
		List<WebElement> dd=driver.findElements(By.xpath("//option[contains(@value,'search-alias')]"));
		for(int i=0;i<=dd.size()-1;i++)
		{					
		System.out.println(dd.get(i));	
		}
		
		
		
	
	}
}
