package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import locators.Browser;

public class MouseActionMovement {

	public static void main(String[] args) {
		
		WebDriver driver=Browser.openBrower("https://www.amazon.in/");
		WebElement signIn=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(signIn);
		action.perform();
		
		WebElement yourRecomendation=driver.findElement(By.xpath("//span[text()='Your Recommendations']"));
		action.moveToElement(yourRecomendation);
		action.click();
		action.perform();
		
		
	}
}
