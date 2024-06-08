
package examples_all;

import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfChar 
{
	public static void main(String[] args) 
	{
		String str="dfghdfghfgh";
		char ch='d';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
		String s="SStringg";
		String low = s.toLowerCase();
		char[] a=low.toCharArray();
		Map m=new TreeMap();
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			m.put(a[i],c);
		}
		System.out.println(m);
		
	}

}
