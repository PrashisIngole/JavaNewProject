package ActionClass;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import AutomateTesting.OpenBrowser;
import locators.Browser;

public class MouseActionDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrower("http://demo.guru99.com/test/simple_context_menu.html");
	
		WebElement dclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action =new Actions(driver);
		action.doubleClick(dclick);
		action.perform();
		
		
		Alert a=driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
	
	}
}
