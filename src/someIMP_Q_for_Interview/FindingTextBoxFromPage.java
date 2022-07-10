package someIMP_Q_for_Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class FindingTextBoxFromPage {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrower("https://demoqa.com/automation-practice-form");
		
		List<WebElement> textBox =driver.findElements(By.xpath("//input[@type='text']"));
		
		int numberOfTextBox=textBox.size();
		System.out.println(numberOfTextBox);
	
		for(WebElement listtextBox: textBox)
		{
		
			System.out.println("Atribute name"+listtextBox.getAttribute("text"));
			System.out.println("Get Text "+listtextBox.getText());
		}
	
	}
}
