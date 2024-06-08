package practice2;

public class Amstrong 
{
	public static void main(String[] args) {
		int n=153,temp=n;
		//1^3+5^3+3^3 =1+125+27=153
		double sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+Math.pow(rem, 3);
			n/=10;
		}
		if(temp==sum) {
			System.out.println(temp+" Amstrong");
		} else {
			System.out.println(temp+" not amstring");
		}
	}

}
