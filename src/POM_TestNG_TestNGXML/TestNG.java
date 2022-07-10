package POM_TestNG_TestNGXML;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	
	@Test (priority =1 )//,timeOut =1000)
	public void login() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Login");
	}
	
	@Test (priority =-1 )//, dependsOnMethods="login")
	public void pin()
	{
		System.out.println("Pin");
	}
	
	@Test (priority =0 ,invocationCount =2 ,enabled =false)
	public void forgotPassword()
	{
		System.out.println("Forgot Password");
	}
	
	@BeforeMethod 
	public void starting_indiaction()
	{
		System.out.println("start of test Execuation");
	}
	
	@AfterMethod
	public void ending_Indication()
	{
		System.out.println("End of Test Execuation");
	}
	
	@BeforeClass
	public void startOfClass()
	{
		System.out.println("Our Testing Process is going to be Start");
	}
	
	@AfterClass
	public void endOfClass()
	{
		System.out.println("End of our Teting Process ");
	}
	
	@BeforeTest
	public void BeforeTest_Process()
	{
		System.out.println("|| Functional ||");
	}
	
	@AfterTest
	public void afterTest_Process()
	{
		System.out.println("|| The End ||");
	}
}
