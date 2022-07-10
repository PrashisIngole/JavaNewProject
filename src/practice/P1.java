package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.grid.Main;

public class P1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =BrowserForPractice.openBrowser("https://groww.in/");
		WebElement Login1 =driver.findElement(By.xpath("//span[@style='padding: 0px 25px;']"));
		Login1.click();
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id ='login_email1']"));
		email.sendKeys("prashisingole1998@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement continueforLogin = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension'][1]"));
		continueforLogin.click();
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("P9762886943888");
		
		WebElement submit = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
        submit.click();
//		boolean result =submit.isEnabled();
//		System.out.println(result);
        Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\Prashish Ingole\\OneDrive\\Documents\\SS\\Grow.jpg");
        org.openqa.selenium.io.FileHandler.copy(source, destination);
		}
}
