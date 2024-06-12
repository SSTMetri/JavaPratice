package praticeYT_examples;

public class RevStringSwaping 
{
	public static void main(String[] args) {
		String s="Hello";
		int len=s.length();
		char[] ch=s.toCharArray();
		int f=0,l=s.length()-1;
		char temp = 0;
		while(f<=l) {
			temp=ch[f];
			
			ch[f]=ch[l];
			ch[l]=temp;
			f++;
			l--;
		}
		for(char c:ch) {
			System.out.print(c);
		}
	}

}
