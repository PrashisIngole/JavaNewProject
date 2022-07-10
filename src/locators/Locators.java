package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main (String [] args){
		
		WebDriver driver =Browser.openBrower("https://www.facebook.com/");
		
//		WebElement email=driver.findElement(By.id("email"));//email by id
//		email.sendKeys("Prashis");
//		
//		WebElement emailbycss= driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));// email by css
//		emailbycss.sendKeys("Prashis");
//		
//	
//		WebElement password =driver.findElement(By.id("pass"));//password by id
//		password.sendKeys("123456");
//		
//		WebElement login =driver.findElement(By.tagName("button"));// login by tagname
//		login.click();
		
		
//		WebElement creat = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
//		creat.click();
		
//		WebElement email = driver.findElement(By.name("email"));
//		email.sendKeys("Prashis");
		
//		WebElement login = driver.findElement(By.className("_6ltg"));
//		login.click();
		
		WebElement login3=driver.findElement(By.linkText("Forgotten password?"));
		login3.click();
		
//		WebElement login1 = driver.findElement(By.tagName("button"));
//		login1.click();
//		
//		WebElement 
		
		
		}

}
