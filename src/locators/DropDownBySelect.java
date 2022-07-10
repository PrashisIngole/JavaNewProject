package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownBySelect{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		WebElement DropDown =driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Thread.sleep(1000);
		Select select =new Select(DropDown);
		
		select.selectByValue("option3");
		select.selectByIndex(2);
		select.selectByVisibleText("Option2");
		
	}
}
