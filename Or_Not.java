package mypackage1;

public class Or_Not 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=50;
		if(a<b && b>150)
		{
			System.out.println("if block");
		}
		if(a>b || b>150)
		{
			System.out.println("if block2");
		}
		if(!(a<b && b<150))
		{
			System.out.println("if block3");
		}
		if(!(a>b || b<150))
		{
			System.out.println("if block4");
		}
		System.out.println("none of the if block got executed");
	}
}
