package practiceFromStart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildbrowserOnNaukri {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.naukri.com/");
		WebElement forEmployers=driver.findElement(By.xpath("//div[@class='down-arrow']"));
		forEmployers.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext())
		{
			Thread.sleep(3000);
			String handle=i.next();
			driver.switchTo().window(handle);
			
			String title =driver.getTitle();
			
			if(title.equals("Job Posting Website - Recruitment Solutions - Employer's Login | Naukri.com"))
			{
				WebElement login=driver.findElement(By.xpath("(//li[@class='boxSel sel'])[1]"));
				login.click();
				
			}
		}
		
	}

}
