package date07062022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openBrowser {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrowser("https://www.guru99.com/software-testing.html");
		WebElement search=driver.findElement(By.xpath("(//span[@class='nav-drop-title-wrap'])[1]"));
		search.click();
		WebElement dd=driver.findElement(By.xpath("(//a[text()='Bugzilla'])[1]"));
		dd.click();
		
    	}
  }
//class="nav-drop-title-wrap"
//https://www.guru99.com/software-testing.html