package examples_all;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String s="abcba",rev="";
		s.length();
		for(int i=s.length()-1;i>=0;--i)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("Given string \""+ s +"\" is palendrome");
		}
		
		else 
		{
			System.out.println("Not a palendrome");
		}
		
		long num=78963214862L;
		long rv=0L;
		int count = 0;
		while(num!=0)
		{
			rv=rv*10 + num%10;
			count++;
			num/=10;
		}
		if(num==rv)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
		
	}

}
