package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vctc1 {

	public static void main(String[] args) {
		
		WebDriver driver =BrowserForPractice.openBrowser("https://vctcpune.com/");
		WebElement er=(WebElement) driver.findElements(By.xpath("(//strong)[3]"));
		System.out.println(er);
	}
}
