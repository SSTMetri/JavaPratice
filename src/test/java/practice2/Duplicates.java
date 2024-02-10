
package practice2;

import java.util.Map;
import java.util.TreeMap;

public class Duplicates 
{
	public static void main(String[] args) 
	{
		String s="Automation";
		String str=s.toLowerCase();
		
		Map m=new TreeMap();
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{ 
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			m.put(ch[i], count);
//			System.out.println(ch[i]+" : "+count);
		}
		System.out.println(m);
		
	}

}
