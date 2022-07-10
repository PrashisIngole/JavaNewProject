package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=BrowserForPractice.openBrowser("https://groww.in/");
		WebElement login =driver.findElement(By.xpath("//span[@style='padding: 0px 25px;']"));
		login.click();
		System.out.println(driver.getClass());
		
		WebElement username =driver.findElement(By.xpath("//input[@id ='login_email1']"));
		username.sendKeys("prashisingole1998@gmail.com");
		
		System.out.println(driver.getClass());
		
//		WebElement continueforLogin = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension'][1]"));
//		continueforLogin.click();
//		
//		Thread.sleep(1000);
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("P9762886943");
//		
//		password.clear();
//		
//		WebElement submit =driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
//		
//		boolean result =submit.isEnabled();
//		System.out.println(result);
		

	
	
	}
}
