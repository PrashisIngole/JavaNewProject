package Practice180620222;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import practiceFromStart.Browser;

public class Parametariztion {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver =Browser.openBrowser("");
		WebElement element =driver.findElement(By.xpath(""));
		
//		FileInputStream file =new FileInputStream ("Paths of location from where we have to get data");
//		
//		WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		FileInputStream file =new FileInputStream("path from where we have to fetch the data");
 
	
}
}