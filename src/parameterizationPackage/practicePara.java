package parameterizationPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practicePara {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				FileInputStream file =new FileInputStream ("C:\\\\Users\\\\Prashish Ingole\\\\OneDrive\\\\Desktop\\\\Parametrize.xlsx");
				String value =WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print("  "+value);
			}
			System.out.println();
		}
	
	}
}
