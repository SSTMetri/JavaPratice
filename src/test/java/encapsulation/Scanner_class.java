package encapsulation;

import java.util.Scanner;

public class Scanner_class 
{
	public static void main(String[] args) 
	{
		Scanner ref =new Scanner(System.in);
//		try 
//		{
//		System.out.println("Scanner");
		long contact=ref.nextLong();
		System.out.println("contact"+contact);
		int num1=ref.nextInt();
		System.out.println("Number 1 :"+num1);
		double num2=ref.nextDouble();
		System.out.println("Number 1 :"+num2);
		String str=ref.next();
		System.out.println("String "+str);
		String str1=ref.nextLine();
		System.out.println("String "+str1);
//		} 
//		finally {
//			ref.close();}
		// Close the Scanner object in the finally block
	}

}
