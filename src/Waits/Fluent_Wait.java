	package Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {
	public void fluintWait(WebDriver driver) 
	{
		
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(null));
		
		
	}

}
