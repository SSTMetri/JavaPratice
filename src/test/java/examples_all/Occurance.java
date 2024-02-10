package examples_all;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Occurance 
{
	public static void main(String[] args) 
	{
		Map<Character,Integer> map=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
//		s=s.replace(" ","");
		
		for(int  i=0;i<ch.length-1;i++)
		{
			int count=1;
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			//store the charater and count
			map.put(ch[i],count);
		}
		System.out.println("Give string");
		System.out.println(map);

	}

}
