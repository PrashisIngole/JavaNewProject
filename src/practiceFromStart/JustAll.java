package practiceFromStart;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustAll {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=Browser.openBrowser("https://theautomationzone.blogspot.com/#");
		List<WebElement> sampleTable =driver.findElements(By.xpath("//div[@class='divTableRow']"));
		//WebElement all=sampleTable.get(0);
		
		if(sampleTable.equals(sampleTable))
		{
			List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int i=0;i<=checkBox.size()-1;i++)
//		{
//			
//			Thread.sleep(2000);
//		checkBox.get(i).click();
//			
//		}
			for(WebElement s :checkBox)
			{
			s.click();	
			}
		}
		
		

	}
}
