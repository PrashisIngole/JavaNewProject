package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class isSelect {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		WebElement RedioButton1 =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		RedioButton1.click();
		
		boolean result =RedioButton1.isSelected();
		System.out.println(result);
		Thread.sleep(3000);
		
		
		WebElement RedioButton2 =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		RedioButton2.click();
		
		boolean result1 =RedioButton1.isSelected();
		System.out.println(result1);
		
	}

}
