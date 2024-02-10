package com.practice1.encapsulation;

public class Buffer_Builder 
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Java");
		System.out.println("String is "+sb);
		
		// modification
		// sb=sb+"hello" --> wont work for StringBuilder
		// we use APPEND METHOD present in StringBuilder
		sb.append(" Hello");
		System.out.println(sb); // here modification happend on existing reference variable
		// cofirmation, new object is not created, as careted in STRING
		
		sb.reverse();
		System.out.println(sb); // olleH avaJ
		
		
		StringBuffer str1=new StringBuffer("SQL");
		System.out.println(str1);  // SQL
		// has same features as StringBuilder
		// only toString method is over ridden in Buffer, not hashcode and equals methods
		StringBuffer s1=new StringBuffer("a");
		StringBuffer s2=new StringBuffer("a");
		System.out.println(s1.toString());  // a
		System.out.println(s2.toString());  // a
		System.out.println(s1.hashCode());  // 1239731077
		System.out.println(s2.hashCode());  // 557041912
		System.out.println(s1.equals(s2));  // false

		
	} 

}
