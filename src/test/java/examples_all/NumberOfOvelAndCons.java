package examples_all;

public class NumberOfOvelAndCons 
{
	public static void main(String[] args) 
	{
		String s="Acer Laptop4512";
		int ovel=0,conso=0,digits=0,character=0,space=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				ovel++;
			}
			else if(ch>='0' && ch<='9')
			{
				digits++;
			}
			else if(ch==' ')
			{
				space++;
			}
			else
			{
				conso++;
			}
		}
		System.out.printf("Ovels count : %d, consonenats count : %d, digits : %d, spaces : %d",ovel,conso,
				digits,space);
		
	}

}
