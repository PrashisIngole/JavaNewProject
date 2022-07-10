package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class PhonePay {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openBrower("https://www.phonepe.com/");
		WebElement Blog =driver.findElement(By.xpath("(//a[text()='Blog'])[1]"));
		Blog.click();
		Blog.click();
		Blog.click();
		
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(2000);
		WebElement Security =driver.findElement(By.xpath("//a[text()='Security']"));
		Security.click();
	}
}
