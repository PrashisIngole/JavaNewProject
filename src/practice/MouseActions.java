package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "exepath");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebElement Sourse =driver.findElement(By.xpath(""));
		
		Actions action =new Actions(driver);
		action.contextClick();//Right Click
		action.perform();
		
		action.doubleClick();
		action.perform();
		WebElement destination =driver.findElement(By.xpath(""));
		action.dragAndDrop(Sourse, destination);
		
		action.moveToElement(Sourse);
		
		
	
		
		
		
	}
}
