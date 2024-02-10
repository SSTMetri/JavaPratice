package examples_all;

public class Struing_CLass 
{
	public static void main(String[] args) 
	{
		String s="I * learn * java";
		System.out.println(s.replaceAll("\\*",",")); 
		
		String s1="aab        ,ghj,ghjk b";
		String s2="BBcc";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		int number=5;
		String result = String.format("Hexadecimal Number: %x", number);  // 1e
		System.out.println(result);
		 
		String spl="a,b,c,d,e";
		String[] sp1 = spl.split(",");
		for(String spp:sp1)
		{
			System.out.print(spp);
		}
		System.out.println("**********");
		System.out.println(s1.valueOf("1"));
		
		String a="abc";
		String b="abc";
		System.out.println(a==b);
		
		String subStr="Java Java is easy";
		boolean sub=subStr.contains("Java");
		System.out.println(sub);
		
		String sub1=subStr.substring(1,6);
		System.out.println(sub1);
		
		String rp = subStr.replace("a","z");
		System.out.println(rp);
		
		String rp1 = subStr.replaceAll("ava","python");
		System.out.println(rp1);
		
		String rp2 = subStr.replaceFirst("Java","C++");
		System.out.println(rp2);
		
		boolean b1=true;
		char ch='a';
		int in=85;
		float fl=5.682f;
		double db=85.36;
		System.out.printf("%s , %b but %c, %d integer, %e floating point, %f floating point \n",subStr,b1,ch,in,db,fl);
		
		char[] charArray=subStr.toCharArray();
		for(char ch1:charArray)
		{
			System.out.print(ch1+" ");
		}
		
		// Using StringBuilder (recommended for single-threaded scenarios)
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append("world!");
		String result1 = sb.toString();

		// Using StringBuffer (thread-safe but potentially slower in single-threaded scenarios)
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello, ");
		stringBuffer.append("world!");
		String result2 = stringBuffer.toString();
		System.out.println("\n"+result1+" "+result2);

	}

}
