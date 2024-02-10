package com.example.pratice;

public class StringReplace 
{
	/*
	public static void main(String[] args) {
		String s="Soubhagya";
		String str="";
		char[] ch=s.toCharArray();
		int i=0;
		if(i<ch.length) {
		if(StringReplace.even(i)==true) {
			 
			ch[i]=Character.toUpperCase(ch[i]);
			System.out.println(Character.toUpperCase(ch[i]));
			i++;
			}		
		}
		System.out.println(s+" "+str);
		
	}
	static boolean even(int num) {
		if(num==0 || num%2==0) {
			return true;
		}
		return false;
	}*/
	
    public static void main(String[] args) {
        String input = "examplestring";
        String result = makeAlternateLettersCapital(input);
        System.out.println(result);
    }

    public static String makeAlternateLettersCapital(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i += 2) {
            chars[i] = Character.toUpperCase(chars[i]);
        }

        return new String(chars);
    }

}
