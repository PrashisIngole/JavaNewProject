package locators;

public class ExeptionHandling {
	
	public static void main(String[] args) {
		
		int a=10,b=0;
		System.out.println(a+b);
		try {
	    System.out.println(a/b);
		}
		catch(Exception d) {
			System.out.println(d);
		}
		finally {
			System.out.println("Hii");
		} 
		}
}
