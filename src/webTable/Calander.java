package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;

public class Calander {

	public static void main(String[] args) {
		
	
	WebDriver driver =Browser.openBrowser("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	WebElement calander=driver.findElement(By.id("datepicker"));
	calander.click();
	
	WebElement next=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/a[2]"));
	
	WebElement month=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/span[1]"));
	
	WebElement year=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/div/span[2]"));

	
	List<WebElement> row=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr"));
	System.out.println(row.size());
	
	List<WebElement> columns=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));
	System.out.println(columns.size());
	
	while(true){
	if(month.equals("May") && year.equals("2023"))
	{
		break;
    }
	else
	{
		next.click();
	}
	}
    }
	
}