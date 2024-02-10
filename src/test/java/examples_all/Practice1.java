package examples_all;

public class Practice1 
{
	public static void main(String[] args) 
	{
		int n2=10;
		int n1=7;
		System.out.println("Quotient "+n2/n1);
		System.out.println("reminder "+n2%n1);
		int count=0;
		while(n2>n1)
		{
			n2=n2-n1;
			count++;
		}
		System.out.println("q"+count);
		System.out.println("r"+n2);
		
		int a=10;
		int b=20;
		b=a+b; //10+20=30
		a=b-a; //30-10=20
		b=b-a; //30-20=10
		System.out.println(a+" "+b);
		
		int num=5;
		double f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println(f);
		
		double res=1;
		for(int i=1;i<=10;i++)
		{
			res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
		
		//FIbinoci series 0,1,1,2,3,5,8,13,21....
		int previus=0,present=1,next,num2=19;
		System.out.print(previus+" "+present+" ");
		for(int i=1;i<=num2;i++)
		{
			//0     1   1     2 3 5 
			//pre this next
			// 1   1     2   3 5
			//pre this next
			next=previus+present;
			System.out.print(next+", ");
			previus=present;
			present=next;
		}
		
		
		
	}

}
