package ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import practiceFromStart.Browser;

public class Keyboard {
	
	 
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openBrowser("https://demoqa.com/text-box");
		
		WebElement userName =driver.findElement(By.xpath("//input[@id='userName']"));
		userName.sendKeys("Prashis");
		
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("prashisingole@yahoo.com");
		
		action.sendKeys(Keys.TAB).sendKeys("Backside of hero Showroom");
	
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		
		
		action.keyDown(Keys.CONTROL).sendKeys("v");
		action.keyUp(Keys.CONTROL);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.DELETE);
		
		Thread.sleep(2000);
//		action.sendKeys(Keys.TAB);
//		action.sendKeys(Keys.ENTER);
//		
		action.build().perform();
		
//		Action a=action.build();
//		a.perform();
		
		WebElement getValue=driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
				String n=getValue.getAttribute("currentAddress");
				System.out.println(getValue.getText());
				System.out.println(n);
	}

}
