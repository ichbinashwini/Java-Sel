package EncapsulationDemo;

public class ClassA 
{

	private int age;
	private String name;
	
	
//--------------- getter-------------------------------- 	
	public int getage () 
	{
		return age;
	}
	
	
	public String getname()
	{
		return name;
	}
//----------------- setter -------------------------------	
	public void setage (int a)
	{
		age = a;
	}
	
	public void setname (String n) 
	{
		name = n;
	}
	
//--------- main method------------------------------------	
	public static void main(String[] args) 
	{
		
		
		
		ClassA a = new ClassA();
		a.setage(30);
		a.setname("Ashwini");
		
		
		System.out.println(a.getage());
		System.out.println(a.getname());
		
		
		
	}
	






}
		// TODO Auto-generated method stub

	
	
	
	
	
	
	





