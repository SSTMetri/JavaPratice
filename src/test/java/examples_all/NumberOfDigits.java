package examples_all;

public class NumberOfDigits 
{
	public static void main(String[] args) 
	{
		int n=123456;
		int count=0;

		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		
		//Reverse
		int n2=26359;
		int rev=0;
		while(n2>0)
		{
			int bal=n2%10;
			rev=rev*10+bal;
			n2=n2/10;
		}
		System.out.println(rev);
		
		int a=5,b=3; //a^b
		int p=1;
		while(b!=0)
		{
			p*=a;
			b--;
		}
		System.out.println(p);
		
		

	}

}
