package com.Programs.Practice;


class First {
	int i=10;
	public First(int j) {
		System.out.println(i);
		this.i =j*10;
		System.out.println(i);
	}
}
class Second extends First {
	public Second(int j) {
		super(j);
		System.out.println(i);
		this.i =j*20;
		System.out.println(this.i);
	}
}
public class IandJ 
{
	public static void main(String[] args) {
		Second n=new Second(20);
		System.out.println(n.i);
		System.out.println("****");
		
		
		String s="75421";
		int y=Integer.parseInt(s);
		System.out.println(s);
		System.out.println(y);
		int n1=11,n2=20,max,min;
		max=(n1>n2) ? n1:n2;
		min=(n1<n2) ? n1:n2;
		
		System.out.println(max+" "+min);
		
		String str = null;
		System.out.println(str.valueOf(101));
		System.out.println(str.valueOf(min));
		System.out.println(str);
		int x = 5;
		int y1 = 7;
		System.out.println(x & y1);
		System.out.println(x | y1);
		System.out.println(x ^ y1);
		
		System.out.println(n.hashCode());
	} 

}
