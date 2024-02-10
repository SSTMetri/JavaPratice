package examples;

public class Parse_Method 
{
	public static void main(String[] args) {
		String s1="8545";
		System.out.println(s1);
		int r1=Integer.parseInt(s1);
		System.out.println(r1);
		
		String s2="23.36584";
		System.out.println(s2);
		double r2=Double.parseDouble(s2);
		System.out.println(r2);
		
		float r3=Float.parseFloat(s2);
		System.out.println(r3);
	}

}
