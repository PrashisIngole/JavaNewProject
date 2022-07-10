package practiceFromStart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PracticeforChildBrowserPopups {
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=Browser.openBrowser("https://www.naukri.com/");
	WebElement a=driver.findElement(By.xpath("//div[text()='For employers']"));
	a.click();
	a.click();
	a.click();
	
//	ArrayList<String> s=new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(s.get(1));
//	driver.findElement(By.xpath("//li[text()='Login/Register']")).click();
	
	Set<String> s=driver.getWindowHandles();
	Iterator<String> i=s.iterator();
	
	while(i.hasNext())
	{
		Thread.sleep(3000);
		
		driver.switchTo().window(i.next());
		
		if(driver.getTitle().equals("Job Posting Website - Recruitment Solutions - Employer's Login | Naukri.com"))
		{
			driver.findElement(By.xpath("//li[text()='Login/Register']")).click();
		}
		else
		{
			System.out.println("Did not find similar to title");
		}
	}
	
	
}
}