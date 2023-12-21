package mypackage1;

public class Constructor 
{
	Constructor()
	{
		System.out.println("constructors are always non static");
	}
	Constructor(int a)
	{
		System.out.println("calling parameterised constructor");
	}
	public static void main(String[] args) 
	{
		Constructor C1=new Constructor(50);	
		new Constructor();
		System.out.println("learning Constructor");
		Constructor C2=new Constructor();
	}
}
