package Batch;

public class castingDemo {

	public static void main(String[] args) {
		
		byte a = 50;
		System.out.println(a);
		
		double b = a;				//Implicit casting
		System.out.println(b);

		double c = 50.53;
		System.out.println(c);
		
		int d = (int) c;			//Explicit casting
		System.out.println(d);
	}

}
