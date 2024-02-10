package examples_all;

public class PrimeNumUsingFunction 
{
	public void prime(int n1,int n2)
	{
		int low,high;
		if(n1>n2){
			low=n2;
			high=n1;
		}
		else{
			low=n1;
			high=n2;
		}
		while(low<=high)
		{ 
			boolean flag=false;
			for(int i=2;i<=low/2;i++){
				if(low%i==0){
					flag=true;
					break;
				}
			}
			if(!flag && low!=0 && low!=1)
			{
				System.out.print(low+" ");
			}
		low++;
	}
	}
	public static void main(String[] args) 
	{
		PrimeNumUsingFunction p=new PrimeNumUsingFunction();
		p.prime(10,20);
		
	}

}
