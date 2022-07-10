package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Browser;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriver driver =Browser.openBrower("https://vctcpune.com/selenium/practice.html");
		
		//How many Rows in the table
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		int rows=table.size();
		System.out.println("Number OF Rows :- "+rows);
	
		//How many Coloumns in the table
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
		int listOfColumn=column.size();
		System.out.println("Number OF Coulumns :- "+listOfColumn);
		
		//Retrieve specific row/Column data
	    WebElement data=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/td[2]"));
		String value=data.getText();
		System.out.println(value);
		
		//Retrive all data from data
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=listOfColumn;j++)
			{
				WebElement allData=driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(allData.getText() + "        ");
				
			}System.out.println();
		}
		
		//Retriver acordinng to condition
		
		for(int a=2;a<=rows;a++)
		{
			WebElement lan=driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+a+"]/td[2]"));
			String langauge=lan.getText();
			
			if(langauge.equals("Learn SQL in Practical + Database Testing from Scratch"))
			{
				WebElement prize=	driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+a+"]/td[3]"));
				String priseOfCourse =prize.getText();
				System.out.println(priseOfCourse);
			}
		}
	}
}
