package practice2;

public class NearestPallendrome 
{
    public static void main(String[] args) {
        int number = 12345;
        int nearestPalindrome = findNearestPalindrome(number);
        System.out.println("Nearest palindrome to " + number + " is: " + nearestPalindrome);
    }

    public static int findNearestPalindrome(int num) {
        while (true) {
            if (isPalindrome(num)) {
                return num;
            }
            num++;
        }
    }
 
    public static boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        int length = strNum.length();

        for (int i = 0; i < length / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
