package encapsulation;

public class String_methods {
	public static void main(String[] args) {
		String s1="HeLLo, Java Leanrning";
		System.out.println(s1.length());  // 21
		char x=s1.charAt(4);  
		System.out.println(x);  // o
		System.out.println(s1.charAt(2));  // L
		char [] ch=s1.toCharArray();
		System.out.println(ch);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
//		int x=s1.indexOf('e');
		System.out.println(s1.indexOf('L'));  //2
		System.out.println(s1.indexOf('L',5));  //12
		
		System.out.println(s1.substring(5));  // , Java Leanrning
		System.out.println(s1.substring(5,13));  // , Java L
		
		String [] str=s1.split("J");
		System.out.println(str);
		
		// Count without .length()
		int count=0;
		for(int j=0;j<=s1.length()-1;j++)
		{
			count++;
		}
		System.out.println(count);  // 21
		
		// Reverse String s1
		int len=(s1.length()-1);
		String reverse="";
		for(int i=len;i>=0;i--)
		{
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
	}
}
