package practice;

import java.rmi.server.RemoteRef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import date07062022.Browser;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement outerIframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerIframe);
		
		WebElement innerIframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerIframe);
		
		WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));
		textBox.sendKeys("Prashis");
		
//		WebElement textBox=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
//		System.out.println(textBox.getText());
		
	}
}
