package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserForPractice.openBrowser("https://vctcpune.com/");
		
		//String expectedResult ="VELOCITY CORPORATE TRAINING CENTER";
		String expectedResult ="Katraj Branch";
		
		//WebElement Text =driver.findElement(By.xpath("//a[@class='navbar-brand font-weight-bold text-white']"));
		
		WebElement Text =driver.findElement(By.xpath("(//strong)[3]"));
		
		String actualtext=Text.getText();
		System.out.println(actualtext);
		
		if(actualtext.equals(expectedResult))
		{
			System.out.println("It is right");
		}
		else
		{
			System.out.println("It is Wrong");
		}
		
		
		
//		WebElement status =driver.findElement(By.xpath("//input[@id='displayed-text']"));
////		status.click();
//
//		Thread.sleep(3000);
//		boolean status1 = status.isDisplayed();
//		System.out.println(status1);
//
//		Thread.sleep(3000);		
//		WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		hide.click();
//
//		Thread.sleep(3000);
//		boolean status2 = status.isDisplayed();
//		System.out.println(status2);
		
		
		
	}
}
