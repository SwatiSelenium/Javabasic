package mypackage1;

import java.util.Scanner;

public class Scanner_Class2 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		byte a1= s1.nextByte();
		long a2= s1.nextLong();
		boolean a3= s1.nextBoolean();
	s1.close();
	} 
}
