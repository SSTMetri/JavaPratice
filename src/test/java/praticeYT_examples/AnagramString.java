package praticeYT_examples;

import java.util.Arrays;

public class AnagramString 
{
	public static void main(String[] args) {
		//Anagram - in given 2 strings, both contains all the characters of each
		/*
		String s1="abcd",s2="badc";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		int l1=s1.length(),l2=s2.length();
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				for(int j=0;j<l2;j++) {
					if(ch1[i]==ch2[j]) {
						System.out.print(ch1[j]);
					}
				}
			}
		}*/
		
		String s1="silent",s2="listen";
		if(s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag=true;
			for(int i=0;i<ch1.length-1;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("String is Anagram");
			}
			else {
				System.out.println("String is not an Anagram");
			}
		}
		else {
			System.out.println("Both Sting Lengths are not same");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
