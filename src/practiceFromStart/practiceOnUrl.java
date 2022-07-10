package practiceFromStart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practiceOnUrl {

	public static void main(String[] args) throws InterruptedException, IOException {
	//WebDriver driver=Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
	
//	Dimension size =new Dimension(517,250);
//	driver.manage().window().setSize(size);
//	
//	Dimension sizeofWindow =driver.manage().window().getSize();
//	System.out.println(sizeofWindow);
	
//	Point position =new Point(100,100);
//	driver.manage().window().setPosition(position);
	
//	Point getPosition =driver.manage().window().getPosition();
//	System.out.println(getPosition);
//	String Text=driver.getTitle();
//	System.out.println(Text);
	
	//driver.navigate().back();
	//(//strong)[1]
	//WebElement AboutUs=driver.findElement(By.cssSelector("input[value='Radio1']"));
	//AboutUs.click();
	
//	boolean result=AboutUs.isSelected();
//	System.out.println(result);
	WebDriver driver=Browser.openBrowser("https://vctcpune.com/");
	Screenshot.takeScreenshot1(driver, "VCTC");
//	String expectedResult ="Our Mission";
//	Thread.sleep(1000);
//	WebElement text=driver.findElement(By.xpath("(//html//article//h2/strong)[1]"));
//	String acutalResult=text.getText();
//	System.out.println(acutalResult);
//	
//	boolean result=acutalResult.equals(expectedResult);
//	if(result==true)
//	{
//		System.out.println("text is matched");
//	}
//	else
//	{
//		System.out.println("Text is not matched");
//	}
	
	
	
	}
}
