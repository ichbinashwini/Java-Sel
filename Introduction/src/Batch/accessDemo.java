package Batch;

public class accessDemo {

	int x = 20;							//instance variable
	static int y = 30;					//static variable
	
	public static void main(String[] args) {
		accessDemo od = new accessDemo();
		System.out.println(y);
		m2();
		System.out.println(od.x); 	//instance variable in static method
		od.m1();					//instance method in static method
		
	}
	void m1()							//Non static method
	{
		System.out.println(y);
		System.out.println(x);
		m2();
		System.out.println("M1 method/Non static method");
	}
	static void m2()							//static method
	{
		System.out.println("M2 method/static method");
	}
}
