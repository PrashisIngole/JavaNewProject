package parameterizationPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//			
//			FileInputStream file=new FileInputStream("C:\\Users\\Prashish Ingole\\OneDrive\\Desktop\\Parametrize.xlsx");
//			String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//			System.out.println(value);
//			
//			FileInputStream file1=new FileInputStream("C:\\Users\\Prashish Ingole\\OneDrive\\Desktop\\Parametrize.xlsx");
//			String value1 =WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//			System.out.println(value1);
//			
//	  }
	
	
	public static String gatData(String SheetName , int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Prashish Ingole\\OneDrive\\Desktop\\Parametrize.xlsx");
		String value =WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
  }
}
