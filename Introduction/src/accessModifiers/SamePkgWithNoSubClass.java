package accessModifiers;

public class SamePkgWithNoSubClass {

	public static void main(String[] args) {
		
		MyMainClass Demo3Object = new MyMainClass();
		
		Demo3Object.defaultMethod();
		Demo3Object.protectedMethod();
		Demo3Object.publicMethod();
		
//--------Accessing variables-------------------------
		
		System.out.println(Demo3Object.publicString);
		System.out.println(Demo3Object.defaultString);
		System.out.println(Demo3Object.protectedString);
	}

}
