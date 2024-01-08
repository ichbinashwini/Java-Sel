import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameString = "My Name Is Ashwini. Working as a QA in Coditas, Pune";
		String[] splittedString = nameString.split(" ");
		int arrayLength = splittedString.length;
		
	
		System.out.println(splittedString.length);
	
		ArrayList <String> myArrayList = new ArrayList <String> ();
		
		
		for (int i= 0 ; i<arrayLength; i++)
		{
		String each = splittedString[i];
		myArrayList.add(each);
		
		}
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		
		System.out.println(myArrayList);
		
		
		//Print in reverse order
		
		
		for (int i= nameString.length() -1 ; i >= 0; i--) {
			
			System.out.println(nameString.charAt(i));
		}
		
		MethodsDemo demo1 = new MethodsDemo();
		String out = demo1.printData();
		System.out.println(out);
		
		methodsDemo2 D2 = new methodsDemo2();
		D2.printD2Data();
		
		
		
	
		
	}
	
	
}
