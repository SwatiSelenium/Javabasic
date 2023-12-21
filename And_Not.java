package mypackage1;

public class And_Not {

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		if(a<b && b>150)
		{
			System.out.println("if block");
		}
		if(a<b || b>150)
		{
			System.out.println("if block2");
		}
		if(!(a>b && b>150))
		{
			System.out.println("if block3");
		}
		if(!(a>b || b<150))
		{
			System.out.println("if block4");
		}

	}

}
