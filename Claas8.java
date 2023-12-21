package mypackage1;

public class Claas8 
{
	void add()
	{
		System.out.println("non static method");
	}
	
	static void add(int a)
	{
		System.out.println("static method");
	}
	
	Claas8()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) 
	{
		add(7);  // static method can be called directly
		Claas8 C1= new Claas8();
		C1.add();  
	}
}
