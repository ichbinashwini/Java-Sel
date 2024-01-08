package constructors;

public class conDemo {
	
	boolean a;
	String b;
	int c;
	
	conDemo(){
		
		//this("KK", 7);
		System.out.println("This is default constructor");
	}

	conDemo(String b){
		System.out.println("This is with String parameter");
	}
	
	conDemo(String b, int c){
		//this("LL");
		System.out.println("This is with two parameteres");
	}
	
	
	public static void main(String[] args) {
		
		new conDemo("yy", 0);
		

	}

}
