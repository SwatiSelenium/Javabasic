package mypackage1;

public class Local_Global 
{
	static int a=500 ;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		a=200;
		int b=100;
		System.out.println(a);
		add();
		System.out.println(b);
	}
	static void add()
	{
		System.out.println(a);
	}
}
