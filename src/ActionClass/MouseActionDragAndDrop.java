package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.Browser;

public class MouseActionDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Browser.openBrower("https://www.globalsqa.com/demo%20site/draganddrop/");
		Actions action =new Actions(driver);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> image=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i=0;i<image.size();i++)
		{
			WebElement picture =image.get(i);
			Thread.sleep(3000);
		
		action.dragAndDrop(picture , trash);
		action.perform();
		}
		
		Thread.sleep(2000);
		List<WebElement> back=driver.findElements(By.xpath("//a[@class='ui-icon ui-icon-refresh']"));
		for(int j=0;j<back.size();j++)
		{
			WebElement refrash =back.get(j);
			Thread.sleep(2000);
			refrash.click();
			action.perform();
		
		}
		
		
	}
}
