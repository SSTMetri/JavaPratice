package encapsulation;

public class String_Class 
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		System.out.println(s1); // Hello
		
		String s2=new String();
		
		String s3=new String("Java");
		System.out.println(s3);  // Java
		
		char[] ch= {'a','b','c','d'};
		String s4=new String(ch);
		System.out.println(s4.hashCode());  // 2987074
		System.out.println(s4); // abcd
		
		
		String v1="development";
		System.out.println(v1.hashCode());  // 99349
		System.out.println(v1.toString());  // development
		String v2="A";
		System.out.println(v2.hashCode());  // 65
		System.out.println(v2.toString());  // A
		 
		String v3=new String("Testing");
		System.out.println(v3.toString());  // Testing
		
		String v4=new String("A");
		System.out.println(v4.equals(v2)); // true
		String v5="development";
		boolean res=v1.equals(v5);
		System.out.println(res);  // true
		
		
	}

}
