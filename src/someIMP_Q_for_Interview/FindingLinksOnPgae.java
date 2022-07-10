package someIMP_Q_for_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class FindingLinksOnPgae {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrowser("https://www.amazon.in/");
		
//		List<WebElement> header =driver.findElements(By.xpath("//a[contains(@href,'http')]"));
//	    System.out.println(header.size());
	    
	    List<WebElement> header =driver.findElements(By.tagName("a"));
	    System.out.println(header.size());
        
//	    for(int i=0;i<=header.size()-1;i++)
//	    {
//	    	System.out.println("Text"+header.get(i).getText());
//	    	System.out.println("Atribute value"+header.get(i).getAttribute("href"));
//	    	
//	    }
	}
}
