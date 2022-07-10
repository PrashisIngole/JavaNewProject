package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mock02 {

	public static void main(String[] args) {
		WebDriver driver =BrowserForPractice.openBrowser("https://www.facebook.com/");
//		WebElement email =driver.findElement(By.xpath("//input[@type='text']"));
//		email.sendKeys("Prashis");
//		
//		WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("9762886943");
//		
//		WebElement Login= driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
//		Login.click();
		
//		WebElement FP =driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/re')]"));
//		FP.click();
		
		WebElement Privacy =driver.findElement(By.xpath("//a[@data-nocookies='1']"));
	  Privacy.click();
		
		
		
		
		
		
	}
}
