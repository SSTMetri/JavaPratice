package com.Programs.Practice;

public class NearestPallendromeSTRING 
{
	
	public static void main(String[] args) {
		int num=1526;
		closestPalindrome(num);
	}
	
	static void closestPalindrome(int num) {
		int RPnum=num-1;
		while(isPalindrome(Integer.toString(RPnum))==false) {
			RPnum--;
		}
		
		int SPnum=num+1;
		while(isPalindrome(Integer.toString(SPnum))==false) {
			SPnum++;
		}
		
		if(Math.abs(num-RPnum)<Math.abs(num-RPnum)) {
			System.out.println(RPnum);
		} else {
			System.out.println(SPnum);
		} 
		
	}
	
	static boolean isPalindrome(String s) {
		
//		StringBuffer str=new StringBuffer(s);
//		str.reverse();
		
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
		
	}
	
	/*
	
	// Function to check Palindrome
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
 
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
 
    // Function return closest Palindrome number
    public static void closestPalindrome(int num)
    {
 
        // Case1 : largest palindrome number
        // which is smaller to given number
        int RPNum = num - 1;
 
        while (isPalindrome(Integer.toString(RPNum))
               == false) {
            RPNum--;
        }
 
        // Case 2 : smallest palindrome number
        // which is greater than given number
        int SPNum = num + 1;
 
        while (isPalindrome(Integer.toString(SPNum))
               == false) {
            SPNum++;
        }
 
        // Check absolute difference
        if (Math.abs(num - SPNum) < Math.abs(num - RPNum)) {
            System.out.println(SPNum);
        }
        else
            System.out.println(RPNum);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int n = 125221;
 
        closestPalindrome(n);
    }*/

 
	
	
	
	
	
	
	
	

}