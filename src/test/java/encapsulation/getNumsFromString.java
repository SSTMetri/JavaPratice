package encapsulation;

import java.util.Scanner;

public class getNumsFromString 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String nstr="0123456789";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(nstr.indexOf(str.charAt(i))!=-1) {
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);

			
			
			
			
	}
	

}
