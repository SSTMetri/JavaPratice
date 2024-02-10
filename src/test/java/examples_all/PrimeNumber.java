package examples_all;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int num=7;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{ 
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Num is not prime");
		}
		else
		{
			System.out.println("Num is prime");
		}
		
	}

}
