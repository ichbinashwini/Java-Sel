package polymorphism;

public class B extends A {
	
	
	public void show() 
	{
		
		System.out.println("This is B show");
		super.show();
	}

	public static void main(String[] args) 
	{
		B obj1 = new B();
		obj1.show();
		

		
	}

}
