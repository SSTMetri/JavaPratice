package examples;

public class AlternateCharacterToUpperCase 
{
	public static void main(String[] args) {
		String str="Automation Practice @1 2";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			String s=returnCharacter(i,str.charAt(i));
			newStr=newStr+s;
		}
		System.out.println(newStr);
	}
	
	static String returnCharacter(int index,char c) {
		if(index==0 || index%2==0) {
			if(c==' ' || c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || 
					c=='7' || c=='8' || c=='9' || c=='0' || c=='@' || c=='#') {
				return String.valueOf(c);
			}
			else {
				String s=String.valueOf(c);
				return s.toLowerCase();
			}
		}
		else if(index%2!=0) {  //0 1 2 3 4 5 
			if(c!=' ') {
				String s=String.valueOf(c);
				return s.toUpperCase();
			}
		}
		
		
		return "";
		
	}

}
