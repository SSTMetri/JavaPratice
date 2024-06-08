package asked_Question;

public class GlobalLPractice 
{
//	public static void main(String[] args) {
//		String str="a2b3c4";  // O/p=aabbbccc
//		String output=expandString(str);
//		System.out.println(output);
//		
//		String s="5";
//		System.out.println(Character.getNumericValue(s.charAt(0)));
//	}
//	static String expandString(String str) {
//		StringBuilder result=new StringBuilder();
//		for(int i=0;i<str.length();i+=2) {
//			char character=str.charAt(i);
//			int repeat=Character.getNumericValue(str.charAt(i+1));
//			for(int j=0;j<repeat;j++) {
//				result.append(character);
//			}
//		}
//		return result.toString();
//    }
	
	public static void main(String[] args) {
		String str="a1b2c3d4e5";
		String op=patternString(str);
		System.out.println(op);
	}
	
	static String patternString(String s) {
		StringBuffer res=new StringBuffer();
		for(int i=0;i<s.length();i+=2) {
//			char character=
			int repeat=Character.getNumericValue(s.charAt(i+1));
			for(int j=0;j<repeat;j++) {
				res.append(s.charAt(i));
			}
		}
		return res.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
