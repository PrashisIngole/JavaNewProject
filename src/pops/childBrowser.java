package pops;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import locators.Browser;


public class childBrowser {
public static void main(String[] args) {
	WebDriver driver=Browser.openBrower("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
	WebElement seleniumPractise =driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item w3-hover-white w3-hover-text-green w3-hide-small']"));
	seleniumPractise.click();
	seleniumPractise.click();
	
//	String homePage=driver.getWindowHandle();//gives the address of current page //getWindowHandle is the method of WebDriver
//	System.out.println(homePage);
	
	Set<String> handles =driver.getWindowHandles();
	//Set store multiple data in it
	//<String> generic tells us what kind of data SET stores
	//SET Doesn't save duplicate data
	//SET doesn't maintain insertion order(unorganized)
	
	Iterator<String> i=handles.iterator();//Iterator method returns Iterator interface
	String handel1 =i.next();//By using next method of Iterator Interface we can call the value stored in SET
	System.out.println(handel1);
	
	String handel2 =i.next();
	System.out.println(handel2);
	
	String handel3 =i.next();
	System.out.println(handel3);
}
}
