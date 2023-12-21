package mypackage1;
public class Main_Overloading 
{
	void main()
	{
		System.out.println("2");
	}
	void main(int a)
	{
		System.out.println("1");
	}
	public static void main(String[] args) 
	{
		System.out.println("3");
		Main_Overloading m1=new Main_Overloading();
		m1.main(56);
		m1.main();
	}
}
