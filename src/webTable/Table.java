package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practiceFromStart.Browser;



public class Table {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
//		//Number Of rows
//		List<WebElement> rows= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
//		int sizeOfRow=rows.size();
//		System.out.println("Number of Rows "+sizeOfRow);
//		
//		//Number of Columns
		List<WebElement> columns= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr/th"));
		int sizeOfColumns=columns.size();
//		System.out.println("Number of columns "+sizeOfColumns);
//		
//		//List of Columns
//		for(int i=0;i<sizeOfColumns;i++)
//		{
//			System.out.println(columns.get(i).getText());
//		}
//		
//		//List of Rows
//		for(int i=1;i<=sizeOfRow-1;i++)
//		{
//			System.out.println(rows.get(i).getText());
//		}
		
		
		//maximum form list
		List<WebElement> rows= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
		int sizeOfRow=rows.size();
		
		double maxPrice=0;
		
		for(int i=1;i<=sizeOfRow-1;i++)
		{
			
			WebElement currentPrise=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td[4]"));
			String price=currentPrise.getText();
			
			double d=Double.parseDouble(price);
			
			if(d>maxPrice)
			{
				maxPrice =d;
			}	
		}
		System.out.println("Minumnum Price is "+maxPrice);
		
		//Minimum form list

		for(int j=1;j<=sizeOfRow-1;j++)
		{
			
			WebElement currentPrise=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+j+"]//td[4]"));
			String price=currentPrise.getText();
			
			double d=Double.parseDouble(price);
			
			if(d<maxPrice)
			{
				maxPrice =d;
			}
				
		}	
		System.out.println("Minimnm Price is "+maxPrice);
		
		
		//List of Company
//		for(int i=1;i<=sizeOfRow-1;i++)
//		{
//			
//			WebElement currentPrise=driver.findElement(By.xpath("//table//tr["+i+"]/td[1]"));
//			String price=currentPrise.getText();
//			System.out.println(price);
//			
//		}
		
		
		//From condition
				for(int i=1;i<=sizeOfRow-1;i++)
				{
					
					WebElement currentPrise=driver.findElement(By.xpath("//table//tr["+i+"]/td[1]"));
					String price=currentPrise.getText();
					
					if(price.equals("Asian Paints Ltd"))
					{
						WebElement prise=driver.findElement(By.xpath("//table//tr["+i+"]/td[4]"));
						System.out.println(prise.getText());
					}
					
					
					
				}
		
		
		
	}
	
	
}
