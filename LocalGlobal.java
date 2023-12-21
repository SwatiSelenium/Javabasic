package mypackage1;
public class LocalGlobal 
{	int a;
	double b=9.76;
	String c;
	void local(int a, double b, String c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		LocalGlobal l1=new LocalGlobal();
		l1.local(45, 5.6, "Pune");
		System.out.println(l1.b);
		System.out.println(l1.a);
		System.out.println(l1.c);
	}
}
