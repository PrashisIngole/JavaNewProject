package pops;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;
import practice.ScreenShot;

public class Alerts {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =Browser.openBrower("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement JsAlert =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		
		JsAlert.click();
		
		Alert a=driver.switchTo().alert();//Alert is interface  
		Thread.sleep(5000);
		a.sendKeys("Prashis");
		
		Thread.sleep(5000);
		a.accept();
//		a.dismiss();
		//String text=a.getText();
		//System.out.println(text);
//      ScreenShot.TakeScreenShot(driver, "jsAlert");
	}
	
}
