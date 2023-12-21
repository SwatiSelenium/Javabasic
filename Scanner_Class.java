package mypackage1;

import java.util.Scanner;

public class Scanner_Class 
{
	static void add()
	{
		Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		int c= a+b;
		System.out.println("addition is"); 
		System.out.println(c);
	//	s1.close();
	}
	
	static void subtract()
	{
		Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		int c= a-b;
		System.out.println("Subtraction is"); 
		System.out.println(c);
	//	s1.close();
	}
	
	static void multiple()
	{
		Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		int c= a*b;
		System.out.println("Multiplication is"); 
		System.out.println(c);
//		s1.close();
	}
	static void division()
	{
		Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
		int c= a/b;
		System.out.println("Division is"); 
		System.out.println(c);
		s1.close();
	} 
	public static void main(String[] args) 
	{
		add();
		subtract();
		multiple();
		division();
		//multiple();
		//s1.close();
	}
}
