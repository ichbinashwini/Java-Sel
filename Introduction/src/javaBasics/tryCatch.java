package javaBasics;

public class tryCatch {

	public static void main(String[] args) {
		
		
		
		int [] myNumbers = {1,2,3};
		
		try {
			System.out.println(myNumbers[7]);
			}
			catch(Exception e) 
		{
			System.out.println("this is an exception" + e);
			
		}
		

	}

}
