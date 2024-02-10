package examples_all;

public class assendingOrder 
{
	public static void main(String[] args) 
	{
		
		int[] n= {8,9,5,2,1,8,7,4,5,3};
		int temp,b,c;
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]>n[j])
				{
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		for(int x:n)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		
		int[] a= {1,2,5,6,3,7,9,5};
		for(int i=0;i<a.length-1;i++)
		{
			int t;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;				}
			}
		}
		for(int r:a)
		{
			System.out.print(r+" ");
		}
		
	}

}
