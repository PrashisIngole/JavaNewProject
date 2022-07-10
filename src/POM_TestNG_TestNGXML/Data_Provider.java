package POM_TestNG_TestNGXML;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	String value;
	String value1;
	
    @BeforeClass
    public void getData() throws EncryptedDocumentException, IOException
    {
    value=parameterizationPackage.Parametrization.gatData("Sheet1", 0, 0);
    value1=parameterizationPackage.Parametrization.gatData("Sheet1", 1, 0);
    }
	
	@DataProvider (name ="BankData")
	public Object[] [] cash() {
	  return new Object [] []{{500,400} ,{500 ,600}};
	}
	
	
	@Test (dataProvider = "BankData")
	public void share(int buy ,int sell)
	{
	
		System.out.println(buy-sell);
	}
	
	@DataProvider (name ="companyData")
	public Object[] [] name() {
	  return new Object [] []{{value,value1}};
	}
	
	@Test (dataProvider = "companyData")
	public void shareName(String company1 ,String company2)
	{
	
		System.out.println(company1);
		System.out.println(company2);
	}
	
	
}
