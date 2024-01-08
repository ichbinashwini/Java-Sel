import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		
		
		//String ----------------------------------------------------
		
		String empString = "This is a employee string";
		
		String workerString = new String ("This is a worker string");
		
		
		// Arrays  --------------------------------------------------
		int[] myArray1 = new int[4];
		myArray1[0]= 5;
		myArray1[1]= 6;
		myArray1[2]= 7;
		myArray1[3]= 8;
		//System.out.println(myArray1[3]);
		
		int[] myArray2 = {1,2,3};
		//System.out.println("This is length of myArray2 "+ myArray2.length);
		
		String[] names = {"This", "is","a","String","Array"};
		
		//Advanced For loop -----------------------------------------
		for (String eachName: names ) 
		{
			
			//System.out.println(eachName);
			
		}
			
		//Multiples of 2
	    int[] myArray3 = {1,2,3,4,5,6,7,8,10,20,15};
			
		for (int i=0; i<myArray3.length; i++) 
		{
			if (myArray3[i]%2 == 0) 
			{
				System.out.println(myArray3[i]);
			}
		}
			
		System.out.println("**************");
		
		ArrayList <String> a = new ArrayList <String> ();
		a.add ("Ashwini");
		a.add ("Learnings");
		a.add("New");
		
		for (String val:a)
		{
			//System.out.println(val.contains("New"));
		}

		//System.out.println(a.contains("New"));
		
		String[] friendsArray = {"Nia","Kol","Max"};
		List <String> friendsArrayList = Arrays.asList(friendsArray);
		System.out.println(friendsArrayList.contains("Nia"));
		
	}

}



