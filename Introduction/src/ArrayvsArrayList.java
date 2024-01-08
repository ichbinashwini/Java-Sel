import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayvsArrayList {

	public static void main(String[] args) {
		
		
//Array - Method 1
		String [] ar1 = new String[3];
		
		  ar1[0] = "AP";
		  
		 
		 
		  
//Array - Method 2 
		  Integer [] mynum = {2,4,6,8};
		  
		  

//Arraylist
		  
		  ArrayList<String> frndlist = new ArrayList<String>(); //declairing new arraylist
		  
		  ArrayList<String> ar1list = new ArrayList<String>(Arrays.asList(ar1));  //converting array to arraylist
		  ar1list.add("ab");
		  ar1list.add("qb");
		  ar1list.add("AC");
		  System.out.println("Converted by arrayList " + ar1list);
		  
		  
//Converting using asList only, will be just an array which can not be changed. as shown for ar2 below
		  
		  List <Integer> ar2 = Arrays.asList(mynum);
		  
		  //ar2.add(9);
		  System.out.println(ar2.get(3));
		  
		  
		  
//fetching the data from array 

		  System.out.println(ar1[0]);
		  
		  
//Fetching data of arrayList
		  System.out.println(ar1list.get(1));
		  
		  
//Size/length of array and arrayList
		  
		 System.out.println(ar1.length);
		 System.out.println(ar1list.size());
		  
		  
	}

}
