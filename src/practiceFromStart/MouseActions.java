package practiceFromStart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://theautomationzone.blogspot.com/#");
		WebElement form =driver.findElement(By.xpath("//input[@id='full_name']"));
		Actions action =new Actions(driver);
		form.sendKeys("Prashis Prakash Ingole");
		
		
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("Prakash");
		
		
		
		
//		Thread.sleep(2000);
//		action.sendKeys("Prakash");
//		action.sendKeys("Anjali");
//		action.sendKeys(Keys.TAB);
//		action.sendKeys("prashisingole@yahoo.com");
//		
//		
//		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL);
//		action.sendKeys(Keys.TAB);
//		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
//		
		
		
		
	}
}
