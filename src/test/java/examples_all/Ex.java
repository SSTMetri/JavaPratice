
package examples_all;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex 
{

		public static void main(String[] args){

		String str1 = "mohammed_AKK";

		String str2 = new String(str1);

		System.out.println((str1==str2)+" "+(str1.equals(str2)));
		
		    int result = calculate(5, 0);
		    System.out.println(result);
		  }

		  static int calculate(int x, int y) {
		    try {
		      return x / y;
		    } catch (ArithmeticException e) {
		      return -1;
		    } finally {
		      return 0;
		    }
		  }
	/*
	public static void main(String[] args) {
		String regex = "[a-c]";
		String input = "abcABC";
		System.out.println(regex);
		Pattern pattern = Pattern.compile(regex);
		System.out.println(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
		System.out.print(matcher.group() + " ");
		}
		if(System.out.printf("Hey! ") == null) {}
		for(int i = 1; i < 2; System.out.println("Hello World."))
		{
		i++;
		}
		System.out.println(1 + 2 + "3" + 4 + 5);
		*/

		 
		  
}
