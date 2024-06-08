package practice2;

public class StrongNumber 
{
	public static void main(String[] args) {
		int num=145,temp=num,sum=0;
		
		while(num>0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
			
		}
		
		System.out.println(sum);
		if(sum==temp) {
			System.out.println(temp+" Is Stong Number");
		} else {
			System.out.println(temp+" not strong number");
		}
		
	}

}
