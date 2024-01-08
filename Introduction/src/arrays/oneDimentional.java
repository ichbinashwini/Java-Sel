package arrays;

public class oneDimentional {


		public static void main(String[] args) {
			
			int[] intArray;				//declaration of array
			intArray = new int[10];		//Size of array is 10, 0-9
			
			int[] intArray1 = new int[] {100,200,300,400,500};
			for(int i=1;i<=9;i++) {
				intArray[i]=i*10;
			}
			for(int i=1;i<=9;i++) {
				
				System.out.println("value of ["+i+"] Index: "+intArray[i]);
			}
			System.out.println("*******************************");
			for(int i=0;i<=4;i++) {
				
				System.out.println("value of ["+i+"] Index: "+intArray1[i]);
			}
		}
	

}
