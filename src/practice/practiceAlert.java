package practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class practiceAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("https://demoqa.com/alerts");
		WebElement prompt=driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt.click();
		Thread.sleep(3000);
        
		Alert a=driver.switchTo().alert();
		a.sendKeys("Prashis");
		a.accept();
		
		
		
	}
}
