package someIMP_Q_for_Interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class xyz {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	WebDriver driver =Browser.openBrowser("https://www.w3schools.com/");
	
	//List<WebElement> links =driver.findElements(By.xpath("//a[contains(@href,'http')]"));
	List<WebElement> links =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for(int i=5;i<=links.size()-1;i++)
	{
		
		WebElement element =links.get(i);
		String url =element.getAttribute("href");
		
		URL link =new URL(url);
		
		HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
		Thread.sleep(2000);
		httpConn.connect();
		
		int rescode =httpConn.getResponseCode();
		
		if(rescode >= 400)
		{
			System.out.println(url + " - " + "is broken link ");		
		}
		else
		{
			System.out.println(url + " - " + "is valid link ");
		}
		
	}
	}
	

}	
