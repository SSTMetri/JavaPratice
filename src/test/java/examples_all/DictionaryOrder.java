
package examples_all;

public class DictionaryOrder 
{
	public static void main(String[] args) 
	{
		String[] s={"Ruby","Java","Python","C++"};
		String temp;
		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String st:s) {
			System.out.print(st+" ");
		}
		
		
	}

}
