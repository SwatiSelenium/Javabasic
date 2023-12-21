package mypackage1;

public class NestedIf 
{
	public static void main(String[] args) 
	{
		int a=92;
		if(a>18)
		{
			if(a>60)
			{	
				System.out.println("You are Sr. Citizen");
			}
			else
			{
				System.out.println("You are still young");
			}
		}
		else
		{
			System.out.println("You are a minor");
		}
		
	}
}
