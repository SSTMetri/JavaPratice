package examples_all;

public class Split 
{
	public static void main(String[] args) {
		String s="Java,Selenium,TestNG,Maven";
		String[] str = s.split(",");
		for(String st:str)
		{
			System.out.println(st);
		}
		 
		String str1="abc";
		String str3="pqr";
		String str2="xyz";
		System.out.println(str1+" "+str2+" "+str3);
		
		String str4=str1.concat(str2);
		String str5=str4.concat(str4);
		System.out.println(str5);

	}

}
