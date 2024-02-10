package examples_all;

public class OccuranceOfhar
{
	public static void main(String[] args) 
	{
		 String text = "Hello, world!";
	        char targetChar = 'o';
	        
	        int occurrenceCount = StringUtil.countOccurrences(text, targetChar);
	        
	        System.out.println("The character '" + targetChar + "' occurs " + occurrenceCount + " times in the string.");
		
	}
} 

	class StringUtil {
	    public static int countOccurrences(String input, char targetChar) 
	    {
	        int count = 0;
	        char[] arr = input.toCharArray();
	        for (char c : arr) 
	        {
	            if (c == targetChar) 
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	}



