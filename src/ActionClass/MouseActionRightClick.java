package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.Browser;

public class MouseActionRightClick {

	public static void main(String[] args) {
		WebDriver driver =Browser.openBrower("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickMe =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action=new Actions(driver);
		action.contextClick(rightClickMe);
		action.perform();
		
		WebElement edit =driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	
}
