package Batch;

import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		
		System.out.println("************Scanner Class*******************");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter your name: ");
		 String name = sc.next();
		 System.out.println("Enter your Age: ");
		 int age = sc.nextInt();
		 System.out.println("Enter your ID");
		 int id = sc.nextInt();
		 System.out.println("*******************************");
		 System.out.println("Your name is: "+name);
		 System.out.println("Your age is: "+age);
		 System.out.println("Your ID is: "+id);
	}

}
