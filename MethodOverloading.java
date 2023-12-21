package mypackage1;

public class MethodOverloading 
{
	static void printA(char c)
	{
		System.out.println("printing method 1");
	}
	
	static void printA(int a, String b)
	{
		System.out.println("printing method 2");
	}
	
	void printA(String b, int a)
	{
		System.out.println("calling non static and Parameterised method overloading method");
	}
	
	void printA()
	{
		System.out.println("calling non static and non parameterised method overloading method");
	}
	public static void main(String[] args) 
	{
		printA(30,"SWATI");
		printA('S');
		MethodOverloading M1= new MethodOverloading();
		M1.printA("Pune", 0);
		M1.printA();
	}
}
