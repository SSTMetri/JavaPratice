package examples_all;

public class ReplaceRepeatingCharacters 
{
	    public static void main(String[] args) {
	        String input = "aaavvffffffgtttt";
	        String result = replaceRepeatingCharacters(input);
	        System.out.println(result);
	    }

	    public static String replaceRepeatingCharacters(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        } 

	        StringBuilder result = new StringBuilder();
	        char currentChar = input.charAt(0);
	        int count = 1;

	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == currentChar) {
	                count++;
	            } else {
	                result.append(currentChar);
	                if (count > 1) {
	                    result.append(count);
	                }
	                currentChar = input.charAt(i);
	                count = 1;
	            }
	        }

	        // Append the last character and its count
	        result.append(currentChar);
	        if (count > 1) {
	            result.append(count);
	        }

	        return result.toString();
	    }



}
