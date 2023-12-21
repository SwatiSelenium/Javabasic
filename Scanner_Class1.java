package mypackage1;

import java.util.Scanner;

public class Scanner_Class1 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a1");
		int a1= s1.nextInt();
		System.out.println("enter the value of a2");
		int a2= s1.nextInt();
		int c= a1+a2;
		System.out.println("Addition is :");
		System.out.println(c);
	}
}
