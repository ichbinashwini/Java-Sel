package accessModifiers;

public class MyMainClass {
	
	
	String defaultString = "DefaultString";
	public String publicString = "PublicString";
	private String privateString = "PrivateString";
	protected String protectedString = "ProtectedString";
	
	

	public static void main(String[] args) {
		
		
		MyMainClass demoObject = new MyMainClass();
//---------Accessing Methods---------------------------
		
		demoObject.defaultMethod();
		demoObject.privateMethos();
		demoObject.protectedMethod();
		demoObject.publicMethod();
		
//---------Accessing Variables------------------------
	
		System.out.println(demoObject.defaultString);
		System.out.println(demoObject.privateString);
		System.out.println(demoObject.publicString);
		System.out.println(demoObject.protectedString); 
		
		
	
	}
	
	
	
	void defaultMethod() {
		System.out.println("This is default method");
	}

	
	private void privateMethos() {
		System.out.println("This is a private method");
	}
	
	
	protected void protectedMethod() {
		System.out.println("This is protected method");
	}
	
	public void publicMethod () {
		System.out.println("This is Main Class public method");
	}
}