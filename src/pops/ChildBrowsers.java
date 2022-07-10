package pops;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class ChildBrowsers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		WebElement getYourWebSite =driver.findElement(By.xpath("(//a[@target=\"_blank\"])[2]"));
		getYourWebSite.click();
		getYourWebSite.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext())//return true if set has new value from set
		{
			Thread.sleep(3000);
			String handle=i.next();//will return first value from set
			
			driver.switchTo().window(handle);//will switch the selenium focus from main page to required page
			
			String nameOfTitle =driver.getTitle();
			
			if(nameOfTitle.equals("Create a Free Website | Free Website Builder | W3Schools.com"))
			{
				WebElement toggel =driver.findElement(By.xpath("//img[@id='selectorimage']"));
				toggel.click();
			}
		}
		
		
	}
}
