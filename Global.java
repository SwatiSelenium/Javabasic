package mypackage1;

public class Global 
{
	static int a=100;
	int b=20;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		int a=50;
		System.out.println(a);
		Global g1 = new Global();
		System.out.println(g1.b);
		 g1.b=150; //updating value of non-static global variable?
		System.out.println(g1.b);
	}

}
