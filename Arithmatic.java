package mypackage1;

public class Arithmatic 
{
	 void add()
	{
		int a=500;
		int b=100;
		int c= a+b;
		System.out.println(c);
	}
	static void subtract()
	{
		int a=500;
		int b=100;
		int c= a-b;
		System.out.println(c);
	}
	static void multiple()
	{
		int a=500;
		int b=100;
		int c= a*b;
		System.out.println(c);
	}
	static void division()
	{
		int a=500;
		int b=100;
		int c= a/b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Arithmatic a1 = new Arithmatic(); // non static method calling
		a1.add();	
		division();
		multiple();
		subtract();
	}
}
