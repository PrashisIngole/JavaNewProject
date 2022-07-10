package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class05 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Class04.openBrowser("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("9762886943");
		
        //WebElement email=driver.findElement(By.cssSelector("input[type='text']"));
        //email.sendKeys("9762886943");
		
		
		
		WebElement password =driver.findElement(By.xpath("//input[contains(@type,text)][3]"));
		//password.sendKeys("mla");
	//password.click();
		password.sendKeys("Prashis");
		
		
//		WebElement login =driver.findElement(By.tagName("button"));
		//WebElement login =driver.findElement(By.tagName("button"));
		
		
		//Thread.sleep(10000);
		
		//driver.close();
	}

}
