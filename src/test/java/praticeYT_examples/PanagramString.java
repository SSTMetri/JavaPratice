package praticeYT_examples;

public class PanagramString 
{
	public static void main(String[] args) {
		String s="qwertyuiopasdfgjkklzxcvbnm";
		boolean flag=false;
		boolean res=isCharPreset(s);
		if(res==true) {
			System.out.println("All characters are present");
		} else {
			System.out.println("All characters are not prsent");
		}
		
	}
	static boolean isCharPreset(String str) {
		 // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();
        
        // Create a boolean array to track the presence of each letter
        boolean[] letterPresent = new boolean[26];
        
        // Iterate through the string and mark the corresponding index
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letterPresent[ch - 'a'] = true;
            }
        }
        
        // Check if all elements in the boolean array are true
        for (boolean present : letterPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
	}

}
