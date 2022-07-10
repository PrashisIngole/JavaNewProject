package practiceFromStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {

	public static void main(String[] args) {
		
	
	WebDriver driver=Browser.openBrowser("http://demo.automationtesting.in/Frames.html");
	
	WebElement iframeWithIframe=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	iframeWithIframe.click();
	
	WebElement outerFrame =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerFrame);
	
	WebElement innerFrame =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerFrame);
	
	
	WebElement text =driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("Prashis");
	
	driver.switchTo().parentFrame();
	
	WebElement gettext =driver.findElement(By.xpath("//a[@href='Index.html']"));
	System.out.println(gettext.getText());
	
	
}
}