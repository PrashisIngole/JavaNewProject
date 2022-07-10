package someIMP_Q_for_Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import practiceFromStart.Browser;

public class CheckDropdownSorted {
	
	public static void main(String[] args) {
	  WebDriver driver =Browser.openBrowser("https://www.twoplugs.com/newsearchserviceneed");
	  driver.manage().window().maximize();
      
      Select options = new Select(driver.findElement(By.name("category_id")));
      
      List<WebElement> lists = options.getOptions();                                                       // Get all options from category dropdown
      List<String> OriginalList = new ArrayList<String>();                                                               //Creating a List to store all dropdown values
    
      for(WebElement ele : lists)                                                                //Using for-each loop fetch all options one by one and get their values
      {
          OriginalList.add(ele.getText());
      }
      
      System.out.println("Options in dropdown: " +OriginalList);
      
      List<String> templist = new ArrayList<String>(OriginalList);                                                             //Creating temp List - same copy of Original for comparing purpo     
      System.out.println("Temp List: " + templist);
      
      Collections.sort(OriginalList);
      System.out.println("Sorted List:" + OriginalList );
     
      if(OriginalList.equals(templist))    
      {
          System.out.println("List is Sorted");   
      }
      else 
      { 
          System.out.println("List is unsorted");
      }
      
      driver.quit();
      
  }
	
	
	
	
	
}
