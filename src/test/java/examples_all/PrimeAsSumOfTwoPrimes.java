package examples_all;

public class PrimeAsSumOfTwoPrimes 
{
	public static void main(String[] args) 
	{
		int num=10;
		boolean flag=false;
		for(int i=1;i<=num/2;++i)
		{
			if(checkPrime(i))
			{
				if(checkPrime(num-i))
				{
					System.out.printf("%d + %d = %d, ",i,num-i,num);
					flag=true;
				}
			}
			else {
				System.out.println("Number is not prime");
			}
		}
		if(!flag)
			System.out.println(num +" can't be expressed as prime");
		
	} 
	static boolean checkPrime(int n)
	{			
		boolean isPrime = true;
		for(int i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				isPrime=false;
			}

		}
		return isPrime;
		
	}

}
