package examples_all;

public class LargetsNumInString 
{
	public static void main(String[] args) 
	{
		/*
		String num="1254h,8563";
		String[] numStrs = num.split(",");
		
		int largest=Integer.MIN_VALUE;  //2147483647
//		int largest=1;
		System.out.println(largest);   //-2147483648
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
		if(largest!=Integer.MIN_VALUE) {
			System.out.println("Largest num is: "+largest);
		}else {
			System.out.println("No valid numbers founf is the string");
		}
		
		/*
		String s="741,852";
		String[] split = s.split(",");
		int large=Integer.MIN_VALUE;
		for(String n:split) {
			try {
				int nu=Integer.parseInt(n);
				System.out.println(nu+" , "+n);
				if(nu>large)
				{
					large=nu;
				}
			}catch(NumberFormatException e) {
				System.out.println("Invalid number: "+n);
			}
		}
		
		if(large!=Integer.MIN_VALUE) {
			System.out.println("Largest number is: "+large);
		}else
		{
			System.out.println("No large number");
		}*/
		
		
		

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
		System.out.println(l);
		
		
		
		
		
		
		
		
		
	}

}
