package locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo01 {

	
	public static void main (String [] args) throws InterruptedException, IOException{
		
		WebDriver driver =Browser.openBrower("https://www.flipkart.com/");
//		Thread.sleep(6000);
//		driver.manage().window().minimize();
		
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
		ScreenshootWithDate.takescreenshoot(driver, "Flipcart");
		
//      WebElement email=driver.findElement(By.tagName(""));
//      email.sendKeys("Mobile");
		
//		WebElement password =driver.findElement(By.id("pass"));
//		password.sendKeys("123456");
		
		//WebElement login =driver.findElement(By.tagName("button"));
		//WebElement login =driver.findElement(By.xpath("//a[@id='u_O_2_ku']"));
		//WebElement login =driver.findElement(By.className("_2KpZ6l _2doB4z"));
	//	login.click();
		
		
		
		
		
		
		
	}



}
