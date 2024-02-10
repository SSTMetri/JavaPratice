package examples_all;

public class Palindrome1 
{
	public static void main(String[] args) 
	{
		int n=1111;
		int a=n;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+ n%10;
			n/=10;
		}
		System.out.println(rev);
		if(rev==a)
		{
			System.out.println("Palendrome");
		}
		else 
		{
			System.out.println("Not palendrome");
		}
		
		String s="testing";
		int count=0;
		char[] b=s.toCharArray();
		
		
		
		getOcurance("hello");
	
		
	}
	static final int MAX_CHAR=256;
	static void getOcurance(String str)
	{
		int count[]=new int[MAX_CHAR];
		int len=str.length();
		for(int i=0;i<len;i++)
			count[str.charAt(i)]++;
			char ch[]=new char[str.length()];			
		
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<i;j++)
			{
				if(str.charAt(i)==ch[j])
				{
					find++;
				}
				if(find==1)
				{
					System.out.println("The occurance of "+str.charAt(i)+" is: "+count[str.charAt(i)]);
				}
			}
			
		}
	}
	

}
