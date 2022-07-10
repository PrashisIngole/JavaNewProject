package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import locators.Browser;

public class FacebookAccountCreat {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrower("https://www.facebook.com/");
        Thread.sleep(1000);
		WebElement CNA=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
   		CNA.click();
   		Thread.sleep(1000);		
		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
   		name.sendKeys("Prashis");
   		
   		Thread.sleep(1000);
   		WebElement Surname=driver.findElement(By.xpath("(//INPUT[@class='inputtext _58mg _5dba _2ph-'])[2]"));
   		Surname.sendKeys("Ingole");
   		Thread.sleep(1000);
   		WebElement MobileEmail=driver.findElement(By.xpath("(//INPUT[@class='inputtext _58mg _5dba _2ph-'])[3]"));
   		MobileEmail.sendKeys("Prashisingole@gmail.com");
   		Thread.sleep(1000);
   		WebElement MobileEmail2=driver.findElement(By.xpath("( //input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
   		MobileEmail2.sendKeys("Prashisingole@gmail.com");
   		Thread.sleep(1000);
   		WebElement Password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
   		Password.sendKeys("Mainukipata");
   		WebElement Day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
   		Select select =new Select(Day);
   		select.selectByVisibleText("2");
   		Thread.sleep(1000);
   		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
   		Select select1 =new Select(month);
   		select1.selectByVisibleText("Mar");
   		Thread.sleep(1000);
   		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
   		Select select2 =new Select(year);
   		select2.selectByVisibleText("1998");
   		Thread.sleep(1000);
   		WebElement Sex=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
   		Sex.click();
   		Thread.sleep(1000);
   		WebElement Submit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
   		Submit.click();
   		
	}
}
