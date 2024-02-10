package com.example.pratice;

public class StringClass 
{
	public static void main(String[] args) {
		String s1=new String("Automation");
		String s2=new String("Automation");
		if(s1==s2) {
			System.out.println(true);
		} else {
			System.out.println("Exception");
		}
		
		String s3="abc";
		String s4="abc";
		if(s3==s4) {
			System.out.println(true);
		} else {
			System.out.println("Exception");
		}
		
		try {
			System.out.println("First");
			int num=45/3;
			System.out.println(num);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("Last");
		
	}

}
