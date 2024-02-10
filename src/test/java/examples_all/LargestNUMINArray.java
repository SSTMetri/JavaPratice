package examples_all;

public class LargestNUMINArray 
{
	public static void main(String[] args) 
	{
		/*
		int[] num= {1,5,2,3,8};
		int large=Integer.MIN_VALUE;
		for(int n:num) {
			if(n>large) 
			{
				large=n;
			}
		}
		if(large!=Integer.MIN_VALUE){
			System.out.println("Max number is: "+large);
		}
		else {
			System.out.println("Invalid number");
		}
		*/
		
		int[] a= {-10,20,50,58,96,50,45};
		int large=Integer.MIN_VALUE;
		System.out.println(large);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
