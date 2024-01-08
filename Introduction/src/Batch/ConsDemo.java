package Batch;

public class ConsDemo {
	
	
	ConsDemo()
	{
		System.out.println("This is a constructor");
	}

	
	ConsDemo(int b, String s){
		System.out.println("This is parameterised for " + b +" & "+ s);
	}
	
	
	public static void main(String[] args) {
		

		ConsDemo cd = new ConsDemo();
		ConsDemo cd1 = new ConsDemo (10, "String1");
		cd.meth1();
		cd1.meth1();
		

	}
	void meth1() {
		System.out.println("This is a method");
	}

}
