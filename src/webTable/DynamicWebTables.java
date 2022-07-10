package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class DynamicWebTables {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openBrower("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int sizeOfRows=rows.size();
		System.out.println(sizeOfRows);
		
		
		for(int i=1;i<=sizeOfRows-1;i++)
		{
			List<WebElement> columns=driver.findElements(By.tagName("td"));
			int sizeOfColums=columns.size();
			System.out.println(sizeOfColums);
			
			for(int j=1;j<=sizeOfColums-1;j++)
			{
				String cellText=columns.get(i).getText();
				if(cellText.equals("Marico Ltd."))
				{
					System.out.println(columns.get(2).getText());
				}
				else {
					Thread.sleep(2000);
					driver.navigate().refresh();
				}
				
			}
		}
		
		
		
	}
}
