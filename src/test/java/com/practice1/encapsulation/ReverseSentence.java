package com.practice1.encapsulation;

import java.util.Scanner;

public class ReverseSentence 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence");
		String str=s.nextLine();
		String[] arr=str.split(" ");
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			if(i!=0) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
