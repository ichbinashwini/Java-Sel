package accessModifier2;

import accessModifiers.MyMainClass;

public class modifier2Demo {

	public static void main(String[] args) {
		
		MyMainClass MyMainClassOBJ = new MyMainClass();
//-------Accesssing all methods------------------
		
		MyMainClassOBJ.publicMethod();
	
//--------Accesssing all variables----------------
		
		System.out.println(MyMainClassOBJ.publicString);
		
	}

}
