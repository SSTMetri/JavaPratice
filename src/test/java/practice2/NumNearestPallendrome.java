package practice2;

public class NumNearestPallendrome 
{
	public static void main(String[] args) {
		int num=124555;
		isPal(num);
		
	}
	public static void isPal(int num) {
		int Rnum=num;
		
		while(palendrome(Rnum)==false) {
			Rnum--;
		}
		
		
		int Pnum=num;
		while(palendrome(Pnum)==false) {
			Pnum++;
		}
		
		if((num-Rnum)>(Pnum-num)) {
			System.out.println(Pnum);
		} else {
			System.out.println(Rnum);
		}
		
	}
	public static boolean palendrome(int n) {
		
		int rev=0;
		int m=n;
		
		while(m!=0) {
			rev = rev*10 + m%10;
			m/=10;
		}
		 
		if(rev==n) {
			return true;
		} else {
			return false;
		}
		
	}

}
