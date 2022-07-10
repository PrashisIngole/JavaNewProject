package homeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class Nobroker {

	public static void main(String[] args) {
		
	
	WebDriver driver=Browser.openBrower("https://www.nobroker.in/");
	WebElement dropDown =driver.findElement(By.xpath("//div[@class='css-1wy0on6 nb-select__indicators']"));
	dropDown.click();
	System.out.println(dropDown.getText());
	
	
//	for(int i =0;i<list.size();i++)
//	{
//		System.out.println(list.get(i).getText());
//		if(list.get(i).getText().contains("pune")) 
//		{
//		list.get(i).click();
//		break;
//		}
			
	}
	
	}
