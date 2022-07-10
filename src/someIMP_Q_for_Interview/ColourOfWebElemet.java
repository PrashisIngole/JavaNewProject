package someIMP_Q_for_Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import locators.Browser;

public class ColourOfWebElemet {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrower("");
		WebElement textBox=driver.findElement(By.xpath(""));
		
		String colorOfTextBox=textBox.getCssValue("");
		String hex=Color.fromString(colorOfTextBox).asHex();
	}
	
}
