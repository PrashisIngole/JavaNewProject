package practiceFromStart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class childbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= Browser.openBrowser("https://vctcpune.com/");
		WebElement seleniumPractice=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractice.click();
		seleniumPractice.click();
		seleniumPractice.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator <String> i=handles.iterator();
		
		while(i.hasNext())
		{
			Thread.sleep(3000);
			String handle=i.next();
			driver.switchTo().window(handle);
			
			String nameOfTitle=driver.getTitle();
			
			if(nameOfTitle.equals("Practice Page"))
			{
				WebElement home =driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
				home.click();
			}
			
			
			
		}
		
		
		
	}
}
