package patters;

import java.util.Scanner;

public class PatternLetters 
{
	/*
	 * A B C 
	 * A B C 
	 * A B C 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        	char ch='A';
            for (int j = 1; j <= n; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
	}

}
