package examples;

public class CountOfCharacters 
{
	public static void main(String[] args) 
	{
		String str="Automation";
		System.out.println(str.charAt(1)+" ****");
		String str1=str.toLowerCase();
		char[] ch=str1.toCharArray();
		int length=ch.length;
		System.out.println(length);
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
		
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(ch[i]+" "+count);
		}
		
//		-----------------------------------------------
		
		StringBuilder rev =new StringBuilder();
		
		for(int i=length-1;i>=0;i--)
		{
			rev.append(ch[i]);
		}
		
		System.out.println(rev.toString());
		
		
		
		System.out.println("***********");
		String st="AutomationTester";
		String s=st.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println("Character '"+s.charAt(i)+"' occurance is : "+count);
			}
		}
		
		String s1="Tester";
		String[] sCh = s1.split("");
		for(String sh:sCh)
		{
			System.out.println(sh);
		}
	}

}
