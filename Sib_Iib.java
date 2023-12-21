package mypackage1;

public class Sib_Iib 
{
	{
		System.out.println("I am IIB 1");
	}
	
	{
		System.out.println("I am IIB 2");
	}
	
	static
	{
		System.out.println("I am SIB 1");
	}
	static
	{
		System.out.println("I am SIB 2");
	}
	Sib_Iib()
	{
		System.out.println("I am Constructor 1");
	}
	Sib_Iib(int a)
	{
		System.out.println("I am constructor 2");
	}
	static void method()
	{
		System.out.println("I am static Method");
	}
	void Pune()
	{
		System.out.println("I am non static Method"); 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main maithod");
		Sib_Iib s1 = new Sib_Iib(); //way 1 - creating obj and calling constructor
		new Sib_Iib(5); //way 2 - creating obj and calling constructor
		s1.Pune();
		method();

	}
}
