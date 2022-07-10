package practiceFromStart;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.antlr.v4.runtime.misc.Array2DHashSet;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pops.Alerts;

public class Practice01 {

	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		WebElement nameOfElement =driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		nameOfElement.click();
		nameOfElement.click();
		
		ArrayList<String> obj =new ArrayList<String>(driver.getWindowHandles());//We Creat a object of arraylist and pass the getwindow method of webdriver which return the string values that store in the arrylist in the form of index
		int a=obj.size();
		System.out.println(a);
		driver.switchTo().window(obj.get(1));//we use the get method of  Arraylist  to swtich to the window by passing the index of window
		
		WebElement getStart =driver.findElement(By.xpath("//button[@class='_1VfsI _OD95i _3_H0V mobb']"));
		getStart.click();
		
	}
}



