package com.Programs.Practice;

public class LArgestNunInString 
{
	private static final char b = 0;

	public static void main(String[] args) {
		String num="1254h,8563";
		String[] numStrs = num.split(",");
		
		int largest=Integer.MIN_VALUE;  //2147483647
//		int largest=1;
		System.out.println(largest);
		
		for(String nStr:numStrs)
		{ 
			try {
				int number=Integer.parseInt(nStr);
				if(number>largest)
				{
					largest=number;
				}
			}catch(NumberFormatException e)
			{
				System.out.println("Invalid number: "+nStr);
			}
		}
		
		String st="45,78956,7452,852";
		String[] ar = st.split(",");
		int l=Integer.MIN_VALUE;
		for(String s:ar)
		{
			try {
				int n1=Integer.parseInt(s);
				if(n1>l)
				{
					l=n1;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(l!=Integer.MIN_VALUE)
		{
			System.out.println(l);
		} 
		else {
			System.out.println("Invalid");
		}
		
		
		System.out.println();
		String s="Shana";
		char[] ch = s.toCharArray();
		StringBuffer str=new StringBuffer();
		StringBuffer str1=new StringBuffer("Rama");

		System.out.println(str1.reverse());
		for(int i=ch.length-1;i>=0;i--)
		{
			str.append(ch[i]);
		}
		System.out.println(str);
		
		char chh;
		String revv ="";
		for(int i=0;i<s.length();i++)
		{
			chh=s.charAt(i);
			revv=chh+revv;
		}
		System.out.println(revv);
		
		
		System.out.println("****");
		char input=2;
		switch(input)
		{
			case 'a': System.out.println("a");
			break;
			case 2: System.out.println("b");
			break;
			default : System.out.println("default");
			break;
		}
			
	}

}
