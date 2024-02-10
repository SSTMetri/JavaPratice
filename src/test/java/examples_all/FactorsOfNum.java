
package examples_all;

public class FactorsOfNum 
{
	public static void main(String[] args) 
	{
		int num=7;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}  
		System.out.println();
		int n=50;
		int[] arr={0};
		
		for(int i=1;i<(n/2);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
