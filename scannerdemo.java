package mypackage1;

import java.util.Scanner;

public class scannerdemo 
{
	static void test()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("entr a");
		int a = s1.nextInt();
		System.out.println("entr b");
		int b = s1.nextInt();
		System.out.println("add is");
		int c = a+b;
		System.out.println(c);
		try
		{
			
		}
		catch (InputMismatchException a1)
		{
			System.out.println("input mismatch exception");
		}
	}
	public static void main(String[] args) 
	{
	//	scannerdemo s2 = new scannerdemo();
		test();
	}

}
