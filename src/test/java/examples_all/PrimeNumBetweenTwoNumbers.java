package examples_all;

public class PrimeNumBetweenTwoNumbers 
{
	public static void main(String[] args) 
	{
//		public  final int z1=10;
//		public static final int ti=5;
		int n1=5,n2=20;
		int small=0,large=0;
		int maxx=n1>n2 ? n1:n2;
		if(n1<n2)
		{
			small=n1;
			large=n2;
		}
		else 
		{
			small=n2;
			large=n1;
		}
		
		while(small<large)
		{
			boolean flag=false;
			for(int i = 2; i <= small/2; ++i) 
			{// condition for nonprime number
			  if(small % i == 0) 
			  {
				  flag = true;
				  break;
	          }
			}
			if(!flag && small!=0 && small!=1)
			{
				System.out.print(small +" ");
			}
			small++;
		}
		System.out.println();
		System.out.println("***********");
		
		
		
	}
	
	public void method() {
		int a=10;
	}


}
	
	
	
	
	
