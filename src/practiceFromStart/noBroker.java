package practiceFromStart;



import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class noBroker {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	WebDriver driver =Browser.openBrowser("https://www.nobroker.in/");
	
	WebElement search =driver.findElement(By.xpath("//div[@class='css-v2nw5i-control nb-select__control']"));
	Actions act =new Actions(driver);
	act.moveToElement(search).click();
	
	Thread.sleep(2000);
	
	act.sendKeys(Keys.ARROW_DOWN);
	act.click();
	
	act.build().perform();
	
	
//	System.out.println(driver.findElement(By.xpath("//div[@class='nb__37fWx']")).getText());
//	
//	Screenshot.takeScreenshot1(driver, "Name");
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	System.out.println(list1.size());
//	
//	for(int i=0;i<list1.size();i++)
//	{
//		System.out.println(list1.get(i));
//	}
}
}