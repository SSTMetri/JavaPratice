package com.practice1.encapsulation;


class Pack
{
}
class Person
{
}
class Froad
{
	public int hashcode()
	{
		return 1;
	}
	public String toString()
	{
		return "Valid input";
	}
}

public class Hash_code 
{
	public static void main(String[] args) {
		Person obj=new Person();
		System.out.println(obj);  // com.practice1.encapsulation.Person@1d251891
		System.out.println("user1 "+obj); // user1 com.practice1.encapsulation.Person@1d251891
		
		String opt=obj.toString();
		System.out.println(opt);  // com.practice1.encapsulation.Person@1d251891
		long a=obj.hashCode();
		System.out.println(a); // 488970385
		
		System.out.println();
		
		Person obj1=new Person();
		String opt1=obj1.toString();  
		System.out.println(opt1);  // com.practice1.encapsulation.Person@2133c8f8
		long b=obj1.hashCode();
		System.out.println(b);  // 557041912
		System.out.println();
		System.out.println(obj==obj1);  // false
		
		Froad val=new Froad();
		System.out.println("USer +"+val);  // USer +Valid input
		String opt3=val.toString(); 
		System.out.println("User3 "+opt3);  // User3 Valid input
		System.out.println(opt3); // Valid input
		int hash=val.hashcode(); 
		System.out.println("User3 "+hash);  // User3 1
		System.out.println(hash);  // 1
		
		String toStr1=val.toString();
		System.out.println(toStr1);
		
		Froad vall=new Froad();
		String opt4=vall.toString(); // 1
		System.out.println("User4 "+opt4);
		int val2=vall.hashcode();  // Valid input
		System.out.println(val2);		
		System.out.println(hash==val2); //true
		
		Pack p1=new Pack();
		int p2=p1.hashCode();
		System.out.println("User1+"+p2); //User1+1435804085


	}

}
