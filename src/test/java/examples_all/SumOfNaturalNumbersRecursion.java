package examples_all;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SumOfNaturalNumbersRecursion 
{
	public static void main(String[] args) 
	{
		int num=50;
		int res=addNum(num);
		System.out.println(res);
		
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat f=new SimpleDateFormat("dd-mm-yyyy");
		String date=f.format(d);
		System.out.println(date);
		
	} 
	static int addNum(int n)
	{
		if(n!=0)
			return n+addNum(n-1);
		else
			return n;
	}

}
