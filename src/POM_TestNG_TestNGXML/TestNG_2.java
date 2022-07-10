package POM_TestNG_TestNGXML;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNG_2 {

	
	@Test
	public void test1() {
		System.out.println("Test01");
	}
	
	@Test
	@Parameters({"i"})
	public void test2(int cost) {
		System.out.println(cost);
	}
}
