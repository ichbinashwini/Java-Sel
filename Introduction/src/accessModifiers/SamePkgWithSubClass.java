package accessModifiers;

public class SamePkgWithSubClass extends MyMainClass{

	public static void main(String[] args) {
		
		SamePkgWithSubClass SamePkgWithSubClassOBJ = new SamePkgWithSubClass();
		MyMainClass c1 = new MyMainClass();
		
		MyMainClass p1 = new SamePkgWithSubClass();
		MyMainClass p2 = new MyMainClass();
		
		SamePkgWithSubClassOBJ.publicMethod();
		c1.publicMethod();
		p1.publicMethod();
		p2.publicMethod();
		
		SamePkgWithSubClassOBJ.defaultMethod();
		SamePkgWithSubClassOBJ.protectedMethod();
		SamePkgWithSubClassOBJ.publicMethod();
		
		System.out.println(SamePkgWithSubClassOBJ.defaultString);
		System.out.println(SamePkgWithSubClassOBJ.protectedString);
		System.out.println(SamePkgWithSubClassOBJ.publicString);
		
		
		
	}
	public void m1() {
		System.out.println("This is the subclass method");
	}

}
