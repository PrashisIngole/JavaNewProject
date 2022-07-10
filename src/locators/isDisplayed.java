package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import practice.BrowserForPractice;

public class isDisplayed {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserForPractice.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement status =driver.findElement(By.xpath("//input[@id='displayed-text']"));
    	status.click();

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
		
//		WebElement textBox =driver.findElement(By.xpath("//input[@id='name']"));
//		System.out.println(textBox.isDisplayed());
		
    	//WebElement dropDown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//    	String list=dropDown.getText();
//    	
		//Select s=new Select(dropDown);
		//s.selectByIndex(2);
	//	s.selectByValue("Radio3");
		//System.out.println(s.selectByValue("Radio3"));
	
		
		//System.out.println(dropDown.getAccessibleName());
	
		//System.out.println(dropDown.getSize());
		//String x=dropDown.getText();
		
		//System.out.println(x);
//		System.out.println(dropDown.isEnabled() + "Is enables");//True
//		System.out.println(dropDown.isDisplayed()+ "Is Display");//True
//		System.out.println(dropDown.isSelected() + "Is Select");//False
		
//    	WebElement radioButton =driver.findElement(By.xpath("//input[@value='Radio2']"));
//    	radioButton.click();
//    	System.out.println(radioButton.isSelected());
    	
    	
    	WebElement textBox =driver.findElement(By.xpath("//input[@id='autocomplete']"));
    	textBox.sendKeys("Prashis");
    	System.out.println(textBox.isDisplayed());
    	
    	
    	
    	
    	
    	
    	
		
	}

}
