package practiceFromStart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClass {

	public static void main(String[] args) {
		WebDriver driver=Browser.openBrowser("https://www.naukri.com/");
		WebElement element=driver.findElement(By.xpath("//li[@class='For employers']"));
		
		WebElement buyOnline=driver.findElement(By.xpath("//a[text()='Buy online']"));
		Actions action =new Actions(driver);
		action.moveToElement(element);
		action.perform();
		buyOnline.click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
	
	}
}
