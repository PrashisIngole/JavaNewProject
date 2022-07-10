package parameterizationPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class FaceBookLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	WebDriver driver =Browser.openBrower("https://www.facebook.com/");
	
	String emailId=Parametrization.gatData("Sheet1", 0, 0);
	WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
    email.sendKeys(emailId);
   
    String pass=Parametrization.gatData("Sheet1", 1, 1);
    WebElement passsword =driver.findElement(By.xpath("//input[@id='pass']"));
    passsword.sendKeys(pass);
	
}
}