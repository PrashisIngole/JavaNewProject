package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowAutomation {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =BrowserForPractice.openBrowser("https://groww.in/");
		ScreenShot.TakeScreenShot(driver, "Grow");//use of TakeScreenshot method of Screenshot class
		WebElement Login1 =driver.findElement(By.xpath("//span[@style='padding: 0px 25px;']"));
		Login1.click();
		Thread.sleep(1000);
		
		WebElement email=driver.findElement(By.xpath("//input[@id ='login_email1']"));
		email.sendKeys("prashisingole1998@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement continueforLogin = driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension'][1]"));
		continueforLogin.click();
		
		//Thread.sleep(1000);
		
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("P9762886943");
		
		Thread.sleep(1000);
		
		WebElement submit =driver.findElement(By.xpath("//div[@class='absolute-center btn51ParentDimension']"));
		//submit.click();
		
		Thread.sleep(3000);
		
		boolean result =submit.isEnabled();
		System.out.println(result);
		
//		WebElement pin1 =driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
//		pin1.sendKeys("1 9 9 8");
//		
//		Thread.sleep(1000);
		
//		WebElement investment = driver.findElement(By.xpath("//a[@class='hdQuickLabel'][2]"));
//		investment.click();
//		
//		Thread.sleep(1000);
//		WebElement viewAllInvestment = driver.findElement(By.xpath("//a[@href='/user/order/stocks']"));
//		viewAllInvestment.click();
//
//		Thread.sleep(1000);
//		
//		WebElement MF = driver.findElement(By.xpath("//div[@class='valign-wrapper dashboardTabsText']"));
//		MF.click();
//		
//		Thread.sleep(1000);
//		WebElement investmentO = driver.findElement(By.xpath("//div[@class='c11CLabel']"));
//		investmentO.click();
		
//		WebElement circle = driver.findElement(By.xpath("//img[@class='circle'][1]"));
//		circle.click();
//		Thread.sleep(1000);
//		
//		WebElement DarkMode = driver.findElement(By.xpath("//div[@class='sw348reactSwitchLabel']"));
//		boolean result =DarkMode.isSelected();
//		System.out.println(result);//f
//		Thread.sleep(3000);
		
//		DarkMode.click();
//		boolean result1 =DarkMode.isSelected();
//		System.out.println(result1);//T
		
		
//		WebElement Search = driver.findElement(By.xpath("//input[@id='globalSearch23']"));
//		Search.sendKeys("Tata motors ltd");
//		Search.click();
			
	}
}
