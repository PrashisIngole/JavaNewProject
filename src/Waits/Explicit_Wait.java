package Waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
public void explicit(WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver ,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(null));
		

	}

}
