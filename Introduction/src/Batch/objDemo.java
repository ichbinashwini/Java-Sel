package Batch;

public class objDemo {

	int x = 20;
	public static void main(String[] args) {
		int i = 10;
		//System.out.println(x);
		//m1();
		new objDemo().m1();		//method calling without creating reference variable
		new objDemo().m1();
		new objDemo().m1();
		objDemo od = new objDemo(); //method calling with creation of reference variable
		od.m1();
		objDemo od1 = new objDemo();
		System.out.println(od1.x);
		objDemo od2 = new objDemo();
		System.out.println(od2.x);
	}
	void m1()
	{
		System.out.println("M1 method");
	}
}
