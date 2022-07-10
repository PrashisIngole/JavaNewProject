package pops;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class ArrayList12 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openBrowser("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		WebElement getYourWebSite =driver.findElement(By.xpath("(//a[@target=\\\\\\\"_blank\\\\\\\"])[2]"));
		getYourWebSite.click();
		getYourWebSite.click();
		getYourWebSite.click();
		
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		int s=list.size();
		
		System.out.println(s);
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(list.get(2));
		System.out.println(driver.getCurrentUrl());
		
		
		
	}
	

}
