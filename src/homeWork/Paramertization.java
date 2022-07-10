package homeWork;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Paramertization 
{

	public static String getdata(String sheetName,int i,int j) throws EncryptedDocumentException, IOException {
		
		
				FileInputStream file=new FileInputStream("C:\\Users\\Prashish Ingole\\OneDrive\\Desktop\\Parametrize.xlsx");
				
				String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
				//System.out.print(" "+value);
			
				return value;
	
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String name=Paramertization.getdata("Sheet1", 1, 2);
		System.out.println(name);
	}
}
