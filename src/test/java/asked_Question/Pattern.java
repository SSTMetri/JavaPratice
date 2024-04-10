package asked_Question;

import java.util.Scanner;

public class Pattern 
{
	public static void main(String[] args) {
		/*
		 * 1
		 * 2*2
		 * 3*3*3
		 * 3*3*3
		 * 2*2
		 * 1
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.println(j);
                if (j < i) {
                    System.out.print("*");
                }
			}
			for(int j=i-1;i<=n;j++) {
				System.out.print("*" + j);
			}
			System.out.println();
		}
	}

}
