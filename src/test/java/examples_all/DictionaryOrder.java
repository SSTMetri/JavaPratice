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
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
		for(String st:s) {
			System.out.print(st+" ");
		}
		System.out.println();
		String[] st= {"Java","PYTHON","C++","Ruby"};
		String t="";
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].compareTo(st[j])<1)
				{
					t=st[i];
					st[i]=st[j];
					st[j]=t;
				}
			}
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" , ");
		}
		
	}

}
